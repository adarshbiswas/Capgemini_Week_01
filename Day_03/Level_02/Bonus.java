/*Create a program to find the bonus of 10 employees based on their years of service and the
 total bonus amount the company Zara has to pay, along with the old and new salary.*/

import java.util.Scanner;

// Create a class Bonnus to calculate bonus
public class Bonus {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Create a double array to store the year of servise and Old Salary of each
        // employee
        double[][] salaryAndYearOfService = new double[10][2];

        // Create a double array to store the new Salary and bonus of each employee
        double[][] newSalaryAndBonus = new double[10][2];

        // Create a variable totalBonus , totalOldSalary and totalNewSalary to store the
        // value
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Create a for loop to take user input of Salary and Year of service
        for (int i = 0; i < salaryAndYearOfService.length; i++) {

            // Take salary input int salary variable
            System.out.println("Enter the old salary of employ no. " + (1 + i));
            double salary = sc.nextInt();
            // Check for invalid input and take the valid input
            while (salary <= 0) {
                System.err.println("Invalid Salary");
                System.out.println("Enter the old salary of employ no. " + (1 + i));
                salary = sc.nextInt();
            }
            // Take year Of Service input int yearOfService variable
            System.out.println("Enter the year Of Service of employ no. " + (1 + i));
            double yearOfService = sc.nextInt();
            // Check for invalid input and take the valid input
            while (yearOfService <= 0) {
                System.err.println("Invalid year Of Service");
                System.out.println("Enter the year Of Service of employ no. " + (1 + i));
                yearOfService = sc.nextInt();
            }
            // store the old salary and year of service in array salaryAndYearOfService
            salaryAndYearOfService[i][0] = salary;
            salaryAndYearOfService[i][1] = yearOfService;
            // calculate the bonus based on the given criteria
            double bonus = 0;
            if (salaryAndYearOfService[i][1] >= 5) {
                bonus = (5.0 / 100) * salaryAndYearOfService[i][0];
                newSalaryAndBonus[i][0] = bonus + salaryAndYearOfService[i][0];
                newSalaryAndBonus[i][1] = bonus;

            } else {
                bonus = (2.0 / 100) * salaryAndYearOfService[i][0];
                newSalaryAndBonus[i][0] = bonus + salaryAndYearOfService[i][0];
                newSalaryAndBonus[i][1] = bonus;
            }
            // Calculate the current total sum of bonus ,new salary and old salary
            totalBonus += bonus;
            totalNewSalary += newSalaryAndBonus[i][0];
            totalOldSalary += salaryAndYearOfService[i][0];

        }
        System.out.println("The total old salary is" + totalOldSalary + "total bonus is " + totalBonus
                + "and the total new salary is" + totalNewSalary);

        // Terminate the scanner close
        sc.close();
    }
}