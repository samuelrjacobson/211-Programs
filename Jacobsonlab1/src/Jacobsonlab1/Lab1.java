package Jacobsonlab1;

import java.util.Scanner;

public class Lab1 {
	/*
	Programmer:            Sam Jacobson
	Project description:   This program returns the index of the largest element of a 2D array entered by the user.
	Course:                COSC 211, Winter 2022
	Lab#:                  1
	Due date:              1-20-2022
	*/

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Programmer:            Sam Jacobson\nCourse:                COSC 211, Winter 2022");
		System.out.println("Lab#:                  1\nDue date:              1-20-2022");

		// do-while loop to allow user to repeat program
		String yesOrNo = "";
	    do {
	   
	    	// create and initialize the array
	    	System.out.print("\nEnter the number of rows and columns of the array: ");
	    	int numRows = scnr.nextInt();
	    	int numColumns = scnr.nextInt();
	    	double[][] arr = new double[numRows][numColumns];
		   
	    	System.out.println("Enter the " + (numRows * numColumns) + " values for the array: ");
	    	for (int i = 0; i < arr.length; i++) {
	    		for (int j = 0; j < arr[i].length; j++){
	    			arr[i][j] = scnr.nextDouble();
	    		}
	    	}
	      
	    	// output index of largest element
	    	int[]  indexLargest = locateLargest(arr);
	      
	    	System.out.println("\nThe location of the largest element is: (" + indexLargest[0] + ", " + indexLargest[1] + ")");
	    	System.out.println("\nDo it again, yes (or no)? ");
	    	yesOrNo = scnr.next();
	    	
	  	} while (yesOrNo.equalsIgnoreCase("yes"));
	    
	    scnr.close();
	}
	      // locate largest element in the array
		  public static int[] locateLargest (double[][] array) {
			   double largest = array[0][0];
			   int xIndex = 0;
			   int yIndex = 0;
			   for (int row = 0; row < array.length; row++) {
			   	for (int col = 0; col < array[row].length; col++){
					   if (largest < array[row][col]) {
						   xIndex = row;
						   yIndex = col;
						   largest = array[row][col];
					   }
				}
			   }
			   int[] indexLargest = {xIndex, yIndex};
			   return indexLargest;
		  }
}
/*
Test run:

Programmer:            Sam Jacobson
Course:                COSC 211, Winter 2022
Lab#:                  1
Due date:              1-20-2022

Enter the number of rows and columns of the array: 2 5
Enter the 10 values for the array: 
1 4 7 2 9 6 10 8 5 3

The location of the largest element is: (1, 1)

Do it again, yes (or no)? 
yes

Enter the number of rows and columns of the array: 3 3
Enter the 9 values for the array: 
0 11 5 -6 9.1 11 0.24 8.5 11

The location of the largest element is: (0, 1)

Do it again, yes (or no)? 
Yes

Enter the number of rows and columns of the array: 2 1
Enter the 2 values for the array: 
7 0

The location of the largest element is: (0, 0)

Do it again, yes (or no)? 
no
*/