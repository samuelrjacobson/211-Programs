/*
Programmer:            Sam Jacobson
Project description:   This program prints out a pyramid of asterisks representing
                       bowling pins given a user-specified number of rows. 
Course:                COSC 211, Winter 2022
Lab#:                  8, part 1
Due date:              04-02-2022
*/
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//Output header
		System.out.println("Programmer:    Sam Jacobson\n" + 
						   "Course:        COSC 211, Winter 2022\n" + 
						   "Lab#:          8, part 1\n" + 
						   "Due date:      4-2-2022");
		
		//do-while loop to allow user to repeat program
		String repeatProgram = "";
		do {
			//receive number of rows desired and call printPyramid method on that number
			System.out.print("\nEnter the number of rows in the pyramid: ");
			int rows = scnr.nextInt();
			scnr.nextLine();
			System.out.println();
			printPyramid(rows);
			//output number of pins in pyramid
			System.out.println("\nNumber of pins in a pyramid with " + rows + " rows is: " + NumberOfPins(rows));
		
			//repeat program if desired
			System.out.print("\nDo it again, yes(or no)? ");
			repeatProgram = scnr.nextLine();
		} while(repeatProgram.equalsIgnoreCase("yes"));
		scnr.close();
	}
	//determine number of pins in pyramid
	public static int NumberOfPins(int rows) {
		if(rows <= 0) return 0;
		else return rows + NumberOfPins(rows - 1);
	}
	//call private printPyramid method
	public static void printPyramid(int rows) {
		printPyramid(rows, 0);
	}
	//print pyramid of pins
	private static void printPyramid(int rows, int blanks) {
		if(rows > 0) {
			//recursively call printPyramid to run method for other rows
			printPyramid(rows - 1, blanks + 1);
			//print a row of the pyramid
			for(int i = 0; i < blanks; i++) System.out.print(" ");
			for(int i = 0; i < rows; i++) System.out.print("* ");
			System.out.println();
		}
	}
}
/*
Example output:

Programmer:    Sam Jacobson
Course:        COSC 211, Winter 2022
Lab#:          8, part 1
Due date:      4-2-2022

Enter the number of rows in the pyramid: 0

Number of pins in a pyramid with 0 rows is: 0

Do it again, yes(or no)? yes

Enter the number of rows in the pyramid: 1
* 

Number of pins in a pyramid with 1 rows is: 1

Do it again, yes(or no)? yEs

Enter the number of rows in the pyramid: 15
              * 
             * * 
            * * * 
           * * * * 
          * * * * * 
         * * * * * * 
        * * * * * * * 
       * * * * * * * * 
      * * * * * * * * * 
     * * * * * * * * * * 
    * * * * * * * * * * * 
   * * * * * * * * * * * * 
  * * * * * * * * * * * * * 
 * * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * 

Number of pins in a pyramid with 15 rows is: 120

Do it again, yes(or no)? no
*/