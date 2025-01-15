// Q.6.	Write a program to find the frequency of characters in a string using nested loops and display the result

import java.util.Scanner;

public class FrequencyWithNestedLoops {

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray(); // Convert the string to a character array
        int[] frequencies = new int[characters.length]; // Array to store character frequencies
        boolean[] visited = new boolean[characters.length]; // To track visited characters

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (!visited[i]) { // If character is not yet visited
                frequencies[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++; // Increment frequency
                        visited[j] = true; // Mark duplicate as visited
                    }
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (!visited[i]) {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (!visited[i]) {
                result[index] = characters[i] + " = " + frequencies[i]; // Character and frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the frequency of characters
        String[] characterFrequencies = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String frequency : characterFrequencies) {
            System.out.println(frequency);
        }

        scanner.close();
    }
}
