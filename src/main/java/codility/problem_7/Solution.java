package codility.problem_7;

public class Solution {
    public int solution(int startPosition, int shift) {
        return ((startPosition + shift) % 10 + 10) % 10;
    }
}
