
// Create NumberOfRounds Class to compute the number of rounds an athlete runs in a triangular park
import java.util.Scanner;

class NumberOfRounds {

	public static void main(String[] args) {

		// Creating an instance of Scanner class to take user input
		Scanner sc = new Scanner(System.in);

		// Create variables to take user input for side1, side2 and side3
		int side1 = sc.nextInt(), side2 = sc.nextInt(), side3 = sc.nextInt();

		// Create a variable to take user input to cover the distance by athlete
		int distance = sc.nextInt();

		// Formula to find the perimeter of a triangle
		int perimeter = side1 + side2 + side3;

		// Formula to find the number of rounds covered
		int rounds = distance / perimeter;

		// Print the output for the number of rounds athlete will run to cover the
		// distance
		System.out.print(
				"The total number of rounds the athlete will run is " + rounds + " to complete " + distance + " km.");
		sc.close();
	}
}