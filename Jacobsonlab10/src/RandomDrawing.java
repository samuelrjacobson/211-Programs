/*
Project description: This program simulates drawing an item randomly from a box.
Programmer:          Sam Jacobson
Course:				 COSC 211, Winter 2022
Lab#:                10
Due date:            4-14-2022
 */

import java.util.*;

public class RandomDrawing<T> implements Cloneable {

	private ArrayList <T> box = new ArrayList<>();
	
	//add value to box
	public void add(T t) {
		box.add(t);
	}
	//check whether box is empty
	public boolean isEmpty() {
		if (box.size() > 0) return false;
		else return true;
	}
	//draw random item from box
	public T drawItem() {
		if (box.isEmpty()) return null;
		else {
			Random rng = new Random();
			int randNum = rng.nextInt(box.size());
			T item = box.get(randNum);
			box.remove(randNum);
			return item;
		}
	}
	
	//output state of the box
	public String toString() {
		String output = "";
		for(int i = 0; i < box.size(); i++) {
			output = output.concat(box.get(i) + "\t");
		}
		return output;
	}
	//clone the box
	public RandomDrawing<T> clone() throws CloneNotSupportedException {
		//perform a shallow copy
		RandomDrawing<T> rdClone = (RandomDrawing<T>)super.clone();
		//deep copy
		rdClone.box = (ArrayList<T>) (box.clone());
		return rdClone;
	}
}