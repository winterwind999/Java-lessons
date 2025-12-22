package codility.problem_3;

public class Main {
    static void main() {
        Solution sol = new Solution();

        // TEST 1: A perfect long rectangle
        // Moves: Up 3, Left 4, Down 3, Right 4
        // Logic: Ends at (0,0) and turns exactly 3 times.
        String test1 = "^^^<<<<vvv>>>>";
        System.out.println("Test 1 (Rectangle): " + sol.solution(test1));
        // Expected: true

        // TEST 2: A perfect square
        // Moves: Left 2, Up 2, Right 2, Down 2
        // Logic: A square is just a special rectangle!
        String test2 = "<<^^>>vv";
        System.out.println("Test 2 (Square): " + sol.solution(test2));
        // Expected: true

        // TEST 3: The "Scribble" (Not a rectangle)
        // Moves: Up, Down, Left, Right
        // Logic: It gets back to (0,0), but it turned too many times (Zig-zag).
        String test3 = "^v<>";
        System.out.println("Test 3 (Zig-zag): " + sol.solution(test3));
        // Expected: false

        // TEST 4: The "Unfinished" path
        // Moves: Up 3, Left 3, Down 1
        // Logic: It never made it back to the start.
        String test4 = "^^^<<<v";
        System.out.println("Test 4 (Unfinished): " + sol.solution(test4));
        // Expected: false

        // TEST 5: The "U-Turn" (Not a rectangle)
        // Moves: Left, Down, Down, Right, Up
        // Logic: Only 3 sides, not 4.
        String test5 = "<vv>^";
        System.out.println("Test 5 (U-Shape): " + sol.solution(test5));
        // Expected: false
    }
}

