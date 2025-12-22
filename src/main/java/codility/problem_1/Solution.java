package codility.problem_1;

//PROBLEM - format_array:
//
//You are given an array of integers A and a positive integer K. Your task is to print the numbers in a tabular format, such that:
//Each row contains at most K numbers.
//Each number is displayed inside a cell that:
//Has exactly one number
//Is surrounded by exactly four edges
//Uses:
//+ for corners
//- for horizontal edges
//| for vertical edges
//The width of each cell is determined by the number of digits of the largest number in the array.
//Numbers inside cells are right-aligned.
//Any unused space is filled with spaces.
//Adjacent cells share edges:
//No extra spaces between cells horizontally
//No extra edges between rows vertically
//Rows are filled left to right.
//If the last row has fewer than K numbers, print only the remaining numbers.
//
//Input
//int[] A — array of integers to print
//int K — maximum number of numbers per row (1 ≤ K ≤ A.length)

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
