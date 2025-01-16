// Java program to generate the Fibonacci sequence
import java.util.Scanner;

public class Problem4 {
    // Function to print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        // Generate the Fibonacci sequence
        generateFibonacci(terms);

        // Close the scanner
        scanner.close();
    }
}
