package com.example.dynamicProgramming;

import java.util.Arrays;

public class LIS {
    public int method1(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int max = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                    max = Math.max(dp[i], max);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                ans += count[i];
            }
        }
        return ans;

    }

    public int method2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] lis = new int[n];
        int[] fq = new int[n];
        lis[0] = 1;
        fq[0] = 1;
        int lo = 1;

        for (int i = 1; i < nums.length; i++) {
            int mx = 0;
            int c = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (lis[j] > mx) {
                        mx = lis[j];
                        c = fq[j];
                    } else if (lis[j] == mx) {
                        c += fq[j];
                    }
                }
            }
            fq[i] = c;
            lis[i] = mx + 1;
            if (lo < lis[i]) {
                lo = lis[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (lis[i] == lo) {
                count += fq[i];
            }
        }

        return count;
    }
}
