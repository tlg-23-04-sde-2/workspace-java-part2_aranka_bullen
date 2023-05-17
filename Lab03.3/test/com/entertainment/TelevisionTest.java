package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    //business fixtures
    private Television tv1;
    private Television tv2;
    private Television tv3;

    @Before
    public void setUp() throws Exception {
        tv1 = new Television("Sony", 50, DisplayType.OLED);
        tv2 = new Television("Sony", 50, DisplayType.OLED);
        tv3 = new Television("Samsung", 32, DisplayType.LCD);
    }


    @Test
    public void hashCode_shouldReturnSameValue_whenEqualstoObjects() {
        assertEquals(tv1,tv2);
    }

    @Test
    public void hashCode_shouldReturnDifferentValue_whenNotEqualsToObject() {
        assertNotEquals(tv1, tv3);
    }

    @Test
   // public void hashCode_shouldReturnDifferentValue_differentVolume_() {
    //}

    @Test
    public void equals_shouldReturnTrue_whenAllPropertiesSame() {
        assertEquals(tv1, tv2);
    }

    @Test
    public void equals_shouldReturnFalse_sameBrand_sameVolume_differentDisplayType() {
        tv2.setDisplay(DisplayType.LED);
        assertNotEquals(tv1, tv2);
    }

    @Test
    public void equals_shouldReturnFalse_sameBrand_differentVolume_sameDisplayType() {
        tv2.setVolume(23);
        assertNotEquals(tv1,tv2);
    }

    @Test
    public void equals_shouldReturnFalse_differentBrand_sameVolume_sameDisplayType() {
        tv2.setBrand("LG");
        assertNotEquals(tv1, tv2);
    }


    @Test
    public void equals_shouldReturnFalse_allPropertiesDifferent() {
        assertNotEquals(tv1, tv3);
    }

    @Test
    public void changeChannel_shouldStoreChannel_whenValid_lowerBoundary() throws InvalidChannelException {  //checked exceptions have to have "throws" when punting
        tv1.changeChannel(1);
        assertEquals(1, tv1.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreChannel_whenValid_upperBoundary() throws InvalidChannelException {             // exception testing on checked exceptions, using try/catch, to grab exception
        tv1.changeChannel(999);
    }

    @Test
    public void changeChannel_shouldReturnInvalidChannelException_lowerBoundary()  throws InvalidChannelException{
        tv1.changeChannel(0);
        asserts
    }

    @Test(expected = IllegalArgumentException.class)    // note declaration to the JUNIT test runner of what should be expected
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBoundary_() {
        tv1.setVolume(-1);  //method 1: triggers the exception and "punt"
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBoundary() {
        try{
            tv1.setVolume(101);                      // method 2: does go to JUNIT because exception should be caught in the catch statement
            fail("Should have thrown the IllegalArgumentException");
        } catch (IllegalArgumentException e){
            assertEquals("Invalid volume: 101. Allowed range: [0,100].", e.getMessage() );  //every character must match exactly with exception message on the business code otherwise test will not pass.
        }
    }

    @Test
    public void setVolume_shouldStoreVolume_whenValid_upperBoundary() {
        tv1.setVolume(100);
        assertEquals(100,tv1.getVolume());
    }

    @Test
    public void setVolume_shouldStoreVolume_whenValid_lowerBoundary() {
        tv1.setVolume(0);
        assertEquals(0,tv1.getVolume());
    }
}