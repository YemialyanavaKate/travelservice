package by.hotelsmenegment.yemialyanava.mappers;

import by.hotelsmenegment.yemialyanava.dto.AddressDtoBig;
import by.hotelsmenegment.yemialyanava.models.Address;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AddressMapper {
    public String toStringAddress(Address address) {
        return address.getHouseNumber() + " " + address.getStreet() + ", " + address.getCity() + ", " + address.getPostCode() + ", " + address.getCountry();

    }

    public AddressDtoBig toDtoBig(Address address) {

        return AddressDtoBig.builder()
                .houseNumber(address.getHouseNumber())
                .street(address.getStreet())
                .city(address.getCity())
                .country(address.getCountry())
                .postCode(address.getPostCode())
                .build();
    }

}
