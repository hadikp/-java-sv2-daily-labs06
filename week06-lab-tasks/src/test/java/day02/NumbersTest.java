package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    private Numbers numbers;

    @BeforeEach
    void init() {
        numbers = new Numbers();
    }

    @Test
    void testNumbers() {
        boolean isOk = numbers.isPerfectNumber(6);
        boolean isOk2 = numbers.isPerfectNumber(8128);
        boolean isOk3 = numbers.isPerfectNumber(9);
        assertTrue(isOk);
        assertEquals(true, isOk2);
        assertFalse(isOk3);
    }
}
