package com.example.graph;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveStoneTest {

    @Test
    public void testRemoveStones() {
        RemoveStone removeStone = new RemoveStone();

        // Test case 2: Single stone
        int[][] stones1 = { { 0, 0 } };
        assertEquals(0, removeStone.removeStones(stones1));

        int[][] stones2 = { { 0, 0 }, { 0, 1 } };
        assertEquals(1, removeStone.removeStones(stones2));

        int[][] stones3 = { { 0, 0 }, { 0, 1 }, { 1, 0 } };
        assertEquals(2, removeStone.removeStones(stones3));

        int[][] stones4 = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 2 } };
        assertEquals(3, removeStone.removeStones(stones4));

        int[][] stones5 = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 2 }, { 2, 1 } };
        assertEquals(4, removeStone.removeStones(stones5));

        int[][] stones6 = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 2 }, { 2, 1 }, { 2, 2 } };
        assertEquals(5, removeStone.removeStones(stones6));

    }
}