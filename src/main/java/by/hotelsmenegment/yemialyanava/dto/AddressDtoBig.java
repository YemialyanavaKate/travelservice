package by.hotelsmenegment.yemialyanava.dto;

import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AddressDtoBig {
    private Integer houseNumber;
    private String street;
    private String city;
    private String country;
    private String postCode;
}
