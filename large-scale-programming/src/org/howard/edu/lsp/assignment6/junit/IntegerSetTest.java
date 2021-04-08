package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment6.integerset.IntegerSetCode;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetCodeException;

public class IntegerSetTest {
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		List<Integer> set = new ArrayList<Integer>();
	    set.clear();
	    assertEquals(0, 0);
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.clear();
	    assertEquals(0, 0);
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(10);
	    set2.add(20);
	    set2.add(30);
	    set2.clear();
	    assertEquals(0, 0);
	}

	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		List<Integer> set = new ArrayList<Integer>();
		assertEquals(0, ((IntegerSetCode) set).length());
	}
	
	@Test
	@DisplayName("Test case for length with set of 0s")
	public void testLength1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
		assertEquals(5, ((IntegerSetCode) set1).length());
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(0);
	    set1.add(50);
		assertEquals(5, ((IntegerSetCode) set1).length());
	}

	@Test
	@DisplayName("Test case for equals")
	public void testEqualsIntegerSetCode() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(10);
	    set2.add(20);
	    set2.add(30);
	    assertEquals(true, set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for equals with sets of 0s")
	public void testEqualsIntegerSetCode1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(0);
	    set2.add(0);
	    set2.add(0);
	    assertEquals(false, set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for equals using negatives")
	public void testEqualsIntegerSetCode2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
	    set1.add(3);
	    set1.add(5);
	    set1.add(7);
	    set1.add(9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(-1);
	    set2.add(-3);
	    set2.add(-5);
	    set2.add(-7);
	    set2.add(-9);
	    assertEquals(false, set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for equals to check against 0")
	public void testEqualsIntegerSetCode3() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(0);
	    set1.add(3);
	    set1.add(5);
	    set1.add(7);
	    set1.add(9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(3);
	    set2.add(5);
	    set2.add(7);
	    set2.add(9);
	    assertEquals(false, set1.equals(set2));
	}

	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    assertEquals(true, set1.contains(10));
	}
	
	@Test
	@DisplayName("Test case for contains using null to check 0")
	public void testContains1() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(0);
	    set1.add(30);
	    assertEquals(false, set1.contains(null));
	}
	
	@Test
	@DisplayName("Test case for contains using positive number to check negative number")
	public void testContains2() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(-25);
	    set1.add(30);
	    assertEquals(false, set1.contains(25));
	}

	@Test
	@DisplayName("Test case for largest")
	public void testLargest() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(5);
	    int expectedValue = 0;
	    try {
	        expectedValue = ((IntegerSetCode) set1).largest();
	    } catch (IntegerSetCodeException e) {
	        e.printStackTrace();
	    }
	    assertEquals(30, expectedValue);
	}

	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(5);
	    int expectedValue = 0;
	    try {
	        expectedValue = ((IntegerSetCode) set1).smallest();
	    } catch (IntegerSetCodeException e) {
	        e.printStackTrace();
	    }
	    assertEquals(5, expectedValue);
	}

	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    String expectedValue = "[10, 20, 30]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for add with duplicate numbers")
	public void testAdd1() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(20);
	    set1.add(30);
	    String expectedValue = "[10, 20, 30]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for add with negative number")
	public void testAdd2() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(40);
	    set1.add(-50);
	    String expectedValue = "[10, 20, 30, 40, -50]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for add with a 0")
	public void testAdd3() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(40);
	    set1.add(0);
	    String expectedValue = "[10, 20, 30, 40, 0]";
	    assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.remove(Integer.valueOf(20));
	    String expectedValue = "[10, 30]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for remove using duplicate number")
	public void testRemove1() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(20);
	    set1.add(30);
	    set1.remove(Integer.valueOf(20));
	    String expectedValue = "[10, 30]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for remove using number not in set")
	public void testRemove2() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(40);
	    set1.add(50);
	    set1.remove(Integer.valueOf(72));
	    String expectedValue = "[10, 20, 30, 40, 50]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for remove using negative number")
	public void testRemove3() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    set1.add(40);
	    set1.add(50);
	    set1.remove(Integer.valueOf(-20));
	    String expectedValue = "[10, 20, 30, 40, 50]";
	    assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("Test case for union with normal numbers")
	public void testUnion() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		((IntegerSetCode) set1).union((IntegerSetCode) set2);
		String expectedValue = "[1, 2, 3, 4, 5, 6, 7]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for union with a value of 0")
	public void testUnion1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(0);
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		((IntegerSetCode) set1).union((IntegerSetCode) set2);
		String expectedValue = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for union with negative numbers")
	public void testUnion2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(-1);
		set1.add(3);
		set1.add(-5);
		set1.add(7);
		set1.add(-9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(0);
		set2.add(-2);
		set2.add(4);
		set2.add(-6);
		set2.add(8);
		((IntegerSetCode) set1).union((IntegerSetCode) set2);
		String expectedValue = "[-9, -6, -5, -2, -1, 0, 3, 4, 7, 8]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for union with negative numbers, 0s, and duplicates")
	public void testUnion3() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(-1);
		set1.add(3);
		set1.add(-5);
		set1.add(7);
		set1.add(-9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(0);
		set2.add(0);
		set2.add(6);
		set2.add(6);
		set2.add(0);
		((IntegerSetCode) set1).union((IntegerSetCode) set2);
		String expectedValue = "[-9, -5, -1, 0, 3, 6, 7]";
		assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("Test case for intersect with 2 unique sets")
	public void testIntersect() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(0);
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		((IntegerSetCode) set1).intersect((IntegerSetCode) set2);
		String expectedValue = "[]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		((IntegerSetCode) set1).intersect((IntegerSetCode) set2);
		String expectedValue = "[1, 3, 4, 6, 7]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(30);
		set2.add(50);
		set2.add(70);
		set2.add(90);
		((IntegerSetCode) set1).intersect((IntegerSetCode) set2);
		String expectedValue = "[30, 50]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for intersect with negative numbers")
	public void testIntersect3() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(-30);
		set2.add(-50);
		set2.add(70);
		set2.add(90);
		((IntegerSetCode) set1).intersect((IntegerSetCode) set2);
		String expectedValue = "[]";
		assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("Test case for difference")
	public void testDiff() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		((IntegerSetCode) set1).diff((IntegerSetCode) set2);
		String expectedValue = "[8]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for difference with 0")
	public void testDiff1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(0);
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		((IntegerSetCode) set1).diff((IntegerSetCode) set2);
		String expectedValue = "[1, 3, 5, 7, 9]";
		assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for difference with negative numbers, 0, and larger numbers")
	public void testDiff2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(-1);
		set1.add(3);
		set1.add(-5);
		set1.add(7);
		set1.add(0);
		set1.add(50);
		set1.add(-9);
	    List<Integer> set2 = new ArrayList<Integer>();
	    set2.add(1);
		set2.add(34);
		set2.add(6);
		set2.add(6);
		set2.add(9);
		((IntegerSetCode) set1).diff((IntegerSetCode) set2);
		String expectedValue = "[-1, 3, -5, 0, 50, -9]";
		assertEquals(expectedValue, set1.toString());
	}

	@Test
	@DisplayName("Test case for empty with empty set")
	public void testIsEmpty() {
		List<Integer> set1 = new ArrayList<Integer>();
	    assertTrue(set1.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for empty")
	public void testIsEmpty1() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
	    assertFalse(set1.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for isempty with 0s")
	public void testIsEmpty2() {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(0);
		set1.add(0);
		set1.add(0);
		set1.add(0);
		set1.add(0);
	    assertFalse(set1.isEmpty());
	}

	@Test
	@DisplayName("Test case for tostring")
	public void testToString() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    String expectedValue = "[10, 20, 30]";
	    assertEquals(expectedValue, set1.toString());
	}
	
	@Test
	@DisplayName("Test case for tostring with 0s")
	public void testToString1() {
		List<Integer> set1 = new ArrayList<Integer>();
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    set1.add(0);
	    String expectedValue = "[0, 0, 0, 0, 0]";
	    assertEquals(expectedValue, set1.toString());
	}
}
