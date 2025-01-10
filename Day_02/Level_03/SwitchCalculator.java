/* Q.6) Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/

// Import the required class for the program
import java.util.Scanner;

// Create the SwitchCalculator class to perform the desired operations
public class SwitchCalculator {
	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Take a first number as input
		System.out.println("Enter 1st number: ");
		double x = sc.nextDouble();

		// Take a second number as input
		System.out.println("Enter 2nd number: ");
		double y = sc.nextDouble();

		// Select a operator for further operation as char value
		System.out.println("Enter operator (+, -, /, *): ");
		char op = sc.next().charAt(0);

		// Use switch case to perform the operations for each operator case
		switch (op) {
			case '+':
				// print the result if addition operator is selected
				System.out.printf("Sum of two integers is %.2f ", x + y);
				break;
			case '-':
				// print the result if subtraction operator is selected
				System.out.printf("Substraction of two integers is %.2f ", x - y);
				break;

			case '*':
				// print the result if multiplication operator is selected
				System.out.printf("Multiplication of two integers is %.2f ", x * y);
				break;

			case '/':
				// print the result if divide operator is selected
				System.out.printf("Division of two integers is %.2f ", x / y);
				break;
		}
		System.out.println("\n");

		// Close the Scanner Object
		sc.close();
	}
}
