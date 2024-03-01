
/* POTD
 * 2864. Maximum Odd Binary Number
Solved
Easy
Topics
Companies
Hint
You are given a binary string s that contains at least one '1'.

You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.

Return a string representing the maximum odd binary number that can be created from the given combination.

Note that the resulting string can have leading zeros.

 

Example 1:

Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
Example 2:

Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".
 */
// basically the approach is to sort the string in revrese order and 
// then from right side check first occured one with and swap it with last character then we get  maxium odd number we swap one at last to get odd index
// step 1 : 011010
// step 2 : 111000
// step 3 : 110001
// tc: O(n log n) as we are sorting
// sc : O(n) 



import java.util.*;

public class POTD {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String k = reversestr(ch);
        for (int i = n - 1; i >= 0; i--) {
            if (k.charAt(i) == '1') {
                swap(ch, i, n - 1);
            }
        }
        return new String(ch);
    }

    public static String reversestr(char ch[]) {
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            char t = ch[i];
            ch[i] = ch[j];
            ch[j] = t;
            i++;
            j--;
        }
        return new String(ch);
    }

    public static void swap(char ch[], int i, int j) {
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;

    }
}