package org.howard.edu.lsp.exam.question41;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* 
 * This class contains the junit test cases for the removeZeroes method in the removeZeroes class.
 * @author Ariyana Ramos
 */
class RemoveZeroesTest {
	/* Create an object for the removeZeroes class.
	 * Declare ArrayList.
	 * Add elements to the list.
	 * Call the removeZeroes method then the toString method to compare to a String variable containing 
	 * expected values to be returned.
	 * @result the list should return the same values as in the expectedValue variable.
	 */
	@Test
	@DisplayName("Test case for removeZeroes provided in Question 41")
	void testRemoveZeroes() {
		RemoveZeroes obj = new RemoveZeroes();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); 
		list.add(7);
		list.add(2);
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(0);
		obj.removeZeroes(list);
		String expectedValue = "[7, 2, 4]";
	    assertEquals(expectedValue, list.toString());
	}
	
	/* Create an object for the removeZeroes class.
	 * Declare ArrayList.
	 * Add elements to the list.
	 * Call the removeZeroes method then the toString method to compare to a String variable containing 
	 * expected values to be returned.
	 * @result the list should return the same values as in the expectedValue variable.
	 */
	@Test
	@DisplayName("Test case for removeZeroes with negative integers")
	void testRemoveZeroes1() {
		RemoveZeroes obj = new RemoveZeroes();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(250); 
		list.add(7);
		list.add(-81);
		list.add(0);
		list.add(69);
		list.add(4);
		list.add(0);
		list.add(0);
		list.add(-27);
		list.add(0);
		list.add(100);
		obj.removeZeroes(list);
		String expectedValue = "[250, 7, -81, 69, 4, -27, 100]";
	    assertEquals(expectedValue, list.toString());
	}
	
	/* Create an object for the removeZeroes class.
	 * Declare ArrayList.
	 * Add elements to the list.
	 * Call the removeZeroes method then the toString method to compare to a String variable containing 
	 * expected values to be returned.
	 * @result the list should return the same values as in the expectedValue variable.
	 */
	@Test
	@DisplayName("Test case for removeZeroes that should return empty list")
	void testRemoveZeroes2() {
		RemoveZeroes obj = new RemoveZeroes();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); 
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		obj.removeZeroes(list);
		String expectedValue = "[]";
	    assertEquals(expectedValue, list.toString());
	}
	
	/* Create an object for the removeZeroes class.
	 * Declare ArrayList.
	 * Add elements to the list.
	 * Call the removeZeroes method then the toString method to compare to a String variable containing 
	 * expected values to be returned.
	 * @result the list should return the same values as in the expectedValue variable.
	 */
	@Test
	@DisplayName("Test case for removeZeroes using duplicate integers")
	void testRemoveZeroes3() {
		RemoveZeroes obj = new RemoveZeroes();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); 
		list.add(7);
		list.add(2);
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(0);
		list.add(7);
		list.add(7);
		obj.removeZeroes(list);
		String expectedValue = "[7, 2, 4, 7, 7]";
	    assertEquals(expectedValue, list.toString());
	}
	
	/* Create an object for the removeZeroes class.
	 * Declare ArrayList.
	 * Add elements to the list.
	 * Call the removeZeroes method then the toString method to compare to a String variable containing 
	 * expected values to be returned.
	 * @result the list should return the same values as in the expectedValue variable.
	 */
	@Test
	@DisplayName("Test case for removeZeroes using zeroes with different signs")
	void testRemoveZeroes4() {
		RemoveZeroes obj = new RemoveZeroes();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); 
		list.add(-0);
		list.add(0);
		list.add(0);
		list.add(+0);
		list.add(0);
		obj.removeZeroes(list);
		String expectedValue = "[]";
	    assertEquals(expectedValue, list.toString());
	}

}
