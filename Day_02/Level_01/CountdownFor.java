// Q.9) Write a program to count down the number from the user input value to 1 using a for-loop for a rocket launch

// Import the required class for the program
import java.util.Scanner;

// Create the CountdownFor class to perform the desired operations
public class CountdownFor {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Create a variable counter to take user inputted value for the countdown.
                System.out.print("Enter the countdown start value: ");
                int counter = sc.nextInt();

                // Use the for loop to check if the counter is 1
                for (int i = counter; i > 0; i--) {
                        System.out.println(i);
                }

                // once countdown reach 0 the rocket takes off
                System.out.println("Liftoff!"); // i becomes 0 that means liftoff time

                // Close the Scanner Object
                sc.close();
        }
}
