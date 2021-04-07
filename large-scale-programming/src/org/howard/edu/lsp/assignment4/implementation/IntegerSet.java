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
        
        return temp1.equals(temp2);
	}; 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
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
 		if (!contains(item)) {
 			set.add(item);
        }
 	}; // adds item to s or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
 	public void remove(int item) {
 		set.remove(Integer.valueOf(item));
 	}; 

 	// Set union
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.getSet();
	    set.removeAll(temp);
	    set.addAll(temp);
	    Collections.sort(set);
	    return;
 	};

 	// Set intersection
 	public void intersect(IntegerSet intSetb) {
 		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.getSet();
 	      
        set.retainAll(temp);
       
        return;
 	}; 

 	// Set difference, i.e., s1 – s2
 	public void diff(IntegerSet intSetb) {
 		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.getSet();
	      
        set.removeAll(temp);
       
        return;
 	}; // set difference, i.e. s1 - s2

 	// Returns true if the set is empty, false otherwise
 	public boolean isEmpty() {
 		return set.isEmpty();
 	}; 

 	// Return String representation of your set
	public String toString() {
		return set.toString();
 	}

	public List<Integer> getSet() {
		return set;
	}
}		