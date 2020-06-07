package com.mendonca;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionsdfsdfsfTest {

    @Test
    public void reverseString() {
        String test1 = "hello";
        assertEquals(reverseString(test1.toCharArray()), "olleh");
    }
}