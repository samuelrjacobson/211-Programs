/**
 * Program: IntListTest
 * Description: A driver to test singly liked list of integers
 * Programmer: Sam Jacobson
 * Course: COSC 211, W '22
 * Due date: 4-8-22
 */

import java.io.*;
import java.util.*;

public class TestSLL {
	
	// create a list and a Scanner object
	private static SinglyLinkedList list = new SinglyLinkedList();
    private static Scanner keyboard = new Scanner (System.in);

	/**
	 * Displays output heading, then repeatedly prints the menu and does what
	 * the user asks until they quit.
	 */
    public static void main(String[] args)throws IOException{
    	heading();
        printMenu();
        int choice = keyboard.nextInt();
        while (choice != 0){
           dispatch(choice);
           printMenu();
           choice = keyboard.nextInt();
        }
        System.out.println("Good bye!");
    }


	/**
	 * Does what the menu item calls for.
	 */
    public static void dispatch(int choice)throws IOException
    {
        int newVal;
        switch(choice){
            case 1:    //add to the front
                System.out.print("Enter an integer to add to the front: ");
                newVal = keyboard.nextInt();
                list.addFirst(newVal);
                break;

            case 2:  //remove from the front
                if (list.removeFirst())
                  System.out.println("First value is removed");
                break;

            case 3:  //print
                list.print();
                break;
                
            case 4:  //add to the end
            	System.out.print("Enter integer to add to the end: ");
                newVal = keyboard.nextInt();
                list.addLast(newVal);
                break;
                
            case 5:  //search the list
            	System.out.print("Enter the target value: ");
                newVal = keyboard.nextInt();
                if (list.find(newVal))
                	System.out.println(newVal + " is in the list");
                else
                	System.out.println(newVal + " is not in the list");
                break;
            
            case 6: //size of the list
            	System.out.println(list.size());
            	break;
            
            case 7: //return String containing elements of the list
            	System.out.print(list.toString());
            	break;
            	
            case 8: //remove last element from list
            	list.removeLast();
            	break;
            	
            case 9: //increment each element by a user-specified value
            	System.out.print("Enter an increment value: ");
            	int n = keyboard.nextInt();
            	list.increment(n);
            	break;
            	
            case 10: //print the elements from last to first
            	list.printBackward();
            	break;
            	
            default:
                System.out.println("Sorry, invalid choice");
            }
    }

	/**
	 *  Prints the user's choices
	 */
    public static void printMenu()
    {
        System.out.println("\n   Menu   ");
        System.out.println("   ====");
        System.out.println("0:  Quit");
        System.out.println("1:  Add an integer to the front of the list");
        System.out.println("2:  Remove an integer from the front of the list");
        System.out.println("3:  Print the list");
        System.out.println("4:  Add an integer to the end of the list");
        System.out.println("5:  Search for a target value in the list");
        System.out.println("6:  Size of the list");
        System.out.println("7:  Print the list returned by toString");
        System.out.println("8:  Remove the last element from the list");
        System.out.println("9:  Increment every element of the list by n");
        System.out.println("10:  Print the list backward");
        
        System.out.print("\nEnter your choice: ");
    }
    
    /**
	 *  Prints the output heading
	 */
 	public static void heading() {
 		System.out.println("Programmer:        Sam Jacobson");
 		System.out.println("Course:            COSC 211, Winter '22");
 		System.out.println("Project:           Lab 9");
 		System.out.println("Due date:          4-8-22\n");
 	}

}

/*
Sample output:

Programmer:        Sam Jacobson
Course:            COSC 211, Winter '22
Project:           Lab 9
Due date:          4-8-22


   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 6
0

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 1
Enter an integer to add to the front: 12

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 1
Enter an integer to add to the front: 20

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 3
20  12  

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 10
12  20  
   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 1
Enter an integer to add to the front: 100

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 7
[100 , 20, 12]
   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 6
3

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 8

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 7
[100 , 20]
   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 9
Enter an increment value: 10

   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 7
[110 , 30]
   Menu   
   ====
0:  Quit
1:  Add an integer to the front of the list
2:  Remove an integer from the front of the list
3:  Print the list
4:  Add an integer to the end of the list
5:  Search for a target value in the list
6:  Size of the list
7:  Print the list returned by toString
8:  Remove the last element from the list
9:  Increment every element of the list by n
10:  Print the list backward

Enter your choice: 0
Good bye!

*/