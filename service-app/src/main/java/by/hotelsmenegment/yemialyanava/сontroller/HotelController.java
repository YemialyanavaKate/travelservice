package by.hotelsmenegment.yemialyanava.сontroller;

import by.hotelsmenegment.yemialyanava.dto.AddressDto;
import by.hotelsmenegment.yemialyanava.dto.ContactsDto;
import by.hotelsmenegment.yemialyanava.dto.HotelDto;
import by.hotelsmenegment.yemialyanava.models.Hotel;
import by.hotelsmenegment.yemialyanava.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/property-view")
public class HotelController {
    private final HotelService hotelService;

    @PostMapping("/hotels")
    public HotelDto create(){
        return new HotelDto(1,"DoubleTree by Hilton Minsk", "sdfg", "zxdf");
    }
   /* @GetMapping ("/hotels")
    public HotelDto read(){
        return new HotelDto(
                1,"Star", "sdfg", "zxdf"
                //, new AddressDto(), new ContactsDto()
        );

    }*/

    @GetMapping ("/hotels")
    public List<Hotel> readAll() {
        return hotelService.findAll();
    }
}
