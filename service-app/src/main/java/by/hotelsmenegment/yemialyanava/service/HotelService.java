package by.hotelsmenegment.yemialyanava.service;

import by.hotelsmenegment.yemialyanava.models.Hotel;
import by.hotelsmenegment.yemialyanava.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public List<Hotel> findAll(){
        return hotelRepository.findAll();
    }
}
