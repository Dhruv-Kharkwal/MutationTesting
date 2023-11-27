package com.example.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoOfProvincesTest {
    @Test
    public void testFindCircleNum() {
        NoOfProvinces obj = new NoOfProvinces();

        // Test case 1
        int[][] isConnected1 = {
                { 1, 1, 0 },
                { 1, 1, 0 },
                { 0, 0, 1 }
        };
        assertEquals(2, obj.findCircleNum(isConnected1));

        // Test case 2
        int[][] isConnected2 = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };
        assertEquals(3, obj.findCircleNum(isConnected2));

        // Test case 3
        int[][] isConnected3 = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        assertEquals(1, obj.findCircleNum(isConnected3));

        // Test case 4
        // int[][] isConnected4 = {
        // {1, 0, 1},
        // {0, 1, 0},
        // {1, 0, 1}
        // };
        // assertEquals(3, obj.findCircleNum(isConnected4));

        // Test case 5
        int[][] isConnected5 = {
                { 1, 0, 0, 1 },
                { 0, 1, 1, 0 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 1 }
        };
        assertEquals(1, obj.findCircleNum(isConnected5));
    }
}