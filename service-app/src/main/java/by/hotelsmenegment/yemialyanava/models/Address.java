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
public class Address {
    private Integer houseNumber;
    private String street;
    private String city;
    private String country;
    private String postCode;
}
