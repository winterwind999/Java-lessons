package codility.problem_4;

public class Main {
    static void main() {
        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.solution("aab"));
        // Expected: 1

        // Test Case 2
        System.out.println(solution.solution("aaa"));
        // Expected: 3

        // Test Case 3
        System.out.println(solution.solution("abca"));
        // Expected: 0

        // Test Case 4
        System.out.println(solution.solution("race"));
        // Expected: 0

        // Test Case 5
        System.out.println(solution.solution("rotator"));
        // Expected: 1
    }
}
