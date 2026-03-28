package codility.problem_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
