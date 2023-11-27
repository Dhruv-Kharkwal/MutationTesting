package com.example.graph;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class CriticalConnectionsTest {

    @Test
    public void testCriticalConnections() {
        CriticalConnections solution = new CriticalConnections();

        // Test case 1
        int n1 = 4;
        List<List<Integer>> connections1 = new ArrayList<>();
        connections1.add(Arrays.asList(0, 1));
        connections1.add(Arrays.asList(1, 2));
        connections1.add(Arrays.asList(2, 0));
        connections1.add(Arrays.asList(1, 3));
        List<List<Integer>> result1 = solution.criticalConnections(n1, connections1);
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(1, 3));
        assertEquals(expected1, result1);

        // Test case 2
        int n2 = 5;
        List<List<Integer>> connections2 = new ArrayList<>();
        connections2.add(Arrays.asList(0, 1));
        connections2.add(Arrays.asList(1, 2));
        connections2.add(Arrays.asList(2, 0));
        connections2.add(Arrays.asList(1, 3));
        connections2.add(Arrays.asList(3, 4));
        List<List<Integer>> result2 = solution.criticalConnections(n2, connections2);
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 4));
        assertEquals(expected2, result2);
    }
}