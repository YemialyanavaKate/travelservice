package by.hotelsmenegment.yemialyanava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer houseNumber;
    private String street;
    private String city;
    private String country;
    private String postCode;
    @JsonIgnore
    @OneToOne(mappedBy = "address")
    private Hotel hotel;
}
