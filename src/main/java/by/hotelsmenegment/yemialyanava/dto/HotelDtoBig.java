package by.hotelsmenegment.yemialyanava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelDtoBig {
    private Integer id;
    private String name;
    private String brand;
    private AddressDtoBig address;
    private ContactsDtoBig contacts;
    private ArrivalTimeDtoBig arrivalTime;
    private List<String> amenities;
}
