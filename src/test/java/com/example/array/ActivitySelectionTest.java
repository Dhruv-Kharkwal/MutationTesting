package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ActivitySelectionTest {
    @Test
    public void testActivitySelection() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        ArrayList<Integer> result = ActivitySelection.activitySelection(start, end);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 4));

        assertEquals(expected, result);
    }

    @Test
    public void testSingleActivity() {
        int start[] = { 1 };
        int end[] = { 2 };

        ArrayList<Integer> result = ActivitySelection.activitySelection(start, end);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));

        assertEquals(expected, result);
    }

    @Test
    public void testNoOverlap() {
        int start[] = { 1, 2, 3 };
        int end[] = { 2, 3, 4 };

        ArrayList<Integer> result = ActivitySelection.activitySelection(start, end);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2));

        assertEquals(expected, result);
    }
}
