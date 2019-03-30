package com.wiech.algorithms.general.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Andrzej Wiech
 */
class AddUp {

    boolean hasPairWitSum(int values[], int sum) {

        Set<Integer> compounds = new HashSet<>();

        for (int value : values) {
            if (compounds.contains(value)) {
                return true;
            }
            compounds.add(sum - value);
        }
        return false;
    }
}
