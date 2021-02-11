package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Ariyana Ramos @02905178
 * 
 * The Combination class is made up of two functions. The total_combinations function 
 * takes in the array of integers and the target sum as parameters which will print out the input then calls on
 * the calculate_combinations function which will iterate through the array and determine which values add up to 
 * the target sum.
 *
 */
public class Combination {
	
	/**
	 * @param array - the array of integers from input
	 * @param target_sum - the sum that we want to reach
	 * @param array_elem - elements in array
	 * @param array_index - index of the elements in array
	 */
	static void calculate_combinations(ArrayList<Integer> array, int target_sum, ArrayList<Integer> array_elem, ArrayList<Integer> array_index) {
	    
		int sum = 0;
		/*
		 * Loop through each element in array, adding the value to the variable sum. When the target sum has been
		 * reached, print out the sets of the combinations.
		 */

	    for (int x: array_elem) {
	      sum += x;
	    }

	    if (sum == target_sum) {
	      System.out.println(array_index);
	    }
	       
	    if (sum >= target_sum) {
	      return;
	    }
	    
	    /*
	     * We create 2 ArrayLists to store the elements in the array and their indices. 
	     * Iterate through the input array. n will store the element at i while m will store the index of n. 
	     * A nested for loop will iterate through the array to get the next value. Add these values to 
	     * the new ArrayLists.
	     */
	            
	    for (int i = 0; i < array.size(); i++) {
	      ArrayList<Integer> sub_elem = new ArrayList<Integer>();

	      ArrayList<Integer> sub_index = new ArrayList<Integer>();

	      int n = array.get(i);
	      int m = array.indexOf(n);

	      for (int j = i + 1; j < array.size(); j++) {
	        sub_elem.add(array.get(j));
	        sub_index.add(array.indexOf(j));
	      }
	      
	      /*
	       * We create 2 more ArrayLists; both taking the elements in the array as a parameter. We add n and m 
	       * to their respective ArrayLists. We recursively call on the calculate_combinations function using
	       * the input array, target sum, array elements, and indices of the elements.
	       */
	      ArrayList<Integer> new_elem = new ArrayList<Integer>(array_elem);

	      ArrayList<Integer> new_index = new ArrayList<Integer>(array_elem);

	      new_elem.add(n);
	      new_index.add(m);

	      calculate_combinations(sub_elem, target_sum, new_elem, new_index);
	    }
	  }
	
	  /*
	   * The total_combinations function takes in the input array and target sum as arguments and 
	   * is called on from the driver code in the Test class. In this function, we output the  
	   * input array and target sum then call on the calculate_combinations function with the input array, 
	   * target sum and 2 ArrayLists to store the elements and element indices as parameters.
	   */
	  public static void total_combinations (ArrayList<Integer> array, int target_sum) {
	    System.out.println("Input: " +array);
	    System.out.println("Target Sum: " +target_sum);
	    System.out.println("Set(s) of Combinations: \r");
	    calculate_combinations(array, target_sum, new ArrayList<Integer>(), new ArrayList<Integer>());
	    System.out.println("\r");
	  }

}
