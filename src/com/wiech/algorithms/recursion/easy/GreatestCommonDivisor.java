package com.wiech.algorithms.recursion.easy;

public class GreatestCommonDivisor {

    public int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}
