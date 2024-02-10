/*
Programmer: Sam Jacobson
Course:     COSC 211, W '22
Lab#:       3
Due date:   2-9-2022
 */

public class Lab3 {
	public static void main (String[] args) {
	
		//Print header
		System.out.println("Programmer: Sam Jacobson");
		System.out.println("Course:     COSC 211, W '22");
		System.out.println("Lab#:       3");
		System.out.println("Due date:   2-9-2022");

	    //Create email and file objects
		Email email1 = new Email();
		Email email2 = new Email();
		File file1 = new File();
		File file2 = new File();
		
		//Print emails and files
		System.out.println("\n" + email1);
		System.out.println("\n" + email2);
		System.out.println("\n" + file1);
		System.out.println("\n" + file2);
		
	}
	
	// Search the document for a target, return true if target is found. Otherwise, return false
	public static boolean contains (Document doc, String target){
			 if (doc.toString().indexOf (target, 0) >= 0)
				 return true;
			 return false;
	}
}

/*
Output

Programmer: Sam Jacobson
Course:     COSC 211, W '22
Lab#:       3
Due date:   2-9-2022

Sender: Tom
Recipient: Edward
Title: super keyword
message: The keyword super can be used in two ways in Java

Sender: Speedy
Recipient: Gonzales
Title: races
message: This message is about running marathons

Pathname: input.txt
File contents: Use Scanner to read from a Java text file

Pathname: run.txt
File contents: The name of participants in the last 10 marathon races

Which object contains Java?
Email1
File1
*/