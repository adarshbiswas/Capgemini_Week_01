
// Create a program to divide N number of chocolates among M children
import java.util.Scanner;

class DivideChocolates {

	public static void main(String[] args) {

		// Creating an instance of Scanner class to take user input
		Scanner sc = new Scanner(System.in);

		// Create variable to take user input for numberOfchocolates
		int numberOfchocolates = sc.nextInt();

		// Create a variable to take user input for numberOfChildren
		int numberOfChildren = sc.nextInt();

		// Number of chocolates each child will get
		int distributedAmount = numberOfchocolates / numberOfChildren;

		// Number of remaining chocolates
		int remainingChocolates = numberOfchocolates % numberOfChildren;

		// Print the output for the number of chocolates each child gets and the number
		// remainingChocolates
		System.out.print("The number of chocolates each child gets is " + distributedAmount
				+ " and the number of remaining chocolates are " + remainingChocolates);

		sc.close();
	}
}