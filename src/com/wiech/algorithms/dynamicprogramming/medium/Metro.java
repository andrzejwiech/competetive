package com.wiech.algorithms.dynamicprogramming.medium;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Math.min;
import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 * 1119. Metro -> http://acm.timus.ru/problem.aspx?space=1&num=1119
*/
public class Metro {

    public double cost(int n, int m, int[][] d) {
        double[][] cache = new double[n + 1][m + 1];
        for (double[] row : cache)
            Arrays.fill(row, MAX_VALUE);
        return cost(n, m, d, cache);
    }

    private double cost(int n, int m, int[][] diagonal, double[][] cache) {
        if (n == 0 && m == 0) return 0;

        if (cache[n][m] == MAX_VALUE) {
            if (diagonal[n][m] == 1)
                return cache[n][m] = min(cache[n][m], 100 * sqrt(2) + cost(n - 1, m - 1, diagonal, cache));
            if (m != 0)
                cache[n][m] = min(cache[n][m], 100 + cost(n, m - 1, diagonal, cache));
            if (n != 0)
                cache[n][m] = min(cache[n][m], 100 + cost(n - 1, m, diagonal, cache));
        }
        return cache[n][m];
    }
}
