// Q.18) Create a program to find the multiplication table of a number entered by the user from 6 to 9

// Import the required class for the program
import java.util.Scanner;

// Create the MultiplicationTable class to perform the desired operations
public class MultiplicationTable {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Take a number as the input from the user
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                // Find the multiplication table of a number entered by the user from 6 to 9
                // using loop
                for (int i = 6; i <= 9; i++) {
                        // print the table
                        System.out.println(number + " * " + i + " =" + (number * i));
                }

                // Close the Scanner Object
                sc.close();
        }
}
