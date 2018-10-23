package com.wiech.algorithms.dynamicprogramming.easy;

import static java.lang.Math.max;
import java.util.Arrays;

public class LongestIncreasingSubsequence {

    /**
     * O(n^2)
     */
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

    /**
     * O(nlogn)
     */
    public int longest2(int[] arr) {

        int[] result = new int[arr.length];
        int len = 1;
        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result[0])
                result[0] = arr[0];
            else if (arr[i] > result[len - 1])
                result[len++] = arr[i];
            else
                result[replace(result, len - 1, arr[i])] = arr[i];

        }
        return len;
    }

    private int replace(int[] arr, int end, int element) {
        int start = 0;

        while (start != end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > element)
                end = middle;
            else
                start = middle + 1;
        }
        return end;
    }
}
