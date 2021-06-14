package oop.assignment2.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void isValid_is_true() {
        Calculator c = new Calculator();

        boolean actual = c.isValid("100");

        assertTrue(actual);
    }

    @Test
    void isValid_is_false() {
        Calculator c = new Calculator();

        boolean actual = c.isValid(";alsdkfu");

        assertFalse(actual);
    }

    @Test
    void listOfNumbers_outputs_correct() {
        Calculator c = new Calculator();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);

        String expected = "100, 200, 300";
        String actual = String.valueOf(c.listOfNumbers(l));


        assertEquals(expected, actual);
    }

    @Test
    void average_outputs_correct() {
        Calculator c = new Calculator();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);

        double expected = 200;
        double actual = c.average(l);

        assertEquals(expected, actual);
    }

    @Test
    void min_outputs_correct() {
        Calculator c = new Calculator();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);

        int expected = 100;
        int actual = c.min(l);

        assertEquals(expected, actual);
    }

    @Test
    void max_outputs_correct() {
        Calculator c = new Calculator();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);

        int expected = 300;
        int actual = c.max(l);

        assertEquals(expected, actual);
    }

    @Test
    void std_outputs_correct() {
        Calculator c = new Calculator();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);

        double expected = 81.64965809277261;
        double actual = c.std(l, c.average(l));

        assertEquals(expected, actual);
    }
}