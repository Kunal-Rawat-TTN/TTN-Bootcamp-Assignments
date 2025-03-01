package org.example;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    StringHelper helper = new StringHelper();

    @Ignore
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinNotFirst2Positions()
    {
        assertEquals("CDE",helper.truncateAInFirst2Positions("CDE"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition()
    {
        assertEquals("CDE",helper.truncateAInFirst2Positions("ACDE"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NegativeAinFirstPosition()
    {
        assertNotEquals("ACDE",helper.truncateAInFirst2Positions("ACDE"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NegativeAinFirst2Position()
    {
        assertNotEquals("AACDE",helper.truncateAInFirst2Positions("AACDE"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_NegativeScenario() {
        assertFalse("False Test Case for 1st & last 2 characters : Failed",helper.areFirstAndLastTwoCharactersTheSame("ABBD"));
    }
}