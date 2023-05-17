package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionChannelComparatorTest {
    // need three objects, tv1,tv2, an instance of the comparator.
private Television tv1;
private Television tv2;
private TelevisionChannelComparator comparator;


    @Before
    public void setUp() throws Exception {
        tv1 = new Television();
        tv2 = new Television();

        comparator = new TelevisionChannelComparator();
    }

    @Test
    public void compare_shouldReturnZero_whenSameChannel() {
        assertEquals(0, comparator.compare(tv1, tv2));
    }

    @Test
    public void compare_shouldTakeNegativeNumber_whenChannelIsLessThan2ndChannel() throws InvalidChannelException{
        tv1. changeChannel(1);
        tv2.changeChannel(2);
        assertNotEquals(tv1, tv2);

    }
}