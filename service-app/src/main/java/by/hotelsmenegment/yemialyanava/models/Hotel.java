package by.hotelsmenegment.yemialyanava.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private Address address;
    private Contacts contacts;
    private ArrivalTime arrivalTime;
    private Amenities amenities;
}
