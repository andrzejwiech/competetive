package com.wiech.algorithms.recursion.easy;

import static java.lang.Math.abs;

public class NumberOfZeros {

    public int count(int n) {
        if (n == 0)
            return 1;
        else if (abs(n) <= 9)
            return 0;
        else
            return (n % 10 == 0 ? 1 : 0) + count(n / 10);
    }
}
