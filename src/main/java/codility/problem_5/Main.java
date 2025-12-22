package codility.problem_5;

public class Main {
    static void main() {
        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.solution(new int[] {5,1,9}));
        //Expected: 4

        // Test Case 2
        System.out.println(solution.solution(new int[] {4,4,4}));
        //Expected: 0

        // Test Case 3
        System.out.println(solution.solution(new int[] {1,3,2}));
        //Expected: 1

        // Test Case 4
        System.out.println(solution.solution(new int[] {8,15,7,2}));
        //Expected: 5

        // Test Case 5
        System.out.println(solution.solution(new int[] {10,20,30,40}));
        //Expected: 10
    }
}
