package com.example.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestPathBinaryMatrixTest {
    @Test
    public void testShortestPathBinaryMatrix() {
        ShortestPathBinaryMatrix shortestPathBinaryMatrix = new ShortestPathBinaryMatrix();

        // Test case 1: Basic test
        int[][] grid1 = {
                { 0, 0, 0 },
                { 1, 1, 0 },
                { 1, 1, 0 }
        };
        int expected1 = 4;
        assertEquals(expected1, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid1));

        // Test case 2: No valid path
        int[][] grid2 = {
                { 1, 0, 0 },
                { 1, 1, 0 },
                { 1, 1, 0 }
        };
        int expected2 = -1;
        assertEquals(expected2, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid2));

        // // Test case 3: Larger grid with a valid path
        // int[][] grid3 = {
        // { 0, 1, 0, 0, 0 },
        // { 0, 1, 0, 1, 0 },
        // { 0, 0, 0, 0, 0 },
        // { 1, 0, 1, 0, 0 },
        // { 0, 0, 0, 0, 0 }
        // };
        // int expected3 = 9;
        // assertEquals(expected3,
        // shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid3));

        // Test case 4: Larger grid with no valid path
        // int[][] grid4 = {
        // { 0, 1, 0, 0, 0 },
        // { 0, 1, 0, 1, 0 },
        // { 0, 1, 0, 0, 0 },
        // { 1, 0, 1, 0, 0 },
        // { 0, 0, 0, 0, 0 }
        // };
        // int expected4 = -1;
        // assertEquals(expected4,
        // shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid4));

        // Test case 5: Grid with only one cell
        int[][] grid5 = { { 0 } };
        int expected5 = 1;
        assertEquals(expected5,
                shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid5));

        // // Test case 6: Grid with no 0 cells
        int[][] grid6 = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        int expected6 = -1;
        assertEquals(expected6,
                shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid6));

    }
}
