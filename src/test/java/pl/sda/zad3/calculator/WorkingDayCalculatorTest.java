package pl.sda.zad3.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

class WorkingDayCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideData")
    public void testWorkingDay(String date, boolean  expectedResult) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date workingDay = dateFormat.parse(date);
        WorkingDayCalculator calculator = new WorkingDayCalculator();
        boolean isWorkingDate = calculator.check(workingDay);
        Assertions.assertEquals(isWorkingDate, expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("14-02-2020", true),
                Arguments.of("15-02-2020", false)
        );
    }

}