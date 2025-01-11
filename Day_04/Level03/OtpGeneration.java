// Q.7) Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same

// Import the required class for the program
import java.util.HashSet;
// import java.util.Random;

// Create a class OtpGeneration to perform the desired operation
public class OtpGeneration {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // Ensures a 6-digit number
    }

    // Method to generate 10 OTPs and save them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    // Main method
    public static void main(String[] args) {

        // Number of OTPs to generate
        int count = 10;

        // Generate OTPs and store them in an array
        int[] otps = generateMultipleOTPs(count);

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate if the OTPs are unique
        boolean unique = areOTPsUnique(otps);
        System.out.println("Are OTPs unique? " + unique);
    }
}
