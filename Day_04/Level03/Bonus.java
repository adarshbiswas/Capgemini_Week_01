package Day_04.Level_03;
/*Question 11: Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
 */
import java.util.Random;

public class Bonus {

    // Generates random salaries and years of service for the specified number of employees
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = 30000 + random.nextInt(70001); // Generate a salary between 30,000 and 100,000
            employeeData[i][1] = random.nextInt(11); // Generate years of service between 0 and 10
        }

        return employeeData;
    }

    // Calculates bonuses and updates salaries based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            // Determine bonus percentage: 5% for more than 5 years, otherwise 2%
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage; // Calculate the bonus amount
            double newSalary = oldSalary + bonusAmount; // Calculate the new salary

            updatedData[i][0] = bonusAmount;
            updatedData[i][1] = newSalary;
        }

        return updatedData;
    }

    // Displays detailed employee data and calculates total amounts
    public static void displayTotals(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nEmployee Data:");
        System.out.println("Emp#\tOld Salary\tYears of Service\tBonus\tNew Salary");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            // Accumulate totals for summary
            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            // Display details for each employee
            System.out.printf("%d\t%d\t\t%d\t\t%.2f\t%.2f\n", i + 1, oldSalary, yearsOfService, bonus, newSalary);
        }

        // Display the summary of totals
        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Step 1: Generate random data for employees (salary and years of service)
        int[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Step 2: Calculate the bonus and update salaries for each employee
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display the employee details and the summary of totals
        displayTotals(employeeData, updatedData);
    }
}

