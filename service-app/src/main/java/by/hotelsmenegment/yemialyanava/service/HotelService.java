package by.hotelsmenegment.yemialyanava.service;

import by.hotelsmenegment.yemialyanava.models.Hotel;
import by.hotelsmenegment.yemialyanava.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    public Hotel findById(Integer id) {
        return hotelRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Hotel with number: %s not found", id)));
    }

    public List<Hotel> findAllByKeywordIgnoreCase(String name, String brand, String city, String country, String amenities) {
        return hotelRepository.search(name, brand, city, country, amenities);
    }

    @Transactional
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Transactional
    public void addAmenities(Integer id, List<String> amenities){
        Hotel hotel = hotelRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Hotel with number: %s not found", id)));
        hotel.setAmenities(amenities);
    }

    public Map<String, Integer> findHistogram(String param) {
        Map<String, Integer> histogram = new HashMap<>();

        switch (param.toLowerCase()) {
            case "brand":
                List<String> brands = hotelRepository.countByBrand();
                histogram = listToMap(brands);
                break;
            case "city":
                List<String> city = hotelRepository.countByCity();
                histogram = listToMap(city);
                break;
            case "country":
                List<String> country = hotelRepository.countByCountry();
                histogram = listToMap(country);
                break;
            case "amenities":
                List<String> amenities = hotelRepository.countByAmenities();
                histogram = listToMap(amenities);
                break;
        }
        return histogram;
    }

    public static Map<String, Integer> listToMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            map.put(str, map.getOrDefault(str, 0) + 1);        }
        return map;
    }

}
