package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    // Function to perform activity selection
    public static ArrayList<Integer> activitySelection(int startTimes[], int endTimes[]) {
        int n = startTimes.length;
        int activities[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            activities[i][0] = i; // Assign activity index
            activities[i][1] = startTimes[i]; // Assign start time
            activities[i][2] = endTimes[i]; // Assign end time
        }

        // Sort activities by their end times in ascending order.
        Arrays.sort(activities, Comparator.comparingDouble(activity -> activity[2]));
        int lastEndTime;
        ArrayList<Integer> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities[0][0]);
        lastEndTime = activities[0][2];

        // Iterate through sorted activities to select compatible ones.
        for (int i = 1; i < n; i++) {
            if (activities[i][1] >= lastEndTime) {
                selectedActivities.add(activities[i][0]);
                lastEndTime = activities[i][2];
            }
        }
        return selectedActivities;
    }
}
