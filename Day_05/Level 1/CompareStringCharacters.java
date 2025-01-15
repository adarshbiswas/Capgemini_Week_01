/*Question 3: Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
 */

import java.util.Scanner;

public class CompareStringCharacters {

    public static char[] toCharArray(String text) {

        char[] charArray = new char[text.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArray(char[] first, char[] second) {

        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < second.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] characterArray = toCharArray(text);
        char[] characterArrayByBuiltin = text.toCharArray();

        boolean result = compareCharArray(characterArray, characterArrayByBuiltin);

        if (result) {
            System.out.println("Both the char Array are equal : " + result);
        } else {
            System.out.println("Both the char Array are not equal : " + result);
        }

        // close the scanner
        sc.close();

    }
}
