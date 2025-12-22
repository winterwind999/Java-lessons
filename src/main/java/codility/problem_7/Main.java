package codility.problem_7;


public class Main {
    static void main() {
        Solution solution = new Solution();

//        Test Case 1
        int startPosition1 = 3;
        int shift1 = 7;
        System.out.println(solution.solution(startPosition1, shift1));
//        Expected:
//        1

//        Test Case 2
        int startPosition2 = 1;
        int shift2 = -5;
        System.out.println(solution.solution(startPosition2, shift2));
//        Expected:
//        22

//        Test Case 3
        int startPosition3 = 0;
        int shift3 = 100;
        System.out.println(solution.solution(startPosition3, shift3));
//        Expected:
//        22
    }
}
