package com.wiech.algorithms.dynamicprogramming.easy;

import static java.lang.Math.max;
import java.util.Arrays;

/**
 * O(n^2)
 */
public class LongestIncreasingSubsequence {

    public int longest(int[] arr) {

        int l = arr.length;
        int[] state = new int[l];
        Arrays.fill(state, 1);

        for (int i = 1; i < l; i++) {
            for (int j = 0; j < i; j++) {
                state[i] = max(state[i - 1], state[j] + (arr[i] > arr[j] ? 1 : 0));
            }
        }
        return state[l - 1];

    }
}
