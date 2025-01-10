//Write a program to save odd and even numbers in their corresponding array
//Create a class name PrintNumbers

import java.util.*;

public class PrintOddEvenNumbers {
    public static void main(String[] args) {

        // Crerate a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an integer variable name number to take input user
        System.out.println("Enter number:");
        int number = input.nextInt();

        // Check if number is natural or not
        if (number < 0) {
            System.out.println(number + "is not natural number");
            System.exit(0);
        }

        // Create an array for even numbers
        int evenNumber[] = new int[number / 2 + 1];

        // Create an aray for odd numbers
        int oddNumber[] = new int[number / 2 + 1];

        // For saving even number;
        int evenIndex = 0;

        // For saving odd number;
        int oddIndex = 0;

        // Iterate into the even array by using for loop
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                evenNumber[evenIndex] = i;
            } else {
                oddNumber[oddIndex] = i;
            }
        }

        // Printing the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumber[i] + " ");
        }
        System.out.println();

        // Printing the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumber[i] + " ");
        }
        System.out.println();

        // Closing Scanner
        input.close();
    }
}
