
//Create a program to make basic calculator
//Create a class with name Prog11
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        try (// Create an instance of Scanner class to user input
                Scanner input = new Scanner(System.in)) {
            // Create an integer variable name number1 to take user input
            int number1 = input.nextInt();

            // Create an integer variable name number2 to take user input
            int number2 = input.nextInt();

            // Create an integer variable name choice
            int choice = input.nextInt();

            // Using Switch for checking operation given by user input
            switch (choice) {

                // This case 1 for addition
                case 1:
                    System.out.println(number1 + number2);
                    break;

                // This case 2 for subtraction
                case 2:
                    System.out.println(number1 - number2);
                    break;

                // This case 3 is for multiplication
                case 3:
                    System.out.println(number1 * number2);
                    break;

                // This case 4 is for division
                case 4:
                    System.out.println(number1 / number2);
                    break;

                // This case 5 is for modulation
                case 5:
                    System.out.println(number1 % number2);
                    break;

            }
        }
    }
}