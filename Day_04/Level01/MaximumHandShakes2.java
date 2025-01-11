/*Ques 3 :Create a program to find the maximum number of handshakes among N number of students.
 */

//import the scanner class to take user input
import java.util.Scanner;

//create a MaximumHandShakes2 class to calculate the total no. of handshakes
public class MaximumHandShakes2 {

    // create a method handshakesCalculator to calculate and return the total no. of
    // handshakes
    public int handshakesCalculator(int numberOfStudent) {

        // calculate and store the total no. of handshakes
        int numberOfHandshakes = (numberOfStudent * (numberOfStudent - 1)) / 2;

        // return the total no. of hamdshakes
        return numberOfHandshakes;
    }

    public static void main(String[] args) {

        // create an instance of scanner class
        Scanner sc = new Scanner(System.in);

        // take the user input for the total number of students
        System.out.println("Enter the number of student");
        int numberOfStudent = sc.nextInt();

        // create an intance of MaximumHandShakes2 class
        MaximumHandShakes2 maximumHandShakes = new MaximumHandShakes2();

        // store the total number of handshakes by calling the handshakeCalculator to
        // calculate the result
        int numberOfHandshakes = maximumHandShakes.handshakesCalculator(numberOfStudent);

        // primt the result
        System.out.println("The number of handshakes will be " + numberOfHandshakes
                + " for the following number of students " + numberOfStudent);

        sc.close();
    }
}
