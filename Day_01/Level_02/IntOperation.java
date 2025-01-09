/*Write an IntOperation program by taking a, b, and c as input values 
 and print the following integer operations 
 a + b *c, a * b + c, c + a / b, and a % b + c.
 Please also understand the precedence of the operators. */

//importing  the scanner class 	
import java.util.Scanner;

//Creating a IntOperation Class to perform some Integer Operation
class IntOperation {

	public static void main(String[] args) {

		// Create an instance of Scanner class to take user inputs
		Scanner sc = new Scanner(System.in);

		// Create an variable named a and take input from user
		int a = sc.nextInt();

		// Create another variable named b and take input from user
		int b = sc.nextInt();

		// Create another variable named c and take input from user
		int c = sc.nextInt();

		// Create an variable named operation1 to store the value of first operation
		int operation1 = a + b * c;

		// Create an variable named operation2 to store the value of second operation
		int operation2 = a * b + c;

		// Create an variable named operation3 to store the value of third operation
		int operation3 = c + a / b;

		// Create an variable named operation4 to store the value of forth operation
		int operation4 = a % b + c;

		// Print the operation result
		System.out.println("The results of Int Operations are" + operation1 + " " + operation2 + " " + operation3 + " "
				+ operation4);

		sc.close();

	}
}