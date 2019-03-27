package com.wiech.algorithms.recursion.easy;

public class StringPermutation {

    public void permute(String value) {
        permute(0, value.toCharArray());
    }

    private void permute(int start, char[] value) {
        if (start == value.length - 1) {
            System.out.println(value);
            return;
        }
        for (int i = start; i < value.length; i++) {
            swap(start, i, value);
            permute(start + 1, value);
            swap(start, i, value);
        }
    }

    private void swap(int start, int i, char[] chars) {
        char temp = chars[start];
        chars[start] = chars[i];
        chars[i] = temp;
    }
}
