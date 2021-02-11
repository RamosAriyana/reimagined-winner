package org.howard.edu.lsp.assignment2.test;

import org.howard.edu.lsp.assignment2.combination.Combination;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ariyana Ramos @02905178
 * 
 * The Test class calls on the total_combinations method from the Combination class
 * instantiating the methods with a range of different input scenarios.
 *
 */
public class Test {
	

	public static void main(String[] args) {
		
		// Example 1
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(5, 5, 15, 10)), 15);
		
		// Example 2
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)), 6);
		
		// Testing With Negative Numbers as Input
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(59, 21, 3, 8, -7, 6, -45, 0)), 14);
		
		// Empty Array
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList()), 6);
		
		// Testing with a Negative Target Sum
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(5, -7, 3, -14, -15, -6)), -21);
		
		// Testing With Larger Numbers
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(31, 2, 50, 75, 50, 25, 69)), 100);
		
		// Incorrect Number
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(19)), 34);
		
		// Only the Target Sum in Array
		Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(21)), 21);
		
		// Testing With Greater Amount of Numbers to Add Up to Sum 
	    Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9)), 20);
	    
	    // No Numbers Add Up to Target Sum
	    Combination.total_combinations (new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9)), 72);

	}

}
