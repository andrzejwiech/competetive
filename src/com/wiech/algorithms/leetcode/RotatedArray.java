/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.leetcode;

public class RotatedArray {

    public void rotate(int[] nums, int k) {

        int count = 0;
        int n = nums.length;
        for(int start = 0; count < n; start++) {
            int lastValue = nums[start];
            int nextIndex = start;

            do {
                int currentNew = (nextIndex + k) % n;
                int temp = nums[currentNew];
                nums[currentNew] = lastValue;
                lastValue = temp;
                nextIndex = currentNew;
                count++;

            } while (start != nextIndex);

        }
    }

}
