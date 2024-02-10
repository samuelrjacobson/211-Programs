/*Project description: Simple calculator
Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                5
Due date:            2-24-2022
 */

import java.util.Scanner;

public class Lab5 {	
	
	//Calculate method - isolates operator and number and returns result of operation, or throws exceptions
	public static double calculate (String input, double preResult) {
		
		//Trim input
		String userInput = input.trim();
		
		//Locate operator
		char operator = userInput.charAt(0);
		
		//Locate number
		int numIndex = 0;
		for (int i = 0; i < userInput.length(); i++) {
			if(userInput.charAt(i) >= '0' && userInput.charAt(i) <= '9') {
				numIndex = i;
			}
			//else throw new NumberFormatException(String.valueOf(operator));
		}
		
		//Create variable for number
		String numString = userInput.substring(numIndex);
		Double num = Double.parseDouble(numString);
		
		//Apply arithmetic operation and return the result
		//if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
			if(operator == '+') preResult += num;
			if(operator == '-') preResult -= num;
			if(operator == '*') preResult *= num;
			if(operator == '/') preResult /= num;
			if(operator == '%') preResult %= num;
		return preResult;
		//} else throw new UnknownOperatorException(String.valueOf(operator));
	}
	
	//main method - prompts user for input and handles exceptions
	public static void main (String [] args) {
		
		//Output header
		System.out.println("Programmer:          Sam Jacobson\n" +
						   "Course:              COSC 211, W '22\n" + 
						   "Lab#:                5\n" + 
						   "Due date:            2-24-2022\n");
		
		System.out.println("Calculator is on.");
		
		Scanner scnr = new Scanner(System.in);
		double result = 0.0;

		//Do-while loop go allow user to repeat
		String yesOrNo = "";
		do {
		
			System.out.println("result = 0.0");
			String userInput = "";
			do {
				//reads user input
				userInput = scnr.nextLine();

				double oldResult = result;
				//calls calculate method and outputs result
				result = calculate(userInput, result);
				System.out.println("result + " + oldResult + " = " + result + "\nupdated result == " + result);
				
			} while(!userInput.equalsIgnoreCase("r"));
			
			System.out.println("final result = " + result + "\nAgain? (y/n)");
			yesOrNo = scnr.next();
		
		} while (yesOrNo.equalsIgnoreCase("y"));
		
		scnr.close();
		//Catches exceptions
		/*
		catch (UnknownOperatorException ex){
			System.out.println(ex + " is an unknown operation.");
		}
		catch (NumberFormatException ex) {
			System.out.println(ex + " is not a number!");
		
		}
		*/
	}
}
/*
Sample output for program:

Programmer:          Sam Jacobson
Course:              COSC 211, W '22
Lab#:                5
Due date:            2-24-2022

Calculator is on.
result = 0.0
+5
result + 5.0 = 5.0
updated result == 5.0
   -3
result - 3.0 = 2.0
updated result == 2.0
r
final result = 2.0
Again? (y/n)
y
result = 0.0
 +2
result + 2.0 = 2.0
updated result == 2.0
*       5
result * 5.0 = 10.0
updated result == 10.0
      /         2
result / 2.0 = 5.0
updated result == 5.0
r
final result = 5.0
Again? (y/n)
n
*/
