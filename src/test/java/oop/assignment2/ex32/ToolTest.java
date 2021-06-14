package oop.assignment2.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToolTest {

    @Test
    void isValid_returns_true1() {
        Tool t = new Tool();

        boolean actual = t.isValid("1");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_true2() {
        Tool t = new Tool();

        boolean actual = t.isValid("2");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_true3() {
        Tool t = new Tool();

        boolean actual = t.isValid("3");

        assertTrue(actual);
    }

    @Test
    void isValid_returns_false1() {
        Tool t = new Tool();

        boolean actual = t.isValid("0");

        assertFalse(actual);
    }

    @Test
    void isValid_returns_false2() {
        Tool t = new Tool();

        boolean actual = t.isValid("4");

        assertFalse(actual);
    }

    @Test
    void isValid_returns_false3() {
        Tool t = new Tool();

        boolean actual = t.isValid("A");

        assertFalse(actual);
    }

    @Test
    void isLower_returns_true1() {
        Tool t = new Tool();

        boolean actual = t.isLower(2, 1);

        assertTrue(actual);
    }

    @Test
    void isLower_returns_true2() {
        Tool t = new Tool();

        boolean actual = t.isLower(8, 5);

        assertTrue(actual);
    }

    @Test
    void isLower_returns_true3() {
        Tool t = new Tool();

        boolean actual = t.isLower(8, 2);

        assertTrue(actual);
    }

    @Test
    void isLower_returns_false1() {
        Tool t = new Tool();

        boolean actual = t.isLower(2, 8);

        assertFalse(actual);
    }

    @Test
    void isLower_returns_false2() {
        Tool t = new Tool();

        boolean actual = t.isLower(5, 9);

        assertFalse(actual);
    }

    @Test
    void isLower_returns_false3() {
        Tool t = new Tool();

        boolean actual = t.isLower(5, 600);

        assertFalse(actual);
    }

    @Test
    void isValidGuess_returns_true1(){
        Tool t = new Tool();

        boolean actual = t.isValidGuess("5");

        assertTrue(actual);
    }

    @Test
    void isValidGuess_returns_true2(){
        Tool t = new Tool();

        boolean actual = t.isValidGuess("500");

        assertTrue(actual);
    }

    @Test
    void isValidGuess_returns_true3(){
        Tool t = new Tool();

        boolean actual = t.isValidGuess("30299");

        assertTrue(actual);
    }

    @Test
    void isValidGuess_returns_false1(){
        Tool t = new Tool();

        boolean actual = t.isValidGuess("-23");

        assertFalse(actual);
    }
    @Test
    void isValidGuess_returns_false2(){
        Tool t = new Tool();

        boolean actual = t.isValidGuess("A");

        assertFalse(actual);
    }

    @Test
    void isValidGuess_returns_false3(){
        Tool t = new Tool();

        boolean actual = t.isValidGuess("");

        assertFalse(actual);
    }
}