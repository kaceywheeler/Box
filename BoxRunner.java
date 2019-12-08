//Kacey Wheeler
//AP Computer Science: 3B
//11-4-19
//Nested Loops Labs Part 1
//Box Runner

import java.util.Scanner;

public class BoxRunner {
	public static void main (String args[] ) {
		
		//Create new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get number input from user
		System.out.println("Enter a number: ");
		int user = keyboard.nextInt();
		
		//Create new reference object 
		Box ref = new Box();
		
		//Call method
		System.out.println(ref.box(user));
		
		
		
		
	}
}
