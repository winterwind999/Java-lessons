package codility.problem_3;

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
