package codility.problem_2;

public class Main {
    static void main() {
        Solution solution = new Solution();

//        test case 1
//        int[] A = new int[] {2, 1, 4, 3, 2, 1, 1, 4};
//        int L = 2;
//        int R = 4;
//        correct output:
//        3

//        test case 2
//        int[] A = new int[] {(int) Math.pow(10, 9), 1, 1, 1, 1, 1, (int) Math.pow(10, 9) - 1};
//        int L = (int) Math.pow(10, 9) - 1;
//        int R = (int) Math.pow(10, 9);
//        correct output:
//        7

//        test case 3
        int[] A = new int[] {1, 3, 5, 7};
        int L = 3;
        int R = 5;
//        correct output:
//        -1

        int result = solution.solution(A, L, R);

//        System.out.println(Arrays.toString(A) + " " + L + " " + R);
        System.out.println(result);
    }
}

