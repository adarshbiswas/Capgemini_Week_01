
// Java program to find the most frequent character in a string
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Input the string

        int[] frequency = new int[256]; // Array to store character frequencies
        char mostFrequent = ' '; // Variable to store the most frequent character
        int maxFreq = 0; // Variable to store the maximum frequency

        // Iterate through the string and calculate frequencies
        for (char c : input.toCharArray()) {
            frequency[c]++;
            // Update the most frequent character if necessary
            if (frequency[c] > maxFreq) {
                maxFreq = frequency[c];
                mostFrequent = c;
            }
        }

        // Print the most frequent character
        System.out.println("Most Frequent Character: " + mostFrequent);

        // Close the scanner
        scanner.close();
    }
}
