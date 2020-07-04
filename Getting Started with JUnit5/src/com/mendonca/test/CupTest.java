package com.mendonca.test;

import com.mendonca.Cup;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void testObjectCreation() {
        Cup cup = new Cup("Water", 75.0);
        assertEquals("Water", cup.getLiquidType());
        assertEquals(75, cup.getPercentFull(), 0.001);
    }

    // New in JUnit 5
    @Test
    void testObjectCreationWithAssertAll() {
        Cup cup = new Cup("Water", 75.0);
        assertAll("Correctly builds object",
                () -> assertEquals("Water", cup.getLiquidType()),
                () -> assertEquals(75, cup.getPercentFull(), 0.001)
        );
    }

    @Test
    void testIsEmpty() {
        Cup cup = new Cup("Water", 75.0);
        assertFalse(cup.isEmpty());
    }

    @Test
    void testSetLiquidWithNull() {
        Cup cup = new Cup("Water", 75.0);
        cup.setLiquidType(null);
        assertNotNull(cup.getLiquidType());
    }

    @Disabled("Disable test until Library team fixes bug 2432")
    @Test
    void testExternalLibrary() {
        // Imagine depending on someone else's code...
        fail();
    }

    @Test
    void testSetBadPercentThrows() {
        Cup cup = new Cup("Water", 75);
        assertThrows(IllegalArgumentException.class,
                () -> cup.setPercentFull(-1)
                );
    }

    public double guessThePercent(Cup cup) {
        while (true) {
            double guess = Math.random();
            if (Math.abs(guess - cup.getPercentFull()) < 100) {
                return guess;
            }
        }
    }
    @Test
    void guessThePercent() {
        Cup cup = new Cup("Water", 50);
        assertTimeoutPreemptively(
                Duration.ofSeconds(5),
                () -> guessThePercent(cup) > 0);
    }

}