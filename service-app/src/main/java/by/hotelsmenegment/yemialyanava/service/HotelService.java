package by.hotelsmenegment.yemialyanava.service;

import by.hotelsmenegment.yemialyanava.models.Hotel;
import by.hotelsmenegment.yemialyanava.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public List<Hotel> findAll(){
        return hotelRepository.findAll();
    }

    public Hotel findById(Integer id){
        return hotelRepository.findById(id).orElseThrow(()-> new NoSuchElementException(String.format("Hotel with number: %s not found", id)));
    }

    public List<Hotel> findAllByKeywordIgnoreCase(String name, String brand) {
        return hotelRepository.search(name, brand);
    }


    @Transactional
    public Hotel create(Hotel hotel){
        return hotelRepository.save(hotel);
    }

}
