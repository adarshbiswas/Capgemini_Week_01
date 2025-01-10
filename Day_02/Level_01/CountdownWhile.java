// Q.8) Write a program to count down the number from the user input value to 1 using a while-loop for a rocket launch

// Import the required class for the program
import java.util.Scanner;

// Create the CountdownWhile class to perform the desired operations
public class CountdownWhile {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Create a variable counter to take user inputted value for the countdown.
                System.out.print("Enter the countdown Timer: ");
                int counter = sc.nextInt();

                // Use the while loop to check if the counter is 1
                while (counter > 0) {
                        System.out.println(counter);
                        counter--; // decrements the counter
                }

                // once countdown reach 0 the rocket takes off
                System.out.println("Liftoff!");

                // Close the Scanner Object
                sc.close();
        }
}
