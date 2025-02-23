package by.hotelsmenegment.yemialyanava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
