/*Question 4 : Write a program to demonstrate NullPointerException
 */

public class DemonstrateNullPointerException {

    // create a method to for throwing exception
    public static void generateException() {
        String text = null;

        int length = text.length();
        System.out.println(length);
    }

    // create a method to for throwing and catching exception
    public static void handleGenratedException() {
        String text = null;

        try {
            int length = text.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            // handle exception
            System.out.println("this is an null pointer exception  " + e.getMessage());

        }
    }

    public static void main(String[] args) {

        // call the method which generate exception and them catch it;
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        // call the method that will throw and catch the exception
        handleGenratedException();
    }
}
