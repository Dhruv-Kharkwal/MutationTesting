package com.example.dynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KnapSackTest {

    KnapSack obj = new KnapSack();

    @Test
    public void test() {

        // test1
        int[] weights1 = { 2, 3, 4, 5 };
        int[] values1 = { 3, 4, 5, 6 };
        int weightCapacity1 = 5;
        int expected1 = 7; // Maximum value should be 7 (items 1 and 4
        int result1 = obj.knapSack1(weightCapacity1, weights1, values1, 4);
        assertEquals(expected1, result1);

        // test2
        int[] weights2 = {};
        int[] values2 = {};
        int weightCapacity2 = 10;
        int expected2 = 0; // With no items, the result should be 0.
        int result2 = obj.knapSack1(weightCapacity2, weights2, values2, 0);
        assertEquals(expected2, result2);

        // test3
        int[] weights = { 2, 3, 4 };
        int[] values = { 3, 4, 5 };
        int weightCapacity = 0;
        int expected = 0; // With no capacity, the result should be 0.
        int result = obj.knapSack1(weightCapacity, weights, values, 3);
        assertEquals(expected, result);

        // test4
        int[] weights3 = { 2, 3, 4, 5 };
        int[] values3 = { 3, 4, 5, 6 };
        int weightCapacity3 = 10;
        int expected3 = 13; // Maximum value should be 13 (items 1, 3, and 4).
        int result3 = obj.knapSack1(weightCapacity3, weights3, values3, 4);
        assertEquals(expected3, result3);
    }

    @Test
    public void test2() {
        // test1
        int[] weights1 = { 2, 3, 4, 5 };
        int[] values1 = { 3, 4, 5, 6 };
        int weightCapacity1 = 5;
        int expected1 = 7; // Maximum value should be 7 (items 1 and 4
        int result1 = obj.knapSack2(weightCapacity1, weights1, values1, 4);
        assertEquals(expected1, result1);

        // test2
        int[] weights2 = {};
        int[] values2 = {};
        int weightCapacity2 = 10;
        int expected2 = 0; // With no items, the result should be 0.
        int result2 = obj.knapSack2(weightCapacity2, weights2, values2, 0);
        assertEquals(expected2, result2);

        // test3
        int[] weights = { 2, 3, 4 };
        int[] values = { 3, 4, 5 };
        int weightCapacity = 0;
        int expected = 0; // With no capacity, the result should be 0.
        int result = obj.knapSack2(weightCapacity, weights, values, 3);
        assertEquals(expected, result);

        // // test4
        int[] weights3 = { 2, 3, 4, 5 };
        int[] values3 = { 3, 4, 5, 6 };
        int weightCapacity3 = 10;
        int expected3 = 13; // Maximum value should be 13 (items 1, 3, and 4).
        int result3 = obj.knapSack2(weightCapacity3, weights3, values3, 4);
        assertEquals(expected3, result3);
    }

    @Test
    public void test3() {
        // test1
        int[] weights1 = { 2, 3, 4, 5 };
        int[] values1 = { 3, 4, 5, 6 };
        int weightCapacity1 = 5;
        int expected1 = 7; // Maximum value should be 7 (items 1 and 4
        int result1 = obj.knapSack3(weightCapacity1, weights1, values1, 4);
        assertEquals(expected1, result1);

        // test2
        int[] weights2 = {};
        int[] values2 = {};
        int weightCapacity2 = 10;
        int expected2 = 0; // With no items, the result should be 0.
        int result2 = obj.knapSack2(weightCapacity2, weights2, values2, 0);
        assertEquals(expected2, result2);

        // test3
        int[] weights = { 2, 3, 4 };
        int[] values = { 3, 4, 5 };
        int weightCapacity = 0;
        int expected = 0; // With no capacity, the result should be 0.
        int result = obj.knapSack3(weightCapacity, weights, values, 3);
        assertEquals(expected, result);

        // // test4
        int[] weights3 = { 2, 3, 4, 5 };
        int[] values3 = { 3, 4, 5, 6 };
        int weightCapacity3 = 10;
        int expected3 = 13; // Maximum value should be 13 (items 1, 3, and 4).
        int result3 = obj.knapSack3(weightCapacity3, weights3, values3, 4);
        assertEquals(expected3, result3);
    }

    @Test
    public void test4() {
        // test1
        int[] weights1 = { 2, 3, 4, 5 };
        int[] values1 = { 3, 4, 5, 6 };
        int weightCapacity1 = 5;
        int expected1 = 7; // Maximum value should be 7 (items 1 and 4
        int result1 = obj.knapSack4(weightCapacity1, weights1, values1, 4);
        assertEquals(expected1, result1);

        // test2
        int[] weights2 = {};
        int[] values2 = {};
        int weightCapacity2 = 10;
        int expected2 = 0; // With no items, the result should be 0.
        int result2 = obj.knapSack2(weightCapacity2, weights2, values2, 0);
        assertEquals(expected2, result2);

        // test3
        int[] weights = { 2, 3, 4 };
        int[] values = { 3, 4, 5 };
        int weightCapacity = 0;
        int expected = 0; // With no capacity, the result should be 0.
        int result = obj.knapSack4(weightCapacity, weights, values, 3);
        assertEquals(expected, result);

        // // test4
        int[] weights3 = { 2, 3, 4, 5 };
        int[] values3 = { 3, 4, 5, 6 };
        int weightCapacity3 = 10;
        int expected3 = 13; // Maximum value should be 13 (items 1, 3, and 4).
        int result3 = obj.knapSack4(weightCapacity3, weights3, values3, 4);
        assertEquals(expected3, result3);
    }

}
