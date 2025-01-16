
// Java program to check if two strings are anagrams
import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine(); // Input the first string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine(); // Input the second string

        // Convert strings to character arrays and sort them
        char[] arr1 = str1.replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if sorted arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}
