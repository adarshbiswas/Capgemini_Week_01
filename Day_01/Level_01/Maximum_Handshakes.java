
//Create a program to find maximum number of handshakes
//Create a class with name Handshakes
import java.util.Scanner;

class Handshakes {
	public static void main(String[] args) {

		// Create an instance of Scanner class to user input
		Scanner input = new Scanner(System.in);

		// Create an integer variable name numberOfstudents to take user input
		int numberOfstudents = input.nextInt();

		// Create an integer variable name maximum_handshakes to find its value
		int maximum_handshakes = (numberOfstudents * (numberOfstudents - 1)) / 2;

		// Display the result
		System.out.println("Possible number of handshakes is:" + maximum_handshakes);
		input.close();

	}
}