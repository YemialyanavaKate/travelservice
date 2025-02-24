package by.hotelsmenegment.yemialyanava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrivalTimeDtoBig {
    private String checkIn;
    private String checkOut;
}
