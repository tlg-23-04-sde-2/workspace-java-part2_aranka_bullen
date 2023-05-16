/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.concurrent.Callable;

public class CalculatorTest {

    // business objects(s) under test - called a "fixture"
    private Calculator calc;            // initializing the object outside of the field  and creating a setUp() method
                                        // allows for each test method to start at the before setUp method having to create a new instance.


    @BeforeClass
    public static void initializaEntireTestRun() throws Exception {
        System.out.println("initializeEntireTestRun");
        System.out.println();
    }
    @AfterClass
    public static void finalizeEntireTestRun() {
        System.out.println("finalizeEntireTestRun");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        calc = new Calculator();
    }

    @After
    public void cleanUp() {
        System.out.println("cleanUp");
        System.out.println();
    }

    @Test
    public void testIsEven() {
        System.out.println("testIsEven");
        assertTrue(calc.isEven(10));
        assertFalse(calc.isEven(11));

    }

    @Test
    public void testDivide() {
        System.out.println("testDivide");
        assertEquals(2.5, calc.divide(5,2), 0.001);

    }

    @Test
    public void testAdd() {
        System.out.println("testAdd");
        assertEquals(5, calc.add(1, 4));  // expected, actual

    }


}