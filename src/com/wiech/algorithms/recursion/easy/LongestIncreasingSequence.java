package com.wiech.algorithms.recursion.easy;

public class LongestIncreasingSequence {

    public int max(int[] sequence) {
        return max(sequence, 0, Integer.MIN_VALUE);
    }

    private int max(int[] sequence, int n, int last) {
        if (n == sequence.length) {
            return 0;
        }
        if (sequence[n] <= last) {
            return max(sequence, n + 1, last);
        }
        return Math.max(max(sequence, n + 1, last), 1 + max(sequence, n + 1, sequence[n]));
    }
}
