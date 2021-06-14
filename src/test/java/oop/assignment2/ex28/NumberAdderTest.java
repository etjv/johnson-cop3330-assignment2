package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAdderTest {

    @Test
    void adds_the_numbers1() {
        NumberAdder n = new NumberAdder();
        double[] a = new double[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int expected = 15;
        int actual = n.addLoop(a);

        assertEquals(expected, actual);
    }

    @Test
    void adds_the_numbers2() {
        NumberAdder n = new NumberAdder();
        double[] a = new double[5];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 20;
        a[4] = 25;
        int expected = 75;
        int actual = n.addLoop(a);

        assertEquals(expected, actual);
    }

    @Test
    void adds_the_numbers3() {
        NumberAdder n = new NumberAdder();
        double[] a = new double[5];
        a[0] = 2;
        a[1] = -2;
        a[2] = 4;
        a[3] = -4;
        a[4] = 8;
        int expected = 8;
        int actual = n.addLoop(a);

        assertEquals(expected, actual);
    }
}