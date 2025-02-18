package by.hotelsmenegment.yemialyanava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private Integer houseNumber;
    private String street;
    private String city;
    private String country;
    private String postCode;
}
