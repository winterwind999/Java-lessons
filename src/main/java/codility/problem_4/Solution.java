package codility.problem_4;

import java.util.HashSet;
import java.util.Set;

//PROBLEM - rotate_and_count_palindromes:
//
//Given a string S, generate all unique rotations of the string and count how many are palindromes.
//
//A rotation is created by moving characters from the start to the end.
//
//Example:
//“aab” → “aab”, “aba”, “baa”

public class Solution {
    public int solution(String S) {
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            String possibility = S.substring(1) + S.charAt(0);

            int left = 0;
            int right = possibility.length() - 1;
            boolean isPalindrome = false;

            while (left < right) {
                if (possibility.charAt(left) != possibility.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                isPalindrome = true;
                left++;
                right--;
            }

            if (isPalindrome) {
                count++;
            }

            S = possibility;
        }

        return count;
    }
}
