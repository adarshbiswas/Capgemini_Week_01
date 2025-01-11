/*question 5 :Write a program to check whether a number is positive, negative, or zero.
 */

//import the Scanner Class
import java.util.Scanner;

//create a class CheckNumber 
public class CheckNumber {

    // create a method checkNumber to check the number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // take input from user for checking the number
        System.out.println("enter the number");
        int number = sc.nextInt();

        // check the number using checkNumber method and store the result in result
        // variable
        int result = checkNumber(number);

        // print the result based on the condition
        if (result == 0) {
            System.out.println("Entered Number is zero " + result);
        } else if (result == 1) {
            System.out.println("Entered Number is positive " + result);

        } else {
            System.out.println("Entered Number is negative " + result);

        }

        sc.close();

    }
}
