package com.example.trie;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MaximumXorOfTwoTest {

    MaximumXorOfTwo obj = new MaximumXorOfTwo();

    @Test
    public void testtrie() {
        int n = 2, m = 3;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 6, 8 }));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 7, 8, 2 }));
        assertEquals(15, obj.maxXOR(n, m, arr1, arr2));
    }
}
