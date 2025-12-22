package codility.problem_6;

//PROBLEM - future_day_predictor:
//The Scenario
//You are building a calendar app. You have an array representing the days of the week:
//String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//The user tells you what day it is today and how many days have passed since then.
//You need to tell them what day it will be in the future.
//
//Test Cases:
//Today is Monday and 3 days pass
//Expected: Thursday
//
//Today is Friday and 2 days pass
//Expected: Sunday

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
