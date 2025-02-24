package by.hotelsmenegment.yemialyanava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelDto {
    private Integer id;
    private String name;
    private String description;
    private String address;
    private String phone;

}
