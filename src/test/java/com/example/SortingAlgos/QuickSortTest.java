package com.example.SortingAlgos;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testSort() {
        QuickSort obj = new QuickSort();
        List<Integer> sorted = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(sorted, obj.quickSort(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        assertEquals(sorted, obj.quickSort(new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1))));
        assertEquals(sorted, obj.quickSort(new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4))));
    }
}
