package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_test1() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "tone");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_test2() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("racecar", "carrace");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_test1() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("difo", "god");

        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_test2() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("note", "tune");

        assertFalse(actual);
    }
}