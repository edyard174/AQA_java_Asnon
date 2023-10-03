package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial f = new Factorial();
        assertEquals(f.getFactorial(5), 120);
    }
}
