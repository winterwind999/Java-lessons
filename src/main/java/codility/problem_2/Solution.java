package codility.problem_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//PROBLEM - find_interval_in_array:
//
//There is an array A, consisting of N integers, and two integers, L and R. Your task is to find the
//shortest fragment of consecutive elements of A that contains every integer from L to R inclusive.
//Write a function: class Solution { public int solution(int[] A, int L, int R); }
//that, given A, L, and R, returns the length of the shortest fragment of A that contains all numbers from L to R.
//If no such fragment exists, the function should return -1.
//
//Examples:
//Given A = [2, 1, 4, 3, 2, 1, 1, 4], L = 2 and R = 4, the function should return 3. The shortest fragment containing
//the numbers 2, 3 and 4 starts at the third element of A: [2, 1, 4, 3, 2, 1, 1, 4]
//Given A = [10⁹, 1, 1, 1, 1, 1, 10⁹-1], L = 10⁹-1 and R = 10⁹, the function should return 7. The fragment is the whole array.
//Given A = [1, 3, 5, 7], L = 3 and R = 5, the function should return -1. Array A does not contain the number 4.
//
//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..100,000];
//1 ≤ L ≤ R ≤ 1,000,000,000;
//each element of array A is an integer within the range [1..1,000,000,000].

class Solution {
    public int solution(int[] A, int L, int R) {
        int shortest = Integer.MAX_VALUE;
        int totalNeeded = R - L + 1;
        System.out.println("\ntotalNeeded " + totalNeeded);

        // 1. Pick a starting point
        for (int start = 0; start < A.length; start++) {

            // This set will "check off" the numbers we find
            Set<Integer> checklist = new HashSet<>();

            // 2. Look forward from this starting point
            for (int end = start; end < A.length; end++) {
                int currentNum = A[end];

                // If the number is in our range, add it to our checklist
                if (currentNum >= L && currentNum <= R) {
                    checklist.add(currentNum);
                }

                System.out.println("\ncurrentNum " + currentNum);
                System.out.println("checklist" + checklist);
                System.out.println(Arrays.toString(A) + " " + L + " " + R);

                // 3. Do we have everything?
                if (checklist.size() == totalNeeded) {
                    int currentLength = end - start + 1;
                    System.out.println("end " + end);
                    System.out.println("start " + start);
                    System.out.println("currentLength " + currentLength);

                    // Is this the shortest one we've seen so far?
                    if (currentLength < shortest) {
                        shortest = currentLength;
                    }

                    // Since we found a full set starting from 'start',
                    // no need to keep looking further for this specific start.
                    break;
                }
            }
        }

        // 4. If 'shortest' never changed, we found nothing
        if (shortest == Integer.MAX_VALUE) {
            return -1;
        } else {
            return shortest;
        }
    }
}
