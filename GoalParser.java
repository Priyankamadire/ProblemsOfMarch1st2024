
/*
 * 1678. Goal Parser Interpretation
Easy
Topics
Companies
Hint
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

 

Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"
SC:O(1)
TC:O(n)
 */
import java.util.*;

public class GoalParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case 'G':
                    sb.append('G');
                    i++;
                    break;
                case '(':
                    if (s.charAt(i + 1) == ')') {
                        i += 2;
                        sb.append("o");

                    } else {
                        i += 4;
                        sb.append("al");
                    }
            }
        }
        return sb.toString();
    }
}