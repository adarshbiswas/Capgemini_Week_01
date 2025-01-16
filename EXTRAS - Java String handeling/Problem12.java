
// Java program to replace a word in a sentence
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Input the sentence
        System.out.print("Enter the word to replace: ");
        String toReplace = scanner.nextLine(); // Input the word to replace
        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine(); // Input the replacement word

        // Replace the specified word with the replacement word
        String result = sentence.replace(toReplace, replacement);

        // Print the modified sentence
        System.out.println("Modified Sentence: " + result);

        // Close the scanner
        scanner.close();
    }
}
