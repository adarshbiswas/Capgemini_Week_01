//Q-4 Write a program to convert kilometers into miles
//Create a class name UnitConvertor2

import java.util.Scanner;

public class UnitConvertor2 {

    // Create a method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Create a method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Create a method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Create a method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        // Create a Scanner class to take input from user
        Scanner input = new Scanner(System.in);

        // Take user input for conversion and Display the result

        System.out.println("Enter the value in kilometers to convert to miles:");
        double km = input.nextDouble();

        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");

        System.out.println("Enter the value in miles to convert to kilometers:");
        double miles = input.nextDouble();

        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        System.out.println("Enter the value in meters to convert to feet:");
        double meters = input.nextDouble();

        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        System.out.println("Enter the value in feet to convert to meters:");
        double feet = input.nextDouble();

        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");

        // Close the Scanner
        input.close();
    }
}
