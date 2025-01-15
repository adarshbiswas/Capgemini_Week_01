// Q.2) Find unique characters in a string using charAt() method and display the result

import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, we reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); // Find the length of the text
        char[] tempUnique = new char[length]; // Temporary array to store unique characters
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the unique list
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
        for (int i = 0; i < uniqueIndex; i++) {
            uniqueCharacters[i] = tempUnique[i];
        }

        return uniqueCharacters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display the result
        System.out.print("Unique characters in the string are: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
