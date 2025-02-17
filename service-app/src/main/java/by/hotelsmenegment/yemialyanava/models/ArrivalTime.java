package by.hotelsmenegment.yemialyanava.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalTime {
    private String checkIn;
    private String checkOut;
}
