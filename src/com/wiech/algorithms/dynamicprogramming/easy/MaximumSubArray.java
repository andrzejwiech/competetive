package com.wiech.algorithms.dynamicprogramming.easy;

public class MaximumSubArray {

    public int max(int[] arr) {

        int sum = 0;  int max = Integer.MIN_VALUE;

        for (int element : arr) {
            sum += element;
            max = Math.max(max, sum);
            sum = sum < 0 ? 0 : sum;
        }
        return max;
    }
}
