// Q.9) Write a program to convert the complete text to uppercase and compare the results

// Import the required class for the program
import java.util.Scanner;

public class CompareUppercase {

    // Create method getUppercase to convert each char in text to uppercase
    public static String getUppercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result += c;
        }
        return result;
    }

    // Create method to compare uppercase text from both source
    public static Boolean compareUppercaseTexts(String text1, String text2) {

        if (text1.length() != text2.length())
            return false;

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i))
                return false;
        }

        return true;
    }

    // Create a main method
    public static void main(String[] args) {
        // Create a Scanner object to user input
        Scanner in = new Scanner(System.in);

        // Take user input
        System.out.print("Enter text here: ");
        String text = in.nextLine();

        // Call the getUppercase method to get all uppercase texts using logic
        String uppercaseTextLogic = getUppercase(text);

        // Get the uppercase of the text using built in method
        String uppercaseTextBuiltInMethod = text.toUpperCase();

        // Compare both uppercase output
        Boolean isSame = compareUppercaseTexts(uppercaseTextLogic, uppercaseTextBuiltInMethod);

        // Display results
        System.out.println("\nConverted to Uppercase using logic: " + uppercaseTextLogic);
        System.out.println("Converted to Uppercase using built-in: " + uppercaseTextBuiltInMethod);
        System.out.println("Are both methods producing the same result? " + isSame);

        // Close the Scanner object
        in.close();
    }
}
