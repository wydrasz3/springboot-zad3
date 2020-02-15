package pl.sda.zad3.calculator;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
public class WorkingDayCalculator {

    public boolean check(Date date) {
        LocalDate dateWithoutTime = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return dateWithoutTime.getDayOfWeek().getValue() <= 5;
    }
}
