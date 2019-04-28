package helloWorld;

import java.util.Scanner;

public class script3 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		int randomNum1 = (int) (Math.random() * 50);
		System.out.println(randomNum1);
		
		if (randomNum1 <= 25) {
			System.out.println(randomNum1 + " is less than 25");
		} else {
			System.out.println(randomNum1 + " is greater than 25");			
		}
		
		int a = 3;
		int b = 2;
		int biggestValue = (a < b) ? a : b;
		System.out.println(biggestValue);
		*/
		
		System.out.println("Tell ur grade in characters :");
		char c = userInput.next().charAt(0);
		
		char SwitchStatement = c;
		switch (SwitchStatement) {
		case 'a':
		case 'A':
			System.out.println("u got an A. Congrats");
			break;
		case 'b':
		case 'B':
			System.out.println("u got an B. get A next time");
			break;
		case 'c':
		case 'C':
			System.out.println("u got an C. U need to try harder");
			break;
		case 'd':
		case 'D':
			System.out.println("u got an D. U did so bad now go and study");
			break;
		case 'f':
		case 'F':
			System.out.println("u got an F. Failure!!");
			break;
		default:
			System.out.println("That's not a grade. Go to school and learn alphabets");
			break;
		}
		
	}
	
}