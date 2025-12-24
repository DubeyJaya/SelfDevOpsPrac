package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppIntegrationTest {

    @Test
    public void testAddAndMultTogether() {
        App app = new App();
        int sum = app.add(10, 5);
        int product = app.mult(sum, 2);
        assertEquals(30, product);  // (10+5)*2 = 30
    }

    @org.junit.jupiter.api.Test
    public void testSubAndDivTogether() {
        App app = new App();
        int diff = app.sub(20, 4);
        int div = app.div(diff, 4);
        assertEquals(4, div);  // (20-4)/4 = 4
    }
}
