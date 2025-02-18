package by.hotelsmenegment.yemialyanava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelDto {
    private Integer id;
    private String name;
    private String description;
    private String brand;

}
