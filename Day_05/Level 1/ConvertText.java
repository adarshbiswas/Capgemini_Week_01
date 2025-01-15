// Q.10) Write a program to convert the complete text to lowercase and compare the results

// Import the required class for the program
import java.util.Scanner;

public class ConvertText {

    // Method to convert a string to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String input) {
        String result = ""; // Start with an empty string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // Convert uppercase to lowercase
            }
            result += c; // Concatenate character to the result string
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, they are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character differs, they are not equal
            }
        }
        return true; // If all characters match, the strings are equal
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner in = new Scanner(System.in);

        // Take string input from the user
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        // Convert the string to lowercase using the user-defined method
        String lowerCaseUsingLogic = convertToLowerCase(input);

        // Convert the string to lowercase using the built-in method
        String lowerCaseUsingBuiltIn = input.toLowerCase();

        // Compare the two strings using the user-defined method
        boolean isSame = compareStrings(lowerCaseUsingLogic, lowerCaseUsingBuiltIn);

        // Display results
        System.out.println("\nConverted to Lowercase using logic: " + lowerCaseUsingLogic);
        System.out.println("Converted to Lowercase using built-in: " + lowerCaseUsingBuiltIn);
        System.out.println("Are both methods producing the same result? " + isSame);

        // Close the scanner class
        in.close();
    }
}
