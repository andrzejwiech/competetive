package com.wiech.algorithms.recursion.easy;

public class KnackSack {

    public int max(int value[], int weight[], int capacity) {
        return max(value, weight, capacity, value.length - 1);
    }

    private int max(int[] values, int[] weights, int capacity, int n) {
        if (capacity == 0 || n < 0) {
            return 0;
        }
        if (weights[n] > capacity) {
            return max(values, weights, capacity, n - 1);
        }
        int maxIn = values[n] + max(values, weights, capacity - weights[n], n - 1);
        int maxOut = max(values, weights, capacity, n - 1);

        return Math.max(maxIn, maxOut);
    }
}
