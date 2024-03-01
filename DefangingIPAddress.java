
/*
 * 1108. Defanging an IP Address
Solved
Easy
Topics
Companies
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 SC=O(1)
 TC:O(n)

Constraints:

The given address is a valid IPv4 address.
 */
import java.util.*;

public class DefangingIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(defangIPaddr(s));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            }

            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}