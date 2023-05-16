package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    // fixture object under test
    private HourlyEmployee emp;

    @Before
    public void setUp() {
        emp = new HourlyEmployee("James", Date.valueOf("2021-05-13"), 20.0, 36.0);
    }

    @Test
    public void testPay() {

        assertEquals(720, emp.pay(), 0.001);

    }

    @Test
    public void testPayTaxes() {
        assertEquals(180, emp.payTaxes(), 0.001);

    }
}