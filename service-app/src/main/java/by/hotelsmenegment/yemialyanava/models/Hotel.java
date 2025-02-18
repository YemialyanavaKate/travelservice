package by.hotelsmenegment.yemialyanava.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String brand;
    /*private Address address;
    private Contacts contacts;
    private ArrivalTime arrivalTime;
    private Amenities amenities;*/
}
