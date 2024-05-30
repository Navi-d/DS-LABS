package stack;

/* @author Amaan Geelani Syed S2191704 */

import java.util.Stack;

public class Q4 {

    public static boolean isPalindrome(String str) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Compare characters from the stack with characters from the string
        for (int i = 0; i < str.length(); i++) {
            // Stack basically contains the reverse string
            if (stack.pop() != str.charAt(i)) {
                return false; // Characters don't match, not a palindrome
            }
            System.out.println(stack);
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        str = "abcba";
        
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
