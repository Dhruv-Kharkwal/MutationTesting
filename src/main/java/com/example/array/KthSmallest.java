package com.example.array;

public class KthSmallest {
    public int count(int[] nums, int mid) {
        int cnt = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] <= mid)
                cnt++;

        return cnt;
    }

    public int kthSmallest(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (count(nums, mid) < k)
                low = mid + 1;

            else
                high = mid;
        }

        return low;
    }
}
