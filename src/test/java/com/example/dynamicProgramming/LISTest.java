package com.example.dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class LISTest {

    @Test
    public void testMethod1() {
        LIS lis = new LIS();
        int[] nums = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int result = lis.method1(nums);
        assertEquals(2, result);
    }

    @Test
    public void testMethod2() {
        LIS lis = new LIS();
        int[] nums = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int result = lis.method2(nums);
        assertEquals(2, result);
    }

    @Test
    public void testMethod1WithEmptyArray() {
        LIS lis = new LIS();
        int[] nums = {};
        int result = lis.method1(nums);
        assertEquals(0, result);
    }

    @Test
    public void testMethod2WithEmptyArray() {
        LIS lis = new LIS();
        int[] nums = {};
        int result = lis.method2(nums);
        assertEquals(0, result);
    }

    @Test
    public void testMethod1WithSingleElement() {
        LIS lis = new LIS();
        int[] nums = { 5 };
        int result = lis.method1(nums);
        assertEquals(1, result);
    }

    @Test
    public void testMethod2WithSingleElement() {
        LIS lis = new LIS();
        int[] nums = { 5 };
        int result = lis.method2(nums);
        assertEquals(1, result);
    }

    @Test
    public void testMethod1WithDescendingOrder() {
        LIS lis = new LIS();
        int[] nums = { 5, 4, 3, 2, 1 };
        int result = lis.method1(nums);
        assertEquals(5, result);
    }

    @Test
    public void testMethod2WithDescendingOrder() {
        LIS lis = new LIS();
        int[] nums = { 5, 4, 3, 2, 1 };
        int result = lis.method2(nums);
        assertEquals(5, result);
    }
}