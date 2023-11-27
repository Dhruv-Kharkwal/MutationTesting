package com.example.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthSmallestTest {

    @Test
    public void testSort() {
        KthSmallest obj = new KthSmallest();
        assertEquals(3, obj.kthSmallest(new int[] { 1, 4, 5, 2, 3 }, 3));
        assertEquals(2, obj.kthSmallest(new int[] { 1, 2, 3, 4, 5 }, 2));
        assertEquals(-3, obj.kthSmallest(new int[] { -1, -3, -5, -2, -4 }, 3));
        assertEquals(5, obj.kthSmallest(new int[] { 11, 2, 323, 14, 5 }, 2));
        assertEquals(100, obj.kthSmallest(new int[] { 100 }, 1));
    }
}
