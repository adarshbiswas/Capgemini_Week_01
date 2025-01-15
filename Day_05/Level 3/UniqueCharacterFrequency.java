// Q.5.	Write a program to find the frequency of characters in a string using unique characters and display the result

import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] tempUnique = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Create a new array to store only the unique characters
        char[] uniqueCharacters = new char[uniqueIndex];
        System.arraycopy(tempUnique, 0, uniqueCharacters, 0, uniqueIndex);

        return uniqueCharacters;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Get unique characters using the findUniqueCharacters method
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueCharacters.length][2];
        for (int i = 0; i < uniqueCharacters.length; i++) {
            result[i][0] = Character.toString(uniqueCharacters[i]); // Character
            result[i][1] = Integer.toString(charFrequency[uniqueCharacters[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the frequency of unique characters
        String[][] characterFrequencies = findCharacterFrequencies(text);

        // Display the result
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] row : characterFrequencies) {
            System.out.printf("    %s     |    %s%n", row[0], row[1]);
        }

        scanner.close();
    }
}
