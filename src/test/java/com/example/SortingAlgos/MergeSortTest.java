package com.example.SortingAlgos;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testSort() {
        MergeSort obj = new MergeSort();
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.mergeSort(new int[] { 1, 2, 3, 4, 5 }, 0, 4));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.mergeSort(new int[] { 5, 4, 3, 2, 1 }, 0, 4));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.mergeSort(new int[] { 3, 1, 5, 2, 4 }, 0, 4));
    }
}