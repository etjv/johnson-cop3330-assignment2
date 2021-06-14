package oop.assignment2.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToolTest {

    @Test
    void ballOutput_outputs_properly1() {
        Tool t = new Tool();

        String expected = "Maybe.";
        String actual = t.ballOutput(2);

        assertEquals(expected, actual);
    }

    @Test
    void ballOutput_outputs_properly2() {
        Tool t = new Tool();

        String expected = "Yes.";
        String actual = t.ballOutput(0);

        assertEquals(expected, actual);
    }

    @Test
    void ballOutput_outputs_properly3() {
        Tool t = new Tool();

        String expected = "No.";
        String actual = t.ballOutput(1);

        assertEquals(expected, actual);
    }

    @Test
    void ballOutput_outputs_properly4() {
        Tool t = new Tool();

        String expected = "Ask again later.";
        String actual = t.ballOutput(3);

        assertEquals(expected, actual);
    }
}