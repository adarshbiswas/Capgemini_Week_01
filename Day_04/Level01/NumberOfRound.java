/*question 4: An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
 */

//import the Scanner class
import java.util.Scanner;

//create a class NumberOfRound
public class NumberOfRound {

    // create a method the calculate the number of rounds using perimeter
    public static int roundCount(double perimeter) {

        // store the number of round in numberOfRound variable
        int numberOfRound = (int) Math.ceil(5000.0 / perimeter);

        // return the round count
        return numberOfRound;
    }

    public static void main(String[] args) {
        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        // Take input for all three side of the triangle
        System.out.println("enter the lenght of first side of triangle in meters");
        double side1 = sc.nextDouble();
        System.out.println("enter the lenght of second side of triangle in meters");
        double side2 = sc.nextDouble();
        System.out.println("enter the lenght of third side of triangle in meters");
        double side3 = sc.nextDouble();

        // calculate the perimeter
        double perimeter = side1 + side2 + side3;

        // call the function to find the number of round and store it in the variable
        int roundCount = roundCount(perimeter);

        // print the result
        System.out.println("The number of rounds will be required is " + roundCount);

        sc.close();

    }
}
