/*Question 2 : Write a program to create a substring from a String using 
the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
 */

import java.util.Scanner;

public class CompareSubstring {

    public static String createSubString(String str1, int startIndex, int endIndex) {
        StringBuilder substring1 = new StringBuilder();

        for (int i = startIndex; i < endIndex; i++) {
            substring1.append(str1.charAt(i));

        }

        return substring1.toString();
    }

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
        System.out.println("Enter the Start index");
        int startIndex = sc.nextInt();
        System.out.println("Enter the end index");
        int endIndex = sc.nextInt();

        String subString1 = createSubString(str1, startIndex, endIndex);
        String subString2 = str1.substring(startIndex, endIndex);

        boolean result = compareUsingCharAt(subString1, subString2);

        if (result) {
            System.out.println("Both the substrings are equal : " + result);
        } else {
            System.out.println("Both the substrings are not equal : " + result);
        }

        // close the scanner
        sc.close();
    }
}
