package com.mendonca.test;

import com.mendonca.Cup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void testObjectCreation() {
        Cup cup = new Cup("Water", 75.0);
        assertEquals("Water", cup.getLiquidType());
        assertEquals(75, cup.getPercentFull());
    }

}