package com.example.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumPlatformTest {
    @Test
    public void testSort() {
        MinimumPlatform obj = new MinimumPlatform();
        assertEquals(3, obj.findPlatform1(new int[] { 900, 940, 950, 1100, 1500, 1800 },
                new int[] { 910, 1200, 1120, 1130, 1900, 2000 }, 6));
        assertEquals(3, obj.findPlatform2(new int[] { 900, 940, 950, 1100, 1500, 1800 },
                new int[] { 910, 1200, 1120, 1130, 1900, 2000 }, 6));
        assertEquals(3, obj.findPlatform1(new int[] { 900, 940, 950, 1100, 1500, 1800 },
                new int[] { 910, 1200, 1120, 1130, 1900, 2000 }, 6));

        assertEquals(1, obj.findPlatform1(new int[] { 900 }, new int[] { 910 }, 1));
        assertEquals(1, obj.findPlatform2(new int[] { 900 }, new int[] { 910 }, 1));
        assertEquals(1, obj.findPlatform2(new int[] { 900 }, new int[] { 910 }, 1));

        assertEquals(1, obj.findPlatform1(new int[] { 900, 1000, 1100 }, new int[] {
                930, 1030, 1200 }, 3));
        assertEquals(1, obj.findPlatform2(new int[] { 900, 1000, 1100 }, new int[] {
                930, 1030, 1200 }, 3));
        assertEquals(1, obj.findPlatform1(new int[] { 900, 1000, 1100 }, new int[] {
                930, 1030, 1200 }, 3));

        assertEquals(2, obj.findPlatform1(new int[] { 900, 930, 1000, 1100 }, new int[] { 920, 1030, 1030, 1200 }, 4));
        assertEquals(2, obj.findPlatform2(new int[] { 900, 930, 1000, 1100 }, new int[] { 920, 1030, 1030, 1200 }, 4));
        assertEquals(2, obj.findPlatform2(new int[] { 900, 930, 1000, 1100 }, new int[] { 920, 1030, 1030, 1200 }, 4));

        assertEquals(2, obj.findPlatform1(new int[] { 900, 930, 1000 }, new int[] {
                930, 1000, 1030 }, 3));
        assertEquals(2, obj.findPlatform2(new int[] { 900, 930, 1000 }, new int[] {
                930, 1000, 1030 }, 3));
        assertEquals(2, obj.findPlatform1(new int[] { 900, 930, 1000 }, new int[] {
                930, 1000, 1030 }, 3));

    }
}
