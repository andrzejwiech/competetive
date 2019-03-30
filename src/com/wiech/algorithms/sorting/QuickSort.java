/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.sorting;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println("cat".substring(0, "cat".length()-1));
        System.out.println(strCount("cat", "cat"));
    }

    public static int strCount(String str, String sub) {

        if (sub.length() > str.length())
            return 0;

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);

    }

}
