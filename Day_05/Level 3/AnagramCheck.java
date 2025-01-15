// Q.8 Write a program to check if two texts are anagrams and display the result

import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters for the two texts
        int[] frequency1 = new int[256]; // ASCII character frequency array for text1
        int[] frequency2 = new int[256]; // ASCII character frequency array for text2

        // Find the frequency of characters in the two texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the texts are anagrams
        boolean isAnagram = areAnagrams(text1, text2);

        // Display the result
        System.out.println("Are the texts anagrams? " + (isAnagram ? "Yes" : "No"));

        scanner.close();
    }
}
