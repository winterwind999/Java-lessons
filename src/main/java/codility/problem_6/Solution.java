package codility.problem_6;

import java.util.Arrays;

public class Solution {
    public String solution(String today, int daysPassed) {
        String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int todayIndex = Arrays.asList(days).indexOf(today);
        if (todayIndex == -1) {
            return "Invalid day";
        }

        return days[((todayIndex + daysPassed) % days.length + days.length) % days.length];
    }
}
