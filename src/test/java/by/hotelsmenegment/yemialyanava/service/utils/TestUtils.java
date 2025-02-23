package by.hotelsmenegment.yemialyanava.service.utils;

import by.hotelsmenegment.yemialyanava.models.Address;
import by.hotelsmenegment.yemialyanava.models.ArrivalTime;
import by.hotelsmenegment.yemialyanava.models.Contacts;
import by.hotelsmenegment.yemialyanava.models.Hotel;

import java.util.List;

public class TestUtils {

    protected Hotel buildHotel(Integer id, String name, String description, String brand, Address address, Contacts contacts, ArrivalTime arrivalTime, List<String> amenities){
        return Hotel.builder()
                .id(id)
                .name(name)
                .description(description)
                .brand(brand)
                .address(address)
                .contacts(contacts)
                .arrivalTime(arrivalTime)
                .amenities(amenities)
                .build();
    }
}
