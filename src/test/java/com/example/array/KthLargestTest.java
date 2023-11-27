package com.example.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestTest {
    @Test
    public void testSort() {
        KthLargest obj = new KthLargest();
        assertEquals(3, obj.findKthLargest1(new int[] { 1, 4, 5, 2, 3 }, 3));
        assertEquals(4, obj.findKthLargest1(new int[] { 1, 2, 3, 4, 5 }, 2));
        assertEquals(-3, obj.findKthLargest1(new int[] { -1, -3, -5, -2, -4 }, 3));
        assertEquals(100, obj.findKthLargest1(new int[] { 100 }, 1));
        assertEquals(3, obj.findKthLargest2(new int[] { 1, 4, 5, 2, 3 }, 3));
        assertEquals(4, obj.findKthLargest2(new int[] { 1, 2, 3, 4, 5 }, 2));
        assertEquals(-3, obj.findKthLargest2(new int[] { -1, -3, -5, -2, -4 }, 3));
        assertEquals(14, obj.findKthLargest2(new int[] { 11, 2, 323, 14, 5 }, 2));
        assertEquals(100, obj.findKthLargest3(new int[] { 100 }, 1));
        assertEquals(100, obj.findKthLargest3(new int[] { 100, 32, -434, 322, 230 }, 3));
    }
}
