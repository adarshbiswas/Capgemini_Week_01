//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

import java.util.Scanner;

//create a class name MultiplicationTableFrom6to9
public class MultiplicationTableFrom6to9 {
    public static void main(String[] args) {

        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number for multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // Create an array to store the multiplication results
        int[] multiplicationResult = new int[4];

        // Compute the multiplication table for numbers 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the results
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
