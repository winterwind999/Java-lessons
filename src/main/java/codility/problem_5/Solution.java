package codility.problem_5;

import java.util.Arrays;

public class Solution {
//    public int solution(int[] A) {
//        int smallestGap = Integer.MAX_VALUE;
//
//        for (int i = 0; i < A.length; i++) {
//            int temp = A[0];
//            for (int j = 1; j < A.length; j++) {
//                A[j - 1] = A[j];
//            }
//            A[A.length - 1] = temp;
//
//            for (int j = 0; j < A.length - 1; j++) {
//                int diff = Math.abs(A[j] - A[j + 1]);
//                System.out.println("diff " + diff);
//
//                if (diff < smallestGap) {
//                    smallestGap = diff;
//                }
//            }
//        }
//
//        if (smallestGap == Integer.MAX_VALUE) {
//            return -1;
//        } else {
//            return smallestGap;
//        }
//    }

    public int solution(int[] A) {
        if (A.length < 2) {
            return 0;
        }

        int smallestGap = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            int diff = Math.abs(A[i] - A[(i + 1) % A.length]);

            System.out.println("A[i] " + A[i]);
            System.out.println("A[(i + 1) % A.length] " + A[(i + 1) % A.length]);
            System.out.println("diff " + diff);
            System.out.println("smallestGap " + smallestGap);
            System.out.println();

            if (diff < smallestGap) {
                smallestGap = diff;
            }
        }

        return smallestGap;
    }
}

