package com.wiech.algorithms.recursion.easy;

public class Sum {

    public int sum(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }
}
