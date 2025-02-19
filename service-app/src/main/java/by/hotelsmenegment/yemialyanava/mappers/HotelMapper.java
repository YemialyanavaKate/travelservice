package by.hotelsmenegment.yemialyanava.mappers;

import by.hotelsmenegment.yemialyanava.dto.HotelDto;
import by.hotelsmenegment.yemialyanava.dto.HotelDtoBig;
import by.hotelsmenegment.yemialyanava.models.Hotel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class HotelMapper {
    public HotelDto toDto(Hotel hotel){

        return HotelDto.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .description(hotel.getDescription())
                .build();
    }

    public Hotel toEntity(HotelDto hotelDto){

        return Hotel.builder()
                .id(hotelDto.getId())
                .name(hotelDto.getName())
                .description(hotelDto.getDescription())
                .brand(null)
                .build();
    }

    public HotelDtoBig toDtoBig(Hotel hotel){

        return HotelDtoBig.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .brand(hotel.getBrand())
                .build();
    }
}
