package pl.sda.zad3.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class WorkingDayCalculatorTest {

    @Test
    public void testWorkingDay() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date workingDay = dateFormat.parse("14-02-2020");
        WorkingDayCalculator calculator = new WorkingDayCalculator();
        boolean isWorkingDate = calculator.check(workingDay);
        Assertions.assertTrue(isWorkingDate);
    }

}