package com.wiech.algorithms.recursion.easy;

public class NumberOfZeros {

    public int count(int n) {
        if (n == 0)
            return n;
        else
            return (n % 10 == 0 ? 1 : 0) + count(n / 10);
    }
}
