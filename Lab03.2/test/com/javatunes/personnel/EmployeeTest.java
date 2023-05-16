package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;
    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Jane", Date.valueOf("2023-05-12"));
        emp2 = new SalariedEmployee("Jane", Date.valueOf("2023-05-12"));
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHiredate() {
        emp2.setName("DIFFERENT");

        assertNotEquals(emp1, emp2);
        assertFalse(emp1.equals(emp2));
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2001-10-10"));

        assertNotEquals(emp1, emp2);
        assertFalse(emp1.equals(emp2));
    }

    @Test
    //naming convention businessMethod_whatItShouldDo_whenItShouldDoIt
    public void equals_shouldReturnTrue_allPropertiesSame() {

        assertEquals(emp1, emp2);       // does an equals() check for objects
        assertTrue(emp1.equals(emp2));      //alternative assertation

    }
}