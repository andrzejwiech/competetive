/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.equals("")) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        letterCombinations(digits, "", result);
        return result;
    }

    public String letterCombinations(String toDo, String value, List<String> result) {

        if (toDo.isEmpty()) {
            result.add(value);
            return value;
        }

        String letters = KEYS[toDo.charAt(0) - '0'];
        for (char letter : letters.toCharArray()) {
            letterCombinations(toDo.substring(1), value + letter, result);
        }
        return value;
    }
}
