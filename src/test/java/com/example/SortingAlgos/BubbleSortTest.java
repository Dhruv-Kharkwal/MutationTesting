package com.example.SortingAlgos;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort obj = new BubbleSort();
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.sort(new int[] { 1, 2, 3, 4, 5 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.sort(new int[] { 5, 4, 3, 2, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, obj.sort(new int[] { 3, 1, 5, 2, 4 }));
    }
}
