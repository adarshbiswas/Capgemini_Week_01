// .Q.5) Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

// Import the required class for the program
import java.util.Scanner;

// Create the VotingEligibility class to perform the desired operations
public class VotingEligibility {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Take an input for age and store in a variable age
                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                // Check the age for voting eligibility
                if (age >= 18) {
                        // Output the eligibility if age is greater than 18
                        System.out.println("The person's age is " + age + " ,and can vote.");
                } else {
                        // Output the eligibility if age is not greater than 18
                        System.out.println("The person's age is " + age + " ,hence cannot vote.");
                }

                // Close the Scanner Object
                sc.close();
        }
}
