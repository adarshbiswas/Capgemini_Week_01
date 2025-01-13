/*QUestion 1 : Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
 */

//import the scanner class
import java.util.Scanner;

//create a CompareString class 
public class CompareString {

    // create a method to compare two strings using charAt() methods
    public static boolean compareUsingCharAt(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        // create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // take input for both the strings needs to be compared
        System.out.println("Enter the first string");
        String str1 = sc.next();
        System.out.println("Enter the second string");
        String str2 = sc.next();

        // check if the lenght of each string is same or not
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not equal by length");
        }
        // check of the two strings are equal based on the charAt method by calling the
        // created method
        boolean result1 = compareUsingCharAt(str1, str2);
        // check if the strings are equal based on .equals method
        boolean result2 = str1.equals(str2);
        // combine the result
        boolean resultFinal = result1 && result2;
        // print the result based on ,if the final result is true or not
        if (resultFinal) {
            System.out.println("Both the strings are equal : " + resultFinal);
        } else {
            System.out.println("Both the strings are not equal : " + resultFinal);
        }
        // close the scanner
        sc.close();

    }
}
