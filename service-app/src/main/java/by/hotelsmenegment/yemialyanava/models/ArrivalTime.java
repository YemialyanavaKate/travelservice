package by.hotelsmenegment.yemialyanava.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalTime {
    @Id
    private Integer id;
    private String checkIn;
    private String checkOut;
}
