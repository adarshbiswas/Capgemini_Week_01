//Write a program to take user input for the age of all 10 students 
//in a class and check whether the student can vote depending
//on his/her age is greater or equal to 18.

import java.util.Scanner;

//Creating a class with name AgeofStudents
class AgeofStudents {
	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Creating an array studentAge
		int[] studentAge = new int[10];

		// Getting student age from the user
		System.out.println("Enter the age of students: ");
		for (int i = 0; i < 10; i++) {
			studentAge[i] = input.nextInt();
		}

		// Accesing age of students through for loop
		for (int i = 0; i < studentAge.length; i++) {

			// condition for invalid age
			if (studentAge[i] < 0) {
				System.out.println("Invalid Age");

			}

			// condition for valid age to vote and display student with age can vote
			if (studentAge[i] >= 18) {
				System.out.println("The student with age " + studentAge[i] + " can vote");
			}

			// condition for student who cannot vote
			else {
				System.out.println("The student with age " + studentAge[i] + " cannot vote");
			}
		}

		// Close the scanner object
		input.close();
	}
}
