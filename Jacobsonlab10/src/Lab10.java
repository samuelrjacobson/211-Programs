import java.util.Scanner;

public class Lab10 {

public static void main (String [] args) throws CloneNotSupportedException {
		
		//Output header
		System.out.println("Programmer:    Sam Jacobson\n" + 
						   "Course:        COSC 211, Winter 2022\n" + 
						   "Lab#:          10\n" + 
						   "Due date:      4-14-2022\n");
		
		Scanner scnr = new Scanner(System.in);
		String doAgain = "";
		RandomDrawing<Integer> rdInteger = new RandomDrawing<>();
		RandomDrawing<String> rdString = new RandomDrawing<>();
		
		//add values to boxes
		rdInteger.add(35);
		rdInteger.add(12);
		rdInteger.add(100);
		rdInteger.add(10);
		rdInteger.add(72);
		
		rdString.add("Nancy");
		rdString.add("Cathy");
		rdString.add("Tom");
		rdString.add("David");
		rdString.add("Anna");
		rdString.add("Adam");
		
		//print state of box
		System.out.println("Contents of the integer box (toString method):\n" + rdInteger.toString());
		System.out.println("\nContents of the string box (toString method):\n" + rdString.toString());
		
		do {
			//clone box
			RandomDrawing<Integer> rdIntegerClone = rdInteger.clone();
			RandomDrawing<String> rdStringClone = rdString.clone();
			
			//draw from box and output result of drawing
			System.out.println("\nDrawings from the integer box:");
			while (!rdIntegerClone.isEmpty()) {
				System.out.print(rdIntegerClone.drawItem() + "\t");
			}
			System.out.println("\n\nDrawings from the string box:");
			while (!rdStringClone.isEmpty()) {
				System.out.print(rdStringClone.drawItem() + "\t");
			}
		
		//allow user to repeat program
		System.out.print("\n\nDo it again, yes (or no)? ");
		doAgain = scnr.nextLine();
		}while(doAgain.equalsIgnoreCase("yes"));
	}
}
/*
Sample output:

Programmer:    Sam Jacobson
Course:        COSC 211, Winter 2022
Lab#:          10
Due date:      4-14-2022

Contents of the integer box (toString method):
35	12	100	10	72	

Contents of the string box (toString method):
Nancy	Cathy	Tom	David	Anna	Adam	

Drawings from the integer box:
35	100	10	12	72	

Drawings from the string box:
Cathy	Adam	Tom	Nancy	Anna	David	

Do it again, yes (or no)? yes

Drawings from the integer box:
100	12	10	35	72	

Drawings from the string box:
Tom	Cathy	David	Nancy	Anna	Adam	

Do it again, yes (or no)? Yes

Drawings from the integer box:
10	35	72	100	12	

Drawings from the string box:
Nancy	Anna	Tom	Cathy	David	Adam	

Do it again, yes (or no)? no

*/