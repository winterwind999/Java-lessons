package codility.problem_3;

//PROBLEM - check_rectangle:
//
//A drawing robot is positioned at point (0, 0) of a coordinate plane, and the string moves describes the path the robot will take.
//Each of the strings's characters describes a single move made by the robot. Moreover, the robot will make the moves
//in the exact same order as they appear in the string, starting from position (0, 0).
//
//Assuming the robot has already made some moves from the string, and is currently at point (x, y), if the next character of the string is:
//"^": the robot will move to (x, y + 1);
//"v": the robot will move to (x, y - 1);
//"<": the robot will move to (x - 1, y);
//">": the robot will move to (x + 1, y).
//
//Each time the robot moves, it draws a line between its current position and the point to which it moves.
//It is guaranteed that the instructions provided in the string moves will never cause the robot to visit the same point
//more than once, with the exception of point (0, 0), which might be visited by the robot exactly twice: at the beginning and at the end of the robot's path.
//The task is to determine whether, after the robot has made all moves provided in the string, all the lines it has drawn form a single rectangle.

class Solution {
    public boolean solution(String moves) {
        if (moves == null || moves.length() < 4) {
            return false;
        }

        int x = 0;
        int y = 0;
        int turns = 0;

        for (int i = 0; i < moves.length(); i++) {
            char current = moves.charAt(i);

            // 1. Move the robot
            if (current == '^') {
                y++;
            } else if (current == 'v') {
                y--;
            } else if (current == '<') {
                x--;
            } else if (current == '>') {
                x++;
            }

            // 2. Look for Turns and Backtracking
            if (i < moves.length() - 1) {
                char next = moves.charAt(i + 1);

                if (current != next) {
                    // It's a turn!
                    turns++;

                    // No "U-Turns" on the same line!
                    // If you go Up, you can't immediately go Down.
                    if ((current == '^' && next == 'v') || (current == 'v' && next == '^')) {
                        return false;
                    }
                    if ((current == '<' && next == '>') || (current == '>' && next == '<')) {
                        return false;
                    }
                }
            }
        }

        // Final Check: Home at (0,0) and exactly 3 turns.
        return (x == 0 && y == 0 && turns == 3);
    }
}
