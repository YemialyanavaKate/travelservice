package by.hotelsmenegment.yemialyanava.controller;

import by.hotelsmenegment.yemialyanava.dto.HotelDto;
import by.hotelsmenegment.yemialyanava.dto.HotelDtoBig;
import by.hotelsmenegment.yemialyanava.mappers.HotelMapper;
import by.hotelsmenegment.yemialyanava.models.Hotel;
import by.hotelsmenegment.yemialyanava.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/property-view")
public class HotelController {
    private final HotelService hotelService;
    private final HotelMapper hotelMapper;

    @GetMapping("/hotels")
    public List<HotelDto> readAll() {
        return hotelService.findAll().stream().map(hotelMapper::toDto).toList();
    }

    @GetMapping("/hotels/{id}")
    public HotelDtoBig read(@PathVariable(name = "id") Integer id) {
        return hotelMapper.toDtoBig(hotelService.findById(id));
    }

    @GetMapping("/search")
    public List<HotelDto> search(@RequestParam(required = false) String name,
                                 @RequestParam(required = false) String brand,
                                 @RequestParam(required = false) String city,
                                 @RequestParam(required = false) String country,
                                 @RequestParam(required = false) String amenities) {
        return hotelService.findAllByKeywordIgnoreCase(name, brand, city, country, amenities).stream().map(hotelMapper::toDto).toList();
    }

    @PostMapping("/hotels")
    public HotelDto create(@RequestBody Hotel hotel) {
        return hotelMapper.toDto(hotelService.create(hotel));
    }

    @PostMapping("/hotels/{id}/amenities")
    public void addAmenities(@PathVariable(name = "id") Integer id, @RequestBody List<String> amenities) {
        hotelService.addAmenities(id, amenities);
    }

    @GetMapping("/histogram/{param}")
    public Map<String, Integer> histogram(@PathVariable String param) {
        return hotelService.findHistogram(param);
    }
}
