package Week_1;

import java.util.Scanner;

public class PalindromeChecker {

    // 1. Iterative method
    static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // 2. Recursive method
    static boolean isPalindromeRecursive(String text) {
        return check(text, 0, text.length() - 1);
    }

    static boolean check(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return check(text, start + 1, end - 1);
    }

    // 3. Array reversal method
    static boolean isPalindromeArrayReversal(String text) {

        char[] arr = text.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reversed = new String(arr);

        return text.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if (isPalindromeIterative(text))
            System.out.println("Iterative: Palindrome");
        else
            System.out.println("Iterative: Not Palindrome");

        if (isPalindromeRecursive(text))
            System.out.println("Recursive: Palindrome");
        else
            System.out.println("Recursive: Not Palindrome");

        if (isPalindromeArrayReversal(text))
            System.out.println("Array Reversal: Palindrome");
        else
            System.out.println("Array Reversal: Not Palindrome");

        sc.close();
    }
}
