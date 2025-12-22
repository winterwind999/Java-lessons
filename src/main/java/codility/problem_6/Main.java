package codility.problem_6;

public class Main {
    static void main() {
        Solution solution = new Solution();

//        Test Case 1
        String today1 = "Monday";
        int daysPassed1 = 3;
        System.out.println(solution.solution(today1, daysPassed1));
//        Expected:
//        Thursday

//        Test Case 2
        String today2 = "Friday";
        int daysPassed2 = 2;
        System.out.println(solution.solution(today2, daysPassed2));
//        Expected:
//        Sunday

//        Test Case 3
        String today3 = "Wednesday";
        int daysPassed3 = 100;
        System.out.println(solution.solution(today3, daysPassed3));
//        Expected:
//        Friday

//        Test Case 4
        String today4 = "Sunday";
        int daysPassed4 = -3;
        System.out.println(solution.solution(today4, daysPassed4));
//        Expected:
//        Thursday
    }
}
