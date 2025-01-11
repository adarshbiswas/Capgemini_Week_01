/* QUes -1 : Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
 */

//import the scanner class to take user input
import java.util.Scanner;

//create a class name SimpleInterest 
public class SimpleInterest {

    // create a method simpleInterest to calculate simple interest
    public double simpleInterest(double principal, double rate, double time) {

        // calculate simpleInterest and store it it the variable
        double simpleInterest = (principal * rate * time) / 100;

        // return the result
        return simpleInterest;
    }

    public static void main(String[] args) {

        // create an instance of scanner class
        Scanner sc = new Scanner(System.in);

        // take input from user for principal
        System.out.println("Enter the principal amount");
        double principal = sc.nextInt();

        // take input from user for rate
        System.out.println("Enter the rate of interest");

        double rate = sc.nextDouble();

        // take input from user for time
        System.out.println("Enter the time in years");

        double time = sc.nextDouble();

        // create an intance of SimpleInterest class
        SimpleInterest simpleInterest = new SimpleInterest();

        // call result function to calculate the result
        double result = simpleInterest.simpleInterest(principal, rate, time);

        // print the result
        System.out.println("The Simple Interest is " + result + " for Principal " + principal + " ,Rate of Interest "
                + rate + " and Time " + time + "years");

        sc.close();
    }
}