package codility.problem_4;

import java.util.HashSet;
import java.util.Set;

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
