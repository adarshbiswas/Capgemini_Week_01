// Q.4.	Write a program to find the frequency of characters in a string using charAt() method and display the result

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store the frequency of characters (ASCII size)

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Determine the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(charFrequency[i]); // Frequency
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
        String[][] characterFrequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : characterFrequencies) {
            System.out.printf("    %s     |    %s%n", row[0], row[1]);
        }

        scanner.close();
    }
}
