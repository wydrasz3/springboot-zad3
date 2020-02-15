package pl.sda.zad3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sda.zad3.bo.PropertyCreator;
import pl.sda.zad3.calculator.WorkingDayCalculator;

import java.util.Date;

@SpringBootApplication
public class Zad3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(Zad3Application.class, args);
        System.out.println("Hello world !!!");

        WorkingDayCalculator workingDayCalculator
                = context.getBean(WorkingDayCalculator.class);

        System.out.println(workingDayCalculator.check(
                new Date()) ? "Dzień jest dniem roboczym"
                : "Dzień przypada na weekend");

        PropertyCreator propertyCreator = context.getBean(PropertyCreator.class);
        System.out.println(propertyCreator.getFirstName());

    }

}
