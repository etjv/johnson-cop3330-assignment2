package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthDetectorTest {

    @Test
    void strength_of_1_test1(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("12345");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_1_test2(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("1234576");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_2_test1(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("abcdef");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_2_test2(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("abc");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_3_test1(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("abc123xyz");
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_3_test2(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("abceasyas123");
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_4_test1(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("1337h@xor!");
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void strength_of_4_test2(){
        PasswordStrengthDetector p = new PasswordStrengthDetector();

        int actual = p.getStrength("BigBaddieDifo123?");
        int expected = 4;

        assertEquals(expected, actual);
    }
}