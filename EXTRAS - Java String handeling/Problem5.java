
// Java program to find the longest word in a sentence
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] words = scanner.nextLine().split(" "); // Split the sentence into words

        String longest = ""; // Variable to store the longest word

        // Iterate through each word
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word; // Update the longest word if the current word is longer
            }
        }

        // Print the longest word
        System.out.println("Longest word: " + longest);

        // Close the scanner
        scanner.close();
    }
}
