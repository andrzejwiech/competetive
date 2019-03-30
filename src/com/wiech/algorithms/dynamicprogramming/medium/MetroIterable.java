package com.wiech.algorithms.dynamicprogramming.medium;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
import static java.math.RoundingMode.HALF_UP;
import java.math.BigDecimal;
import java.util.*;

public class MetroIterable {

    private static final double DIAGONAL_DISTANCE = 100 * sqrt(2);

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "33");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); int m = in.nextInt(); int k = in.nextInt();

        Map<Integer, List<Integer>> diagonals = new TreeMap<>();

        for (int i = 0; i < k; i++) {
            int x = in.nextInt(); int y = in.nextInt();
            List<Integer> row = diagonals.get(y);
            row = row == null ? new ArrayList<>() : row;
            row.add(x);
            diagonals.put(y, row);
        }
        out.println(BigDecimal.valueOf(new MetroIterable().cost(n, m, diagonals)).setScale(0, HALF_UP));
    }

    private double cost(int n, int m,  Map<Integer, List<Integer>> diagonal) {

        double min = (n + m) * 100;
        double[][] state = new double[m + 1][n + 1];
        Object[] keys = diagonal.keySet().toArray();
        int i = 0;

        for (Map.Entry<Integer, List<Integer>> entry : diagonal.entrySet()) {

            int y = entry.getKey();
            for (int x : entry.getValue()) {

                state[y][x] = DIAGONAL_DISTANCE + (x + y - 2) * 100;
                boolean notFound = true;
                int previous = i;
                while (previous - 1 >= 0 && notFound) {
                    int previousY = (int) keys[previous - 1];
                    int previousX = getPreviousX(diagonal.get(previousY), x);
                    if (previousX != -1) {
                        state[y][x] = state[previousY][previousX] + DIAGONAL_DISTANCE + getDistanceBetweenDiagonals(y, x, previousY, previousX);
                        notFound = false;
                    }
                    previous--;
                }
                min = min(min, state[y][x] + getDistanceTillEnd(n, m, y, x));
            }
            i++;
        }
        return min;
    }

    private int getDistanceTillEnd(int n, int m, int y, int x) {
        return (m - x + n - y) * 100;
    }

    private int getDistanceBetweenDiagonals(int y, int x, int previousY, int previousX) {
        return (x - previousX + y - previousY - 2) * 100;
    }

    private int getPreviousX(List<Integer> previousDiagonals, int x) {

        for (int i = previousDiagonals.size() - 1; i >= 0; i--) {
            if (previousDiagonals.get(i) < x)
                return previousDiagonals.get(i);
        }
        return -1;
    }
}
