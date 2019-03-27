package com.wiech.algorithms.recursion.backtracking;

public class Sum {

    public boolean sum(int nums[], int target) {
        return sum(0, nums, target);
    }

    private boolean sum(int start, int[] nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }
        if (sum(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (sum(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

}
