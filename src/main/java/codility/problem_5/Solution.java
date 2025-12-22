package codility.problem_5;

//PROBLEM - circular_array_minimum_neighbor_difference
//
//Task:
//Given an array A of N integers, the array is considered circular, meaning the last element is adjacent to the first element.
//Your goal is to find the minimum absolute difference between any two elements that are neighbors in this circular arrangement.
//Because you can rotate the array, any two elements that are currently adjacent will remain neighbors.
//Therefore, you simply need to find the pair with the smallest difference.
//Test cases
//A = [5, 1, 9]        → 4
//# rotations: [5,1,9](max gap=8), [1,9,5](max gap=8), [9,5,1](max gap=4)
//
//A = [4,4,4]         → 0
//A = [1,3,2]         → 1
//A = [8,15,7,2]      → 5
//A = [10,20,30,40]   → 10

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

