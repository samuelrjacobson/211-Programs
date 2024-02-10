/*
Project description: Reads numbers from a file and outputs them in ascending order in rows of five
Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                6, part 2
Due date:            3-10-2022 
 */

import java.io.*;
import java.util.*;

/*
Project description:
Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                6
Due date:            3-10-2022 
 */

public class Lab6part2 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Variables to keep track of number of times the program has run and whether to display the header again
		int timesRun = 0;
		boolean displayHeader = true;
		
		//Do-while loop to allow the user to run the program twice
		do {
			//Display the header if the program ran successfully the previous time
			if(displayHeader)
				System.out.println("Programmer:          Sam Jacobson\n" + 
						"Course:              COSC 211, W '22\n" + 
						"Lab#:                6\n" + 
						"Due date:            3-10-2022\n");
			
			//Create array list to put the numbers into
			ArrayList<Integer> numbers = new ArrayList<>();

			try {
				//Get name of file to read from
				System.out.print("Enter an input file name: ");
				String fileName = input.nextLine();
				File file = new File(fileName);
			
				//Add integers from file to the array list
				Scanner fin = new Scanner(file);
				while (fin.hasNext()) numbers.add(fin.nextInt());
				
				//Sort the array list into ascending numerical order
				Collections.sort(numbers);
			
				//Print the sorted numbers
				int n = 1;
				while(n <= numbers.size()) {
					for(int i = 0; i < 5; i++) {
						if (n > numbers.size()) break;
						System.out.print(numbers.get(n - 1) + "\t");
						n++;
					}
					System.out.println();
				}
				System.out.println("\n");
				
				//Update variables for next run
				timesRun++;
				displayHeader = true;
				fin.close();
			}
			//Handle FileNotFoundException
			catch (FileNotFoundException ex) {
				System.out.println("Bad file name, try again\n");
				displayHeader = false;
			}
		} while (timesRun < 2);
		
		input.close();
	}
}
/*
Sample output:

Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                6
Due date:            3-10-2022

Enter an input file name: lab6C.txt
Bad file name, try again

Enter an input file name: jhgjkligui
Bad file name, try again

Enter an input file name: lab6A.txt
10	46	102	151	157	
180	198	372	435	437	
541	569	592	606	608	
699	865	


Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                6
Due date:            3-10-2022

Enter an input file name: lab6B.txt
18	34	112	191	210	
217	267	324	375	469	
499	540	558	710	772	
822	853	872	959	979	
995	


*/