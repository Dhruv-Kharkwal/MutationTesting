package com.example.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KruskalTest {

    @Test
    public void testMinCostConnectPoints() {
        Kruskal obj = new Kruskal();

        int[][] points1 = { { 0, 0 }, { 2, 2 }, { 3, 10 }, { 5, 2 }, { 7, 0 } };
        assertEquals(20, obj.minCostConnectPoints(points1));

        int[][] points2 = { { 3, 12 }, { -2, 5 }, { -4, 1 } };
        assertEquals(18, obj.minCostConnectPoints(points2));

        int[][] points3 = { { 1, 2 } };
        assertEquals(0, obj.minCostConnectPoints(points3));

        int[][] points4 = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 3, 1 } };
        assertEquals(5, obj.minCostConnectPoints(points4));
    }
}
