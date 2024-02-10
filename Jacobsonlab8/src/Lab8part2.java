/*
Programmer:            Sam Jacobson
Project description:   This program prints out the odd numbers down to 1 from the user-specified number. 
Course:                COSC 211, Winter 2022
Lab#:                  8, part 2
Due date:              04-02-2022
*/
import java.util.Scanner;

public class Lab8part2 {

	public static void main(String[] args) {
		
		//Create scanner to read input
		Scanner scnr = new Scanner(System.in);
		
		//Output header
		System.out.println("Programmer:    Sam Jacobson\n" + 
						   "Course:        COSC 211, Winter 2022\n" + 
						   "Lab#:          8, part 2\n" + 
						   "Due date:      4-2-2022");
		
		//do-while loop to allow user to repeat program
		String repeatProgram = "";
		do {			
			//receive number n and call printOdds method on it
			System.out.print("\nEnter a whole number: ");
			int userNum = scnr.nextInt();
			scnr.nextLine();
			printOdds(userNum);
			
			//repeat program if requested
			System.out.print("\n\nDo it again, yes(or no)? ");
			repeatProgram = scnr.nextLine();
		} while(repeatProgram.equalsIgnoreCase("yes"));
		
		scnr.close();
	}
	//printOdds method to print odd numbers down to 1
	public static void printOdds(int n) {
		if(n > 0) {
			//if n is odd, start printing down from n
			if(n % 2 == 1) {
				System.out.print(n + "  ");
			}
			//if n is even, start printing down from n - 1
			else {
				n--;
				System.out.print(n + "  ");
			}
			//keep printing odds
			printOdds(n - 2);
		}
	}
}
/*
Example output:

Programmer:    Sam Jacobson
Course:        COSC 211, Winter 2022
Lab#:          8, part 2
Due date:      4-2-2022

Enter a whole number: 9
9  7  5  3  1  

Do it again, yes(or no)? YES

Enter a whole number: 12
11  9  7  5  3  1  

Do it again, yes(or no)? no
*/