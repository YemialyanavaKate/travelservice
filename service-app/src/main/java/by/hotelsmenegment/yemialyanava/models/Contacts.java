package by.hotelsmenegment.yemialyanava.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

//@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
    private String phone;
    private String email;
}
