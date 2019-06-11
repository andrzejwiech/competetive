/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinationsRecursive(String digits) {
        if(digits == null || digits.equals("")) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        letterCombinationsRecursive(digits, "", result);
        return result;
    }

    public List<String> letterCombinationsIterative(String digits) {
        if(digits == null || digits.equals("")) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        result.add("");
        for(char number: digits.toCharArray()) {
            result = combine(number - '0', result);
        }
        return result;
    }

    private List<String> combine(int offset, List<String> list) {

        List<String> result = new ArrayList<>();
        for(String entry: list) {
            for(char letter: KEYS[offset].toCharArray()) {
                result.add(entry + letter);
            }
        }
        return result;
    }

    private String letterCombinationsRecursive(String toDo, String value, List<String> result) {

        if (toDo.isEmpty()) {
            result.add(value);
            return value;
        }

        String letters = KEYS[toDo.charAt(0) - '0'];
        for (char letter : letters.toCharArray()) {
            letterCombinationsRecursive(toDo.substring(1), value + letter, result);
        }
        return value;
    }
}
