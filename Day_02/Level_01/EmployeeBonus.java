// Q.17) Create a program to find the bonus of employees based on their years of service.

// Import the required class for the program
import java.util.Scanner;

// Create the EmployeeBonus class to perform the desired operations
public class EmployeeBonus {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Enter salary amount as input
                System.out.print("Enter the salary: ");
                double salary = sc.nextDouble();

                // Enter years of service as input
                System.out.print("Enter years of service: ");
                int yearsOfService = sc.nextInt();

                // if year of service is greater than 5 than we give the bonus
                if (yearsOfService > 5) {
                        double bonus = 0.05 * salary;

                        // print the bonus
                        System.out.println("The bonus amount is: " + bonus);
                } else {

                        // print No bonus for employees with 5 or fewer years of service.
                        System.out.println("No bonus for employees with 5 or fewer years of service.");
                }

                // Close the Scanner Object
                sc.close();
        }
}
