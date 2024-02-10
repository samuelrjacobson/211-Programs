/*
Project description: Prints to a file random numbers of a user-specified quantity in rows of five
Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                6, part 1
Due date:            3-10-2022 
 */
import java.io.*;
import java.util.*;

public class Lab6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Display header
		System.out.println("Programmer:          Sam Jacobson\n" + 
				"Course:              COSC 211, W '22\n" + 
				"Lab#:                6\n" + 
				"Due date:            3-10-2022\n");
		
		Scanner scnr = new Scanner(System.in);
		
		//Do-while loop to allow user to run the program multiple times
		String yesOrNo = "";
		do {
	
			//Get file name and number of numbers to be generated
			System.out.print("Enter an output file name: ");
			String fileName = scnr.nextLine();
			System.out.print("How many numbers to write to the file: ");
			int n = scnr.nextInt();
			scnr.nextLine();
		
			//Create PrintWriter
			PrintWriter fout = new PrintWriter(fileName);
		
			//Generate and print n random numbers to the file
			while(n > 0) {
				for(int i = 0; i < 5; i++) {
					if (n <= 0) break;
					Random rng = new Random();
					int randomNum = rng.nextInt(1000) + 1;
					fout.print(randomNum + "\t");
					n--;
				}
				fout.print("\n");
			}
			fout.close();
		
			//Ask user if they would like to repeat the process
			System.out.print("\nDo it again, yes (or no)? ");
			yesOrNo = scnr.nextLine();
		} while (yesOrNo.equalsIgnoreCase("yes"));
		
		scnr.close();
	}
}
/*
Sample output:

Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                6
Due date:            3-10-2022

Enter an output file name: lab6A.txt
How many numbers to write to the file: 17

Do it again, yes (or no)? yes
Enter an output file name: lab6B.txt
How many numbers to write to the file: 21

Do it again, yes (or no)? no


lab6A.txt:
180	151	157	102	46	
198	435	608	606	541	
437	10	592	372	569	
865	699	

lab6B.txt:
822	995	469	959	217	
210	324	18	499	540	
872	772	34	112	191	
558	375	853	710	979	
267	

*/