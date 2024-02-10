/*
Programmer: Sam Jacobson
Course:     COSC 211, W '22
Lab#:       2, part 1
Due date:   1-27-2022
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
	
	public static void main (String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Programmer: Sam Jacobson");
		System.out.println("Course:     COSC 211, W '22");
		System.out.println("Lab#:       2, part 1");
		System.out.println("Due date:   1-27-2022");
		
		//do-while loop to allow user to repeat progra,
		String yesOrNo = "";
		do {
			
			//Get user input
			System.out.print("\nEnter a line of text: ");
			String userText = scnr.nextLine();
			
			//Report number of characters
			System.out.println("\nNumber of characters: " + userText.length());
			
			//Report number of words
			String [] words = userText.split("\\s+");
			System.out.println("Number of words: " + words.length);
			
			//Report the longest word of the line
			String longest = words[0];
			for(int i = 1; i < words.length; i++) {
				if (words[i].length() > longest.length()) longest = words[i];
			}
			System.out.print("Longest word: " + longest);
			
			//Output words in ascending order
			Arrays.sort(words);
			System.out.print("\nWords in ascending order: ");
			for(int i = 0; i < words.length; i++) {
				System.out.print(words[i] + " ");
			}
			
			System.out.print("\nDo it again, yes (or no)? ");
			yesOrNo = scnr.nextLine();
		} while (yesOrNo.equalsIgnoreCase("yes"));
		
		scnr.close();
	}
}
