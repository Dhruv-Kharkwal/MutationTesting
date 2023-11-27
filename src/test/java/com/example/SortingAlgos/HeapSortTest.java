package com.example.SortingAlgos;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {
    @Test
    public void testSort() {
        HeapSort obj = new HeapSort();
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.heapSort(new int[] { 1, 2, 3, 4, 5 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.heapSort(new int[] { 5, 4, 3, 2, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.heapSort(new int[] { 3, 1, 5, 2, 4 }));
        assertArrayEquals(new int[] { -21, -5, -1, 21 }, obj.heapSort(new int[] { -1, 21, -5, -21 }));
    }
}
