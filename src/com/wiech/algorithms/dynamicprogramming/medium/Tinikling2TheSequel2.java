package com.wiech.algorithms.dynamicprogramming.medium;

import java.util.*;

public class Tinikling2TheSequel2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t > 0) {
            int n = in.nextInt();
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = in.nextInt();
            }
            System.out.println(dance(d));
            t--;
        }
    }

    private static int dance(int[] arr) {

        long sum = 0; int skipped = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int element : arr) {

            sum += element;
            if (sum >= 0 && element < 0) {
                queue.offer(element);
            } else if (sum < 0 && !queue.isEmpty() && queue.peek() < element) {
                sum -= queue.poll();
                if (sum >= 0) queue.offer(element);
                skipped++;
            }
            if (sum < 0) {
                sum -= element;
                skipped++;
            }
        }
        return skipped;
    }
}
