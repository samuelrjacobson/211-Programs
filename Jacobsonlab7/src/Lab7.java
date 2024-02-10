/*
Project description: This program encrypts a file using the Caesar cypher.
Programmer:          Sam Jacobson
Course:				 COSC 211, Winter 2022
Lab#:                7, part 1
Due date:            3-17-2022
 */

import java.io.*;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		
		//Create scanner for file names
		Scanner scnr = new Scanner(System.in);

		//Output header
		System.out.println("Programmer:    Sam Jacobson\n" + 
						   "Course:        COSC 211, Winter 2022\n" + 
						   "Lab#:          7, part 1\n" + 
						   "Due date:      3-17-2022");
		
		//Flag and do-while loop to help recover from bad file input
		boolean tryAgain = false;
		do {
			
			//Get input and output file names
			System.out.print("\nEnter an input file name: ");
			String inputFile = scnr.nextLine();
			System.out.print("Enter an output file name: ");
			String outputFile = scnr.nextLine();
		
			//Create streams and scanner for try-block
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile));
				 DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
				 Scanner scanner = new Scanner(System.in)){
			
				//Get encryption key
				System.out.print("Enter the encryption key: ");
				int key = scanner.nextInt();
			
				//Encrypt each byte and write to output file
				while (true) {
					output.writeByte(input.readByte() + key);
				}
			
			}
			//Allow user to correct if file name is bad
			catch(FileNotFoundException ex){
				System.out.println("Bad input file name, TRY AGAIN");
				tryAgain = true;
			}
			//Report success when end of file is reached
			catch(IOException ex) {
				System.out.println("\n\nFile is encrypted successfully!");
				tryAgain = false;
				scnr.close();
			}
			
			//Close scanner when done with it
			if (tryAgain == false) scnr.close();
		}while(tryAgain);
	}

}
/*
Program input/output:

Programmer:    Sam Jacobson
Course:        COSC 211, Winter 2022
Lab#:          7, part 1
Due date:      3-17-2022

Enter an input file name: lab77.txt
Enter an output file name: lab7Encrypted.txt
Bad input file name, TRY AGAIN

Enter an input file name: lab5000.txt
Enter an output file name: lab7Encrypted.txt
Bad input file name, TRY AGAIN

Enter an input file name: lab7.txt
Enter an output file name: lab7Encrypted.txt
Enter the encryption key: 5


File is encrypted successfully!

------------- copy and paste input and output files ------------
Original file (lab7.txt):
I will encrypt this file using Caesar cipher

Caesar cipher is named after Julius Caesar, who used it in his private correspondence

Julius Caesar was a Roman general who played a major role in establishing the Roman Empire

This is a type of substitution cipher

In substitution cipher a character from the plaintext is replaced with another character.

Encrypted file (lab7E.txt):
N%|nqq%jshw~uy%ymnx%knqj%zxnsl%Hfjxfw%hnumjwHfjxfw%hnumjw
%nx%sfrji%fkyjw%Ozqnzx%Hfjxfw1%|mt%zxji%ny%ns%mnx%uwn{fyj
%htwwjxutsijshjOzqnzx%Hfjxfw%|fx%f%Wtrfs%ljsjwfq%|mt%uqf~
ji%f%rfotw%wtqj%ns%jxyfgqnxmnsl%ymj%Wtrfs%JrunwjYmnx%nx%f
%y~uj%tk%xzgxynyzynts%hnumjwNs%xzgxynyzynts%hnumjw%f%hmfw
fhyjw%kwtr%ymj%uqfnsyj}y%nx%wjuqfhji%|nym%fstymjw%hmfwfhy
jw3
*/