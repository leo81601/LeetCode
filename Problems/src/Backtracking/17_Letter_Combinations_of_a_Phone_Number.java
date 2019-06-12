package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 * Related Topics: String, Backtracking
 */

class Letter_Combinations_of_a_Phone_Number {
    private String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxzy"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) return list;
        combination("", digits, 0, list);
        return list;
    }

    private void combination(String letter, String number, int index, List<String> list) {
        if (index >= number.length()) {
            list.add(letter);
            return;
        }
        String letters = keys[(number.charAt(index) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(letter + letters.charAt(i), number, index + 1, list);
        }
    }
}
