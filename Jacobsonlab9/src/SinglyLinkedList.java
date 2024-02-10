/**
* Title: Singly Linked List (SinglyLinkedList.java)
* Description: Defines a class that represents a list of integers
* Programmer: Sam Jacobson
* Course: COSC 211, W '22
* Due date: 4-8-22
*/

public class SinglyLinkedList {
	// data members
	private Node head;
	
	// constructor
	public SinglyLinkedList() {
		head = null;
	}
	
	// add a node at the beginning of the list
	public void addFirst (int value) {
		head = new Node (value,head);
	}
	
	
	// remove the first node from the list (inner Node class)
	public boolean removeFirst () {
		// is list empty?
		if (head == null)
			return false;
		head = head.next;
		return true;
		
	}		
		
		
	// add to the end of list (inner Node class)
	public void addLast (int value) {
		
		// is list empty
		if (head == null)
			addFirst(value);
		else {
			Node current = head;
			while (current.next != null) 
				current = current.next;
			current.next = new Node(value);
		}
		
	}	
		
	// output the list (inner Node class)
	public void print () {
		Node current = head;
		while (current != null) {
			// grab the value and print it
			System.out.print(current.data + "  ");
			
			// advance to the next node
			current = current.next;
		}
		System.out.println();
	}
			
	// search the list for a target value. Return true
	// if target is in the list, and false otherwise (inner Node class)
	public boolean find (int target) {
		Node current = head;
		while (current != null) {
			if (current.data == target)
				return true;
			current = current.next;
		}
		return false;
	}		
	
	// returns the number of elements in the list
	public int size() {
		int numOfElements = 0;
		Node current = head;
		while (current != null) {
			numOfElements++;
			current = current.next;
		}
		return numOfElements;
	}
	
	// returns String containing elements of the list
	public String toString() {
		String outputString = "[";
		boolean outputComma = false; //to ensure that a comma does not follow the final value
		Node current = head;
		while (current != null) {
			if (outputComma) outputString = outputString.concat(", " + current.data);
			else {
				outputString = outputString.concat(current.data + " ");
				outputComma = true;
			}
			current = current.next;
		}
		outputString = outputString.concat("]");
		return outputString;
	}
	
	// remove last element from the list
	public boolean removeLast() {
		// is list empty?
		if (head == null) return false;
		else {
			Node current = head;
			while (current.next != null) {
				if (current.next.next == null) {
					current.next = null;
					break;
				}
				current = current.next;
			}
			return true;
		}
	}
	
	//increment each element by a user-specified value
	public void increment(int n) {
		Node current = head;
		while (current != null) {
			current.data += n;
			current = current.next;
		}
	}
	
	//print the elements from last to first
	public void printBackward() {
		Node start = head;
		printBackward(start);
	}
	public void printBackward(Node start) {
		if (start != null) {
			printBackward(start.next);
			System.out.print(start.data + "  ");
		}
	}
	
	/**
	* Title: Node (Node.java)
	* Description: Defines a class that represents a Node 
	* 
	* @author COSC 211, W '22
	* @version 4-5-22
	*/
	
		
	 private static class Node {      // static means can't access the data members of outer class
		private int data;
		private Node next;
		
		// constructors
		public Node (int item) {
			this (item, null);
		}
		
		public Node (int item, Node link) {
			data = item;
			next = link;
		}
		
		
		public String toString() {
			return ""+ data;
		}
	}
}