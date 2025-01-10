// Q.7) Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.

// Import the required class for the program
import java.util.Scanner;

// Create the SpringSeason class to perform the desired operations
public class SpringSeason {
        public static void main(String[] args) {
                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                // Enter input between 1-12 for month
                System.out.print("Enter month i.e 1-12: ");
                int month = sc.nextInt();

                // Enter input for day in numbers i.e, 1-7
                System.out.print("Enter day: ");
                int day = sc.nextInt();

                // Check if the date ranges between March 20 to June 20, if ranges then it's
                // Spring seson else not spring season
                if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
                        System.out.println("It's a Spring Season");
                } else {
                        System.out.println("Not a Spring Season");
                }

                // Close the Scanner Object
                sc.close();
        }
}
