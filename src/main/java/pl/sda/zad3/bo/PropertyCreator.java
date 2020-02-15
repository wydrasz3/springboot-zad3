package pl.sda.zad3.bo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyCreator {

    @Value("${person.firstName.invalid}")
    private String firstName;

    public String getFirstName() {
        return firstName;
    }
}
