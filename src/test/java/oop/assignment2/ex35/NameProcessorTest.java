package oop.assignment2.ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameProcessorTest {

    @Test
    void isName_returns_true1() {
        NameProcessor n = new NameProcessor();

        boolean actual = n.isName("Adam");

        assertTrue(actual);
    }

    @Test
    void isName_returns_true2() {
        NameProcessor n = new NameProcessor();

        boolean actual = n.isName("Nick");

        assertTrue(actual);
    }

    @Test
    void isName_returns_true3() {
        NameProcessor n = new NameProcessor();

        boolean actual = n.isName("Sam");

        assertTrue(actual);
    }

    @Test
    void isName_returns_true4() {
        NameProcessor n = new NameProcessor();

        boolean actual = n.isName("Ayden");

        assertTrue(actual);
    }

    @Test
    void isName_returns_false1() {
        NameProcessor n = new NameProcessor();

        boolean actual = n.isName("");

        assertFalse(actual);
    }

    @Test
    void numberGenerator_returns_number_less_than_size() {
        NameProcessor n = new NameProcessor();

        boolean actual = n.numberIsLessThanSize(n.numberGenerator(10), 10);

        assertTrue(actual);
    }
}