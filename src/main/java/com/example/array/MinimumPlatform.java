package com.example.array;

import java.util.ArrayList;
import java.util.List;

public class MinimumPlatform {
    public int findPlatform1(int arr[], int dep[], int n) {
        int plat_needed = 1, result = 1;

        for (int i = 0; i < n; i++) {
            plat_needed = 1;

            for (int j = 0; j < n; j++) {
                if (i != j)
                    // check for overlap
                    if (arr[i] >= arr[j]
                            && dep[j] >= arr[i])
                        plat_needed++;
            }
            result = Math.max(result, plat_needed);
        }
        return result;
    }

    public int findPlatform2(int[] arr, int[] dep, int n) {
        int count = 0, maxPlatforms = 0;
        // Find the maximum departure time
        int maxDepartureTime = dep[0];
        for (int i = 1; i < n; i++) {
            maxDepartureTime = Math.max(maxDepartureTime, dep[i]);
        }
        List<Integer> v = new ArrayList<>(maxDepartureTime + 2);
        for (int i = 0; i < maxDepartureTime + 2; i++) {
            v.add(0);
        }
        for (int i = 0; i < n; i++) {
            v.set(arr[i], v.get(arr[i]) + 1);
            v.set(dep[i] + 1, v.get(dep[i] + 1) - 1);
        }
        for (int i = 0; i <= maxDepartureTime + 1; i++) {
            count += v.get(i);
            maxPlatforms = Math.max(maxPlatforms, count);
        }

        return maxPlatforms;
    }

}
