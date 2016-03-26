package lessons;
import java.util.Scanner;//import the Scanner class
public class InputMath {

	public static void main(String[] args) {
		
		//Declare 2 var to hold the user input
		Scanner Firstn  = new Scanner(System.in);
		Scanner Secondn = new Scanner(System.in);
		//Invite user to enter 2 numbers
		System.out.println("Enter the first number: ");
		System.out.println("Enter the second number: ");
		//Catch whatever the user has entered  
		int firstin  = Firstn.nextInt();
		int secondin = Secondn.nextInt();
		//Multiplicate the 2 numbers and store the result in result var
		int result = firstin * secondin;
		//Show what are the numbers and their result
		System.out.println(firstin+ " * " + secondin + " = " + result);
//switch statement 
		switch(firstin){
		case 9:
			System.out.println("Excellent");
			break;
		case 8:
			System.out.println("Very good");
			break;
		default:
			System.out.println("It's not in range at all");
			break;
		}
		

	}

}
