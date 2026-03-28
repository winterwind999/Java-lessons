package codility.problem_1;

class Solution {
    public void solution(int[] A, int K) {
        if (A == null || A.length == 0) {
            return;
        }

        // 1. Find the maximum width needed based on the largest number
        int maxWidth = 0;
        for (int num : A) {
            maxWidth = Math.max(maxWidth, String.valueOf(num).length());
        }

        // 2. Pre-calculate the horizontal border segment (e.g., "+-----")
        String borderSegment = "+" + "-".repeat(maxWidth);

        // 3. Iterate through the array in chunks of K (each chunk is a row)
        for (int i = 0; i < A.length; i += K) {
            int remainingElements = A.length - i;
            int currentRowSize = Math.min(K, remainingElements);

            // Print the top border for the very first row
            if (i == 0) {
                printBorder(currentRowSize, borderSegment);
            }

            // Print the row of numbers
            for (int j = 0; j < currentRowSize; j++) {
                // Right-align the number within the calculated maxWidth
                System.out.printf("|%" + maxWidth + "d", A[i + j]);
                // 00 01 02 03
                // 40 41 42 43
                // 81 82 83 84
            }
            System.out.println("|"); // Closing edge of the row

            // Print the bottom border for the current row
            printBorder(currentRowSize, borderSegment);
        }
    }

    private void printBorder(int count, String segment) {
        for (int i = 0; i < count; i++) {
            System.out.print(segment);
        }
        System.out.println("+");
    }
}
