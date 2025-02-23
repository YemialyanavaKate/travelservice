package by.hotelsmenegment.yemialyanava.mappers;

import by.hotelsmenegment.yemialyanava.dto.ArrivalTimeDtoBig;
import by.hotelsmenegment.yemialyanava.models.ArrivalTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ArrivalTimeMapper {
    public ArrivalTimeDtoBig toDtoBig(ArrivalTime arrivalTime) {
        return ArrivalTimeDtoBig.builder()
                .checkIn(arrivalTime.getCheckIn())
                .checkOut(arrivalTime.getCheckOut())
                .build();
    }

}
