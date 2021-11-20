package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinnessModelTest {

    BusinessModel businessModel;

    @BeforeEach
    void init () {
        businessModel = new BusinessModel("aaaa", 3);
    }

    @Test
    void testWon () {
        assertTrue(businessModel.takeGuess("a"));
        assertTrue(businessModel.won());
    }

    @Test
    void testLose () {
        assertFalse(businessModel.takeGuess("b"));
        assertFalse(businessModel.won());
    }

    @Test
    void testWordFound () {
        businessModel = new BusinessModel("aaaakb", 3);
        assertEquals("------", businessModel.getWordFound());
    }

    @Test
    void testChances () {
        assertEquals(3, businessModel.getChances());
    }

    @Test
    void testUpdateWordFoundA () {
        businessModel = new BusinessModel("aaaakb", 3);
        assertEquals("aaaa--", businessModel.updateWordFound("aaaakb", "------", "a"));
    }

    @Test
    void testUpdateWordFoundK () {
        businessModel = new BusinessModel("aaaakb", 3);
        assertEquals("----k-", businessModel.updateWordFound("aaaakb", "------", "k"));
    }

}