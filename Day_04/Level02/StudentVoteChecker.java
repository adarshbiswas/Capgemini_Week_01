//Q-7 Write a porogram to take user input for the age of all 10 students in a class 
//and check who can vote or who cannot vote
//Create a class name public class StudentVoteChecker

import java.util.Scanner;

public class StudentVoteChecker {

	public boolean canStudentsVote(int age) {
		if (age < 0) {
			return false;
		}
		return age >= 18;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the age of student:" + (i + 1) + "");
			arr[i] = input.nextInt();
		}

		StudentVoteChecker sv = new StudentVoteChecker();

		for (int i = 0; i < arr.length; i++) {
			boolean canVote = sv.canStudentsVote(arr[i]);
			if (arr[i] < 0) {
				System.out.println("Student " + (i + 1) + " entered an invalid age (" + arr[i] + "). Cannot vote.");
			} else if (canVote) {
				System.out.println("Student " + (i + 1) + " with age " + arr[i] + " is eligible to vote.");
			} else {
				System.out.println("Student " + (i + 1) + " with age " + arr[i] + " is not eligible to vote.");
			}
		}

		input.close();
	}
}
