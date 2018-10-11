package com.wiech.algorithms.dynamicprogramming.easy;

/**
 * Based on Kadane's algorithm -> O(n^3)
 */
public class MaximumSubMatrix {

    private MaximumSubArray maximumSubArray;

    public MaximumSubMatrix() {
        this.maximumSubArray = new MaximumSubArray();
    }

    public int max(int[][] matrix) {

        int max = Integer.MIN_VALUE; int l = matrix.length;

        for (int k = 0; k < l; k++) {
            int[] kadane = new int[l];
            for (int n = k; n < l; n++) {
                for (int m = 0; m < l; m++) {
                    kadane[m] += matrix[m][n];
                }
                max = Math.max(max, maximumSubArray.max(kadane));
            }
        }
        return max;
    }
}
