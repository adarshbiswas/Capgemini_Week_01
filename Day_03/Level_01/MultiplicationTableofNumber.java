//Create a program to print a multiplication table of a number.

import java.util.Scanner;

//Create a class MultilicationtableofNumber
public class MultiplicationTableofNumber {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to for its multiplication table: ");
        int number = input.nextInt();

        // Create an integer array to store the results of multiplication
        int[] multiplicationtable = new int[10];

        // Create a for loop and store the results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationtable[i - 1] = number * i;
        }

        // Display the result
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationtable[i - 1]);
        }

        input.close();
    }

}
