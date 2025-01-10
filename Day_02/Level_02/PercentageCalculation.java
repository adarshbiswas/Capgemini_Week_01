//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage 
//and then calculate the grade as per the following guidelines 

// Import the Scanner class 
import java.util.Scanner;

// Create class PercentageCalculation
public class PercentageCalculation {

	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Phyiscs Marks out of 100 : ");
		// Create a double variable physics and initialize value given by user
		double physics = sc.nextDouble();

		System.out.println("Enter Chemistry Marks out of 100 : ");
		// Create a double variable chemistry and initialize value given by user
		double chemistry = sc.nextDouble();

		System.out.println("Enter Maths Marks out of 100 : ");
		// Create a double variable maths and initialize value given by user
		double maths = sc.nextDouble();

		// Create a double variable sum and compute the sum
		double sum = (maths + physics + chemistry) / 3;

		// comparing sum with marks to compute the Grade, Remarks, Marks
		if (sum >= 80) {
			System.out.println("Grade : A");
			System.out.println("Remark : Level 4, above agency-normalized standards");
			System.out.println("Marks : " + sum);
		} else if (70 <= sum && sum <= 79) {
			System.out.println("Grade : B");
			System.out.println("Remark : Level 3, at agency-normalized standards");
			System.out.println("Marks : " + sum);
		}

		else if (60 <= sum && sum <= 69) {
			System.out.println("Grade : C");
			System.out.println("Remark : Level 2, below, but approaching agency-normalized standards");
			System.out.println("Marks : " + sum);

		}

		else if (50 <= sum && sum <= 59) {
			System.out.println("Grade : D");
			System.out.println("Remark : Level 1, well below agency-normalised standards ");
			System.out.println("Marks : " + sum);
		} else if (40 <= sum && sum <= 49) {
			System.out.println("Grade : E");
			System.out.println("Remark : Level 1-, too below agency-normalised standards ");
			System.out.println("Marks : " + sum);
		}

		else if (sum <= 39) {
			System.out.println("Grade : R");
			System.out.println("Remark : Remedial standards ");
			System.out.println("Marks : " + sum);
		}

		sc.close();
	}
}
