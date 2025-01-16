// Java program to count vowels and consonants in a string
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variables to count vowels and consonants
        int vowels = 0, consonants = 0;

        // Iterate through each character in the string
        for (char c : input.toLowerCase().toCharArray()) {
            // Check if the character is a vowel
            if ("aeiou".indexOf(c) >= 0) vowels++;
            // Check if the character is a consonant
            else if (c >= 'a' && c <= 'z') consonants++;
        }

        // Print the counts
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Close the scanner
        scanner.close();
    }
}
