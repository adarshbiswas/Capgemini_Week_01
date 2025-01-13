// Q.11) Write a program to split the text into words and return the words along with their lengths in a 2D array

// Import the required class for the program
import java.util.Scanner;

public class TextSplitter {

    // Method to split the text into words using charAt() (without split())
    public static String[] splitIntoWords(String text) {
        String[] words = new String[100]; // Temporary array for words (can handle up to 100 words)
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < findLength(text); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                word += c; // Append character to the current word
            } else if (!word.isEmpty()) {
                words[wordCount++] = word; // Add completed word to the array
                word = ""; // Reset for the next word
            }
        }

        // Add the last word if not empty
        if (!word.isEmpty()) {
            words[wordCount++] = word;
        }

        // Resize the array to fit only the valid words
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int length = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            length++;
        }
        return length;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] generateWordWithLengths(String[] words) {
        String[][] result = new String[words.length][2]; // 2D array for words and lengths
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(findLength(words[i])); // Length as a string
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner in = new Scanner(System.in);

        // Take string input from the user
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        // Split the text into words using the user-defined method
        String[] words = splitIntoWords(input);

        // Generate a 2D array of words and their lengths
        String[][] wordWithLengths = generateWordWithLengths(words);

        // Display the result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] wordWithLength : wordWithLengths) {
            String word = wordWithLength[0];
            int length = Integer.parseInt(wordWithLength[1]); // Convert back to Integer for display
            System.out.printf("%-10s\t%d%n", word, length);
        }

        // Close the scanner class
        in.close();
    }
}
