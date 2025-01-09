// Write a program to take 2 numbers and print their quotient and remainder


 
 
//importing the Scanner class for taking user inputs
 import java.util.Scanner;
 
	// Creating a Division Class to compute the Quotient and remainder of two number
	 class Division{
 
		public static void main(String[]args){
            
			//Create an instance of Scanner class to take user inputs
			Scanner sc =new Scanner(System.in);
			
			//Create an variable named number1 and take input from user
			int number1 = sc.nextInt();
			
			//Create another variable named number2 and take input from user
			int number2 = sc.nextInt();
			
			//Create an variable named quotient to store the value of quotient
			int quotient = number1/number2;
			
			//Create an variable named remainder to store the value of remainder
			int remainder = number1%number2;
			
			//Print the quotient ,remainder amd the two numbers  
			System.out.println("The Quotient of " + number1 + " and " + number2 + " is " + quotient + " and the Remainder is " + remainder);
			
			 
			
	   //Closing the scanner object
	   sc.close();
   
       }
   }