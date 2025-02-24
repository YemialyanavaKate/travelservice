package by.hotelsmenegment.yemialyanava.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String brand;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contacts_id", referencedColumnName = "id")
    private Contacts contacts;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arrivalTime_id", referencedColumnName = "id")
    private ArrivalTime arrivalTime;
    @ElementCollection
    private List<String> amenities;
}
