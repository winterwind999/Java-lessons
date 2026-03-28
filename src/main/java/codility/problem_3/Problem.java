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

public class Problem {
    public boolean problem(String moves) {
        return false;
    }
}
