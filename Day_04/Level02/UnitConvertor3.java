//Q-6 Write a program to convert convert Farhenheit To Celsius
//Create a class name UnitConvertor3

import java.util.Scanner;

public class UnitConvertor3 {

    //Create a method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    //Create a method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }


    //Create a method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms;
    }


    //Create a method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds;
    }


    //Create a method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor
        return gallons * gallons2liters;
    }


    //Create a method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor
        return liters * liters2gallons;
    }


    public static void main(String[] args) {
	
	
	    //Create a Scanner class to take input from user
        Scanner input = new Scanner(System.in);


        // Convert Fahrenheit to Celsius
        System.out.println("Enter the value in Fahrenheit to convert to Celsius:");
        double fahrenheit = input.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");

        // Convert Celsius to Fahrenheit
        System.out.println("Enter the value in Celsius to convert to Fahrenheit:");
        double celsius = input.nextDouble();
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");

        // Convert pounds to kilograms
        System.out.println("Enter the value in pounds to convert to kilograms:");
        double pounds = input.nextDouble();
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");

        // Convert kilograms to pounds
        System.out.println("Enter the value in kilograms to convert to pounds:");
        double kilograms = input.nextDouble();
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Convert gallons to liters
        System.out.println("Enter the value in gallons to convert to liters:");
        double gallons = input.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        // Convert liters to gallons
        System.out.println("Enter the value in liters to convert to gallons:");
        double liters = input.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");

        
		//Close the Scanner
        input.close();
    }
}
