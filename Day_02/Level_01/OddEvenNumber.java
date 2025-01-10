// Q.16) Create a program to print odd and even numbers between 1 to the number entered by the user.

// Import the required class for the program
import java.util.Scanner;

// Create the OddEvenNumbers class to perform the desired operations
public class OddEvenNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // checks if the number is less than or equal to zero
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    // if number is divisible by 2 then it prints even number
                    System.out.println(i + " is an even number.");
                } else {
                    // not divisible by 2 then it prints odd number
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the Scanner Object
        sc.close();
    }
}
