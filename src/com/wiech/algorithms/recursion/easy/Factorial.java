package com.wiech.algorithms.recursion.easy;


public class Factorial {

    public int factorial(int n) {
        return n < 1 ? 1 : n * factorial(n - 1);
    }
}
