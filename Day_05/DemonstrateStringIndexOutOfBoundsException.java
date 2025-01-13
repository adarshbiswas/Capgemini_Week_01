
/*question 5 :Write a program to demonstrate StringIndexOutOfBoundsException
 */

import java.util.Scanner;

public class DemonstrateStringIndexOutOfBoundsException {
    // create a method to for throwing exception
    public static void generateException(String text) {
        int index = text.charAt(text.length());
        System.out.println(index);
    }

    // create a method to for throwing and catching exception
    public static void handleGeneratedException(String text) {

        try {
            int index = text.charAt(text.length());
            System.out.println(index);

        } catch (StringIndexOutOfBoundsException e) {
            // handle exception
            System.out.println("this is an StringIndexOutOfBoundsException " + e.getMessage());

        } catch (RuntimeException e) {
            // Handle any other runtime exception
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string text");
        String text = sc.next();
        // call the method which generate exception and them catch it;
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        // call the method that will throw and catch the exception
        handleGeneratedException(text);

        // Close the scanner
        sc.close();
    }
}
