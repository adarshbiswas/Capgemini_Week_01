/*Question 6 : Write a program SpringSeason that takes two int values 
month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”  */

//Import the Scanner class
import java.util.Scanner;

//create a springSeason class
public class SpringSeason {

    // create a method to check if its spring or not
    public static boolean checkSpring(String month, int date) {

        if (month == "MARCH" && date >= 20 && date <= 31) {
            return true;
        } else if (month == "APRIL" && date >= 1 && date <= 30) {
            return true;
        } else if (month == "MAY" && date >= 1 && date <= 31) {
            return true;
        } else if (month == "JUNE" && date >= 1 && date <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // create an instance of scanner class
        Scanner sc = new Scanner(System.in);
        // take user input for month
        System.out.println("Enter month name");
        String month = sc.next();
        // take user input for date
        System.out.println("Enter date");
        int date = sc.nextInt();
        // call the function and find if its spring
        boolean result = checkSpring(month.toUpperCase(), date);
        // print the result
        if (result == true) {
            System.out.println("Its a Spring Season ");
        } else {
            System.out.println("Not a spring Season");
        }

        sc.close();
    }
}
