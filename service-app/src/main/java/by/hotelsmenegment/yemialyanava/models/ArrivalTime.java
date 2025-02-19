package by.hotelsmenegment.yemialyanava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String checkIn;
    private String checkOut;
    @JsonIgnore
    @OneToOne(mappedBy = "arrivalTime")
    private Hotel hotel;
}
