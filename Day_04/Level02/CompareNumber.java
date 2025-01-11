//Q-9 Write a program to take user input for 5 numbers and check whether a number is positive or negative
//Create a class name CompareNumber 
import java.util.Scanner;

public class CompareNumber {

    //Create a method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }


    //Create a method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    //Create a method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }



    public static void main(String[] args) {
	    
		//Create a Scanner class to take input from user
        Scanner input = new Scanner(System.in);



        //Create an array to store 5 numbers
        int[] numbers = new int[5];
		
		

        //Use for loop to take input from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }


        //Use for loop to iterate in the array
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }
		
		
		
        //Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);


 
        //Dispay the result
        System.out.print("Comparison of the first and last numbers: ");
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        
		
		//Close the Scanner
        input.close();
    }
}
