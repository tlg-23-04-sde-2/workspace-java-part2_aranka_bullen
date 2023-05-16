package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    // this the fixture object under test
    private SalariedEmployee emp;
    private SalariedEmployee emp2;

    @Before
    public void setUp() {
        emp = new SalariedEmployee("Mary", Date.valueOf("2020-10-10"), 1500.00);
        emp2 = new SalariedEmployee("Mary", Date.valueOf("2020-10-10"), 1500.00);
    }


    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_sameHiredate_differentSalary() {
        emp2.setSalary(1200.0);
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHiredate_sameSalary() {
        emp2.setHireDate(Date.valueOf("2020-12-10"));
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHiredate_sameSalary() {
        emp2.setName("DIFFERENT");
        assertNotEquals(emp, emp2);
    }

    @Test
    public void testPay() {
    assertEquals(1500.00,emp.pay(), 0.001);

    }

    @Test
    public void testPayTaxes() {

       //taxes = emp.getSalary() * .30;
        assertEquals(450.0, emp.payTaxes(), 0.001);

    }
}