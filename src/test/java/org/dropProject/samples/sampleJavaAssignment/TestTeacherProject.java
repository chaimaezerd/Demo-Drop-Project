package org.dropProject.samples.sampleJavaAssignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// in Drop Project, all test classes must begin with "Test"
public class TestTeacherProject {

    @Test
    public void testFindMax() {
        assertEquals(7, Main.findMax(new int[] { 1, 2, 7, 4 }));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNull() {
        Main.findMax(null);
    }

    @Test
    public void testFindMaxAllNegative() {
        assertEquals(-1, Main.findMax(new int[]{-7, -5, -3, -1}));
        assertEquals(-3, Main.findMax(new int[]{-7, -5, -3, -99}));
    }

    @Test
    public void testFindMaxNegativeAndPositive() {
        assertEquals(3, Main.findMax(new int[]{-7, -5, 3, -1}));
        assertEquals(5, Main.findMax(new int[]{-7, 5, -3, -99}));
    }
    
     @Test
    public void testSum3Numbers() {
        assertEquals(0, Main.Sum3Numbers(0,0,0);
        assertEquals(1, Main.Sum3Numbers(0,1,0);
        assertEquals(6, Main.Sum3Numbers(1,2,3);
        assertEquals(0, Main.Sum3Numbers(-1,0,1);
    }
    }
