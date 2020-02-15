package pl.sda.zad3.bo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyCreator {

    @Value("${person.firstName.invalid}")
    private String firstName;

    @Value("${person.lastName.invalid}")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
