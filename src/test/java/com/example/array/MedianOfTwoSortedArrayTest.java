package com.example.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianOfTwoSortedArrayTest {
    @Test
    public void testMedianBruteForce_OddLengthArrays() {
        int[] a = { 1, 3, 5 };
        int[] b = { 2, 4, 6, 8 };
        double expected = 4;
        assertEquals(expected, MedianOfTwoSortedArray.medianBruteForce(a, b), 0.001);
    }

    @Test
    public void testMedianBruteForce_EvenLengthArrays() {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };
        double expected = 4.5;
        assertEquals(expected, MedianOfTwoSortedArray.medianBruteForce(a, b), 0.001);
    }

    @Test
    public void testMedianBetter_OddLengthArrays() {
        int[] a = { 1, 3, 5 };
        int[] b = { 2, 4, 6, 8 };
        double expected = 4;
        assertEquals(expected, MedianOfTwoSortedArray.medianBetter(a, b), 0.001);
    }

    @Test
    public void testMedianBetter_EvenLengthArrays() {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };
        double expected = 4.5;
        assertEquals(expected, MedianOfTwoSortedArray.medianBetter(a, b), 0.001);
    }

    @Test
    public void testMedianOptimal_OddLengthArrays() {
        int[] a = { 1, 3, 5 };
        int[] b = { 2, 4, 6, 8 };
        double expected = 4;
        assertEquals(expected, MedianOfTwoSortedArray.medianOptimal(a, b), 0.001);
    }

    @Test
    public void testMedianOptimal_EvenLengthArrays() {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };
        double expected = 4.5;
        assertEquals(expected, MedianOfTwoSortedArray.medianOptimal(a, b), 0.001);
    }
}
