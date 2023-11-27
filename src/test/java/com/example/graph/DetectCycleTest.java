package com.example.graph;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class DetectCycleTest {

    DetectCycle obj = new DetectCycle();

    @Test
    public void testEmptyGraph() {
        ArrayList<ArrayList<Integer>> emptyGraph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            emptyGraph.add(new ArrayList<>());
        }
        assertEquals(false, obj.isCycleBFS(3, emptyGraph));
    }

    @Test
    public void testSingleNodeNoEdges() {
        ArrayList<ArrayList<Integer>> singleNodeGraph = new ArrayList<>();
        singleNodeGraph.add(new ArrayList<>());
        assertEquals(false, obj.isCycleBFS(1, singleNodeGraph));
    }

    @Test
    public void testDisconnectedTwoNodeGraph() {
        ArrayList<ArrayList<Integer>> disconnectedTwoNodeGraph = new ArrayList<>();
        disconnectedTwoNodeGraph.add(new ArrayList<>());
        disconnectedTwoNodeGraph.add(new ArrayList<>());
        assertEquals(false, obj.isCycleBFS(2, disconnectedTwoNodeGraph));
    }

    @Test
    public void testAcyclicThreeNodeGraph() {
        ArrayList<ArrayList<Integer>> acyclicThreeNodeGraph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            acyclicThreeNodeGraph.add(new ArrayList<>());
        }
        acyclicThreeNodeGraph.get(0).add(1);
        acyclicThreeNodeGraph.get(1).add(0);
        acyclicThreeNodeGraph.get(1).add(2);
        acyclicThreeNodeGraph.get(2).add(1);
        assertEquals(false, obj.isCycleBFS(3, acyclicThreeNodeGraph));
    }

    @Test
    public void testCyclicFourNodeGraph() {
        ArrayList<ArrayList<Integer>> cyclicFourNodeGraph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            cyclicFourNodeGraph.add(new ArrayList<>());
        }
        cyclicFourNodeGraph.get(0).add(1);
        cyclicFourNodeGraph.get(1).add(0);
        cyclicFourNodeGraph.get(1).add(2);
        cyclicFourNodeGraph.get(2).add(1);
        cyclicFourNodeGraph.get(2).add(3);
        cyclicFourNodeGraph.get(3).add(2);
        cyclicFourNodeGraph.get(3).add(0);
        assertEquals(true, obj.isCycleBFS(4, cyclicFourNodeGraph));
    }

    @Test
    public void testEmptyGraph1() {
        ArrayList<ArrayList<Integer>> emptyGraph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            emptyGraph.add(new ArrayList<>());
        }
        assertEquals(false, obj.isCycleDFS(3, emptyGraph));
    }

    @Test
    public void testSingleNodeNoEdges1() {
        ArrayList<ArrayList<Integer>> singleNodeGraph = new ArrayList<>();
        singleNodeGraph.add(new ArrayList<>());
        assertEquals(false, obj.isCycleDFS(1, singleNodeGraph));
    }

    @Test
    public void testDisconnectedTwoNodeGraph1() {
        ArrayList<ArrayList<Integer>> disconnectedTwoNodeGraph = new ArrayList<>();
        disconnectedTwoNodeGraph.add(new ArrayList<>());
        disconnectedTwoNodeGraph.add(new ArrayList<>());
        assertEquals(false, obj.isCycleDFS(2, disconnectedTwoNodeGraph));
    }

    @Test
    public void testAcyclicThreeNodeGraph1() {
        ArrayList<ArrayList<Integer>> acyclicThreeNodeGraph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            acyclicThreeNodeGraph.add(new ArrayList<>());
        }
        acyclicThreeNodeGraph.get(0).add(1);
        acyclicThreeNodeGraph.get(1).add(0);
        acyclicThreeNodeGraph.get(1).add(2);
        acyclicThreeNodeGraph.get(2).add(1);
        assertEquals(false, obj.isCycleDFS(3, acyclicThreeNodeGraph));
    }

    @Test
    public void testCyclicFourNodeGraph1() {
        ArrayList<ArrayList<Integer>> cyclicFourNodeGraph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            cyclicFourNodeGraph.add(new ArrayList<>());
        }
        cyclicFourNodeGraph.get(0).add(1);
        cyclicFourNodeGraph.get(1).add(0);
        cyclicFourNodeGraph.get(1).add(2);
        cyclicFourNodeGraph.get(2).add(1);
        cyclicFourNodeGraph.get(2).add(3);
        cyclicFourNodeGraph.get(3).add(2);
        cyclicFourNodeGraph.get(3).add(0);
        assertEquals(true, obj.isCycleDFS(4, cyclicFourNodeGraph));
    }

}