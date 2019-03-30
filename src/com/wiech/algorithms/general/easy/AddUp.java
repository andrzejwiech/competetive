package com.wiech.algorithms.general.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrzej Wiech
 */
class AddUp {

    public static void main(String[] args) {
        test();
    }

    static void test() {

        int[] flights = new int[] {1, 2, 3, 4, 5};

        for(int flight: flights) {
            if (flight == 1){
                System.out.println("Bravo lecisz pierwszym lotem");
            } else {
                System.out.println("Lot number " + flight);
            }

        }


    }
}
