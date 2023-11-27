package com.example.array;

public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int n = nums.length; // size of the array.
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

}
