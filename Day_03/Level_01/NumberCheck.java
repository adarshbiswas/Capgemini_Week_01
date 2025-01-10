//Write a program to take user input for 5 numbers 
//and check whether a number is positive,  negative, or zero. 
//Further for positive numbers check if the number is even or odd. 
//Finally compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;

//Creating a class with name NumberCheck
public class NumberCheck {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Creating an array number
        int[] number = new int[5];

        // Getting input of number from the user
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        // Accesing number through for loop
        for (int i = 0; i < number.length; i++) {

            // condition for checking positive and odd/even number
            if (number[i] > 0) {
                System.out.print(number[i] + " number is positive , ");

                if (number[i] % 2 == 0) {
                    System.out.println(number[i] + " number is even");
                } else {
                    System.out.println(number[i] + " number is odd");
                }

            }

            // condition for negative number
            else if (number[i] < 0) {
                System.out.println(number[i] + " number is negative");
            }

            // condition for zero
            else {
                System.out.println(number[i] + " number is zero");
            }

        }

        // comparing first and last element of array
        if (number[0] == number[4]) {
            System.out.println("first and last number are equal");
        } else if (number[0] > number[1]) {
            System.out.println("first number is greater than the last");
        } else {
            System.out.println("last number is greater than first");
        }

        input.close();
    }
}
