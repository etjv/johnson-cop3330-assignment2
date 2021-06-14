package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputCheckerTest {

    @Test
    void isValid_returns_true1() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("123");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_true2() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("123456789132");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_true3() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("10");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_true4() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("100");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_false1() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("0");

        assertFalse(actual);
    }

    @Test
    void isValid_returns_false2() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("");

        assertFalse(actual);
    }

    @Test
    void isValid_returns_false3() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("ABC");

        assertFalse(actual);
    }

    @Test
    void isValid_returns_false4() {
        InputChecker c = new InputChecker();

        boolean actual = c.isValid("difo");

        assertFalse(actual);
    }
}