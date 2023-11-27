package com.example.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        BinarySearch obj = new BinarySearch();

        int[] nums1 = { -1, 0, 3, 5, 9, 12 };
        int target1 = 9;
        assertEquals(4, obj.binarySearch(nums1, target1));

        int[] nums2 = { -1, 0, 3, 5, 9, 12 };
        int target2 = 2;
        assertEquals(-1, obj.binarySearch(nums2, target2));

        int[] nums3 = { 5 };
        int target3 = 5;
        assertEquals(0, obj.binarySearch(nums3, target3));

        int[] nums4 = { 1, 2, 3, 4, 5 };
        int target4 = 3;
        assertEquals(2, obj.binarySearch(nums4, target4));

        int[] nums5 = { 1, 3, 5, 7, 9 };
        int target5 = 6;
        assertEquals(-1, obj.binarySearch(nums5, target5));
    }
}
