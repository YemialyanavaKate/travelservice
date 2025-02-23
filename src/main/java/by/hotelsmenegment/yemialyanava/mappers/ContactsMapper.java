package by.hotelsmenegment.yemialyanava.mappers;

import by.hotelsmenegment.yemialyanava.dto.ContactsDtoBig;
import by.hotelsmenegment.yemialyanava.models.Contacts;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ContactsMapper {

    public String toDtoString(Contacts contacts) {

        return contacts.getPhone();
    }

    public ContactsDtoBig toDtoBig(Contacts contacts) {
        return ContactsDtoBig.builder()
                .phone(contacts.getPhone())
                .email(contacts.getEmail())
                .build();
    }
}
