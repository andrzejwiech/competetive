package com.wiech.algorithms.recursion.easy;

public class Shop {

    public int max(int price[][], int money) {
        return max(price, money, 0);
    }

    private int max(int[][] price, int money, int n) {
        if (money < 0) {
            return Integer.MIN_VALUE;
        }
        if (n == price.length) {
            return 0;
        }
        int currentMax = 0;
        for (int i = 0; i < price[n].length; i++) {
            currentMax = Math.max(currentMax, price[n][i] + max(price, money - price[n][i],n + 1));
        }
        return currentMax;
    }
}
