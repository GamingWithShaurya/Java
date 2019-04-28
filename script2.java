package helloWorld;

import java.util.Scanner;

public class script2 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Your favourite number: ");
		
		if(userInput.hasNextInt()) {
			
			int numberEntered = userInput.nextInt();
			System.out.println("you entered: " + numberEntered);
			System.out.println("Enter another number to add: ");
			int numEntered2 = userInput.nextInt();
			int addedNum = numberEntered + numEntered2;
			System.out.println(numberEntered + " + " + numEntered2 + " = " + addedNum);
			
		} else {
			System.out.println("Enter an integar next time");
		}
				
	}
	
}