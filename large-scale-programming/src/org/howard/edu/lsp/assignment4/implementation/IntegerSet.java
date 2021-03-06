package org.howard.edu.lsp.assignment4.implementation;

import java.util.*;

/**
 * @author Ariyana Ramos @02905178
 * 
 * The IntegerSet class is comprised of several methods that are built-in functions. 
 * We will take 2 sets and pass them through each method.
 *
 */

public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};

	// Returns the length of the set
	public int length() {
		return set.size();
	}; // returns the length

	/*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> list2 = (ArrayList<Integer>) b.set;
        // If the 2 sets aren't the same size, they are not equal so return false
        if (set.size() != list2.size()) {
            return false;
        }
        
        ArrayList<Integer> temp1 = (ArrayList<Integer>) set;
        
        ArrayList<Integer> temp2 = list2;
        
        // Sort each set to compare
        Collections.sort(temp1);
        Collections.sort(temp2);
        
        // Iterate through the elements in each set and compare; if the elements are the same, then they are equal
        for (int i = 0; i < temp1.size(); i++) {
            if (temp1.get(i) != temp2.get(i)) {
                return false;
            }
        }
        return true;
	}; 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		// An element is taken in as a parameter to search for then we iterate through each value in set; returns true if element is found
		for (int i = 0; i < set.size(); i++) {
	        if (set.contains(value)) {
	            return true;
	        }
	    }
	    return false;
	};    

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		// If set is empty, console will the exception that it's empty
		if (set.size() == 0) {
            throw new IntegerSetException("Set is Empty");
        }
        
		// Create a new int variable called max that we will compare elements to and store highest value
        int max = 0;
        
        // Iterate through each element in set; if element is greater than the max, it replaces the value
        for (int i = 0; i < set.size(); i++) {
            if (set.get(i) > max) {
                max = set.get(i);
            }
        }
        
        return max;
	}; 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		// If set is empty, console will the exception that it's empty
		if (set.size() == 0) {
			throw new IntegerSetException("Set is Empty");
        }
        
		// Create a new int variable called min that we will compare elements to and store lowest value
        int min = Integer.MAX_VALUE;
        
        // Iterate through each element in set; if element is greater than the min, it replaces the value
        for (int i = 0; i < set.size(); i++) {
            if(set.get(i) < min) {
                min = set.get(i);
            }
        }
        
        return min;
	};

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		// Create a boolean variable and initialize it as false
 		boolean is_found = false;
 		
 		// Iterate through each element in set; if the item is found, just return true
 		for (int i = 0; i < set.size(); i++) {
 			if (set.get(i) == item) {
 				is_found = true;
 			}
        }
        
 		// If the item isn't found; add it to set
        if (is_found == false) {
            set.add(item);
        }
 		
 	}; // adds item to s or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
 	public void remove(int item) {
 		// Iterate through each element in set; if the item is found, remove it from set
 		for (int i = 0; i < set.size(); i++) {
            if (set.get(i) == item) {
            	set.remove(i);
            }
        }
 	}; 

 	// Set union
	public void union(IntegerSet intSetb) {
 	};

 	// Set intersection
 	public void intersect(IntegerSet intSetb) {
 	}; 

 	// Set difference, i.e., s1 – s2
 	public void diff(IntegerSet intSetb) {
 	}; // set difference, i.e. s1 - s2

 	// Returns true if the set is empty, false otherwise
 	public boolean isEmpty() {
 		// If the size of the list is 0, then it is empty
 		if (set.size() == 0) {
            return true;
        }
 		
 		else {
 			return false;
 		}
 	}; 

 	// Return String representation of your set
//	public String toString() {
//		return str_list;
// 	}

	public List<Integer> getSet() {
		return set;
	}
}					