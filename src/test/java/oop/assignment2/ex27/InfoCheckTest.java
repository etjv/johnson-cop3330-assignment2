package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoCheckTest {

    @Test
    void check_if_input_has_no_errors1() {
        InfoCheck i = new InfoCheck();

        String expected = "There were no errors found.";
        String actual = i.validateInput("John", "Johnson", "55555", "TK-4321");

        assertEquals(expected, actual);
    }

    @Test
    void check_if_input_has_no_errors2() {
        InfoCheck i = new InfoCheck();

        String expected = "There were no errors found.";
        String actual = i.validateInput("Richard", "Cox", "42069", "AK-4769");

        assertEquals(expected, actual);
    }

    @Test
    void check_if_input_has_errors1() {
        InfoCheck i = new InfoCheck();

        String expected = "The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\nThe last name must be filled in.\nThe zipcode must be a 5 digit number.\nThe employee ID must be in the format of AA-1234.\n";
        String actual = i.validateInput("J", "", "ABCDE", "A12-1234");

        assertEquals(expected, actual);
    }

    @Test
    void check_if_input_has_errors2() {
        InfoCheck i = new InfoCheck();

        String expected = "The last name must be at least 2 characters long.\nThe employee ID must be in the format of AA-1234.\n";
        String actual = i.validateInput("John", "J", "34565", "A12-1234");

        assertEquals(expected, actual);
    }
}