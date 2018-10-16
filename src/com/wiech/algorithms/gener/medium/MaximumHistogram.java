package com.wiech.algorithms.gener.medium;

import java.util.Stack;

public class MaximumHistogram {

    public int max(int[] hist) {

        Stack<Integer> s = new Stack<>();
        int i = 0;
        int max = Integer.MIN_VALUE;

        while (i < hist.length) {
            if (s.isEmpty() || hist[s.peek()] <= hist[i]) {
                s.push(i++);
            } else {
                Integer last = s.pop();
                int h = hist[last];
                int w = s.isEmpty() ? i : i - s.peek() - 1;
                max = Math.max(h * w, max);
            }
        }
        while (!s.isEmpty()) {
            Integer last = s.pop();
            int h = hist[last];
            int w = s.isEmpty() ? i : i - s.peek() - 1;
            max = Math.max(h * w, max);
        }
        return max;
    }
}
