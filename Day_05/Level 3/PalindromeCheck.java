// Q.7.	Write a program to to check if a text is palindrome and display the result

import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end using a loop
    public static boolean isPalindromeIterative(String text) {
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

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare characters using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseStringUsingCharAt(text);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseStringUsingCharAt(String text) {
        char[] reversedArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = text.charAt(text.length() - 1 - i);
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase for comparison
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check palindrome using the three logics
        boolean isPalindromeIterative = isPalindromeIterative(cleanedText);
        boolean isPalindromeRecursive = isPalindromeRecursive(cleanedText, 0, cleanedText.length() - 1);
        boolean isPalindromeUsingArrays = isPalindromeUsingArrays(cleanedText);

        // Display results
        System.out.println("Palindrome check results:");
        System.out.println("Using Iterative Logic: " + (isPalindromeIterative ? "Yes" : "No"));
        System.out.println("Using Recursive Logic: " + (isPalindromeRecursive ? "Yes" : "No"));
        System.out.println("Using Character Arrays: " + (isPalindromeUsingArrays ? "Yes" : "No"));

        scanner.close();
    }
}
