package by.hotelsmenegment.yemialyanava.mappers;

import by.hotelsmenegment.yemialyanava.dto.*;
import by.hotelsmenegment.yemialyanava.models.Hotel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class HotelMapper {
    private AddressMapper addressMapper;
    private ContactsMapper contactsMapper;
    private ArrivalTimeMapper arrivalTimeMapper;

    public HotelDto toDto(Hotel hotel) {

        String addressString = addressMapper.toStringAddress(hotel.getAddress());
        String contactsString = contactsMapper.toDtoString(hotel.getContacts());

        return HotelDto.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .description(hotel.getDescription())
                .address(addressString)
                .phone(contactsString)
                .build();
    }

    public HotelDtoBig toDtoBig(Hotel hotel) {

        AddressDtoBig addressDtoBig = addressMapper.toDtoBig(hotel.getAddress());
        ContactsDtoBig contactsDtoBig = contactsMapper.toDtoBig(hotel.getContacts());
        ArrivalTimeDtoBig arrivalTimeDtoBig = arrivalTimeMapper.toDtoBig(hotel.getArrivalTime());

        HotelDtoBig hotelDtoBig = HotelDtoBig.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .brand(hotel.getBrand())
                .address(addressDtoBig)
                .contacts(contactsDtoBig)
                .arrivalTime(arrivalTimeDtoBig)
                .build();
        if (hotel.getAmenities() != null && !hotel.getAmenities().isEmpty()){
            hotelDtoBig.setAmenities(hotel.getAmenities());
        }
        return hotelDtoBig;
    }
}
