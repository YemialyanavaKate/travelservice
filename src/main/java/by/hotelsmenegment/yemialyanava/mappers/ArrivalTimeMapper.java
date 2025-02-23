package by.hotelsmenegment.yemialyanava.mappers;

import by.hotelsmenegment.yemialyanava.dto.ArrivalTimeDtoBig;
import by.hotelsmenegment.yemialyanava.models.ArrivalTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
public class ArrivalTimeMapper {
    public ArrivalTimeDtoBig toDtoBig(ArrivalTime arrivalTime) {
        ArrivalTimeDtoBig build = ArrivalTimeDtoBig.builder()
                .checkIn(arrivalTime.getCheckIn())
                .build();
        if (Objects.nonNull(arrivalTime.getCheckOut())) {
            build.setCheckOut(arrivalTime.getCheckOut());
        }
        return build;
    }
}
