package by.hotelsmenegment.yemialyanava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelDtoBig {
    private Integer id;
    private String name;
    private String brand;
}
