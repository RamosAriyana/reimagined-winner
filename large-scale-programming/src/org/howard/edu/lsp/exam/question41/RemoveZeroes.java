package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;
import java.util.List;

/*
 * This class contains the methods removeZeroes and toString to remove the zeroes from a given ArrayList.
 * @author Ariyana Ramos
 */
public class RemoveZeroes {
	private List<Integer> list = new ArrayList<Integer>();
	/**
	 * This method takes in a list as a parameter, iterating through the list, then removes zeroes from the list
	 * @param list - ArrayList of integers passed to the removeZeroes function for the zeroes to be removed
	 */
	public void removeZeroes(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list.remove(i);
				i--;
			}
        }
    }
	
	/**
	 * This method returns a string representation of the list after it has been removed of zeroes
	 * @return list
	 */
	public String toString() {
		return list.toString();
	}
}
