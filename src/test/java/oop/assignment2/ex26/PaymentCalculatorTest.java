package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void see_if_number_of_months_is_correct_test1() {
        PaymentCalculator p = new PaymentCalculator();
        DecimalFormat d = new DecimalFormat("#");
        d.setRoundingMode(RoundingMode.UP);

        double expected = 70;
        double actual = p.calculateMonthsUntilPaidOff(5000, .12, 100);

        assertEquals(d.format(expected), d.format(actual));

    }

    @Test
    void see_if_number_of_months_is_correct_test2() {
        PaymentCalculator p = new PaymentCalculator();
        DecimalFormat d = new DecimalFormat("#");
        d.setRoundingMode(RoundingMode.UP);

        double expected = 6;
        double actual = p.calculateMonthsUntilPaidOff(5000, .12, 1000);

        assertEquals(d.format(expected), d.format(actual));

    }
}