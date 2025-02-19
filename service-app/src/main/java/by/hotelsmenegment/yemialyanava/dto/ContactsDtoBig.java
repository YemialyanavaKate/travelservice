package by.hotelsmenegment.yemialyanava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactsDtoBig {
    private String phone;
    private String email;
}
