package lessons;
//Import the Scanner class from java
import java.util.Scanner;
//This is the class Name
public class FirstTry {
	//Make it the main class
	public static void main (String[]arguments){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any number between 0 and 9:");
		int number = scan.nextInt();//Get the typed number and store it in scan
		if ((number < 10) && (number >0 )){//If the number is in range 0..10
			//System.out.println(number + ": Great");//Print out the entered number by the user
			//Make another input with text
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Please enter your name: ");
			String Entered_Name = scan1.next();  //Get the entered text here
			System.out.println("Hello "+Entered_Name+ " You have entered "+number);
		}
		else//If not in the range 0..10
		{
			System.out.println("The number entered is out of range");
		}
		
	}

}
