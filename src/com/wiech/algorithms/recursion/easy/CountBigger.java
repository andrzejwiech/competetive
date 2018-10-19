package com.wiech.algorithms.recursion.easy;

public class CountBigger {

    public int count(int n, int k) {
        if (n == 0 && k == 0)
            return 1;
        else if (n == 0)
            return 0;
        else
            return (n % 10 >= k ? 1 : 0) + count(n / 10, k);

    }
}
