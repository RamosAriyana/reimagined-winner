package org.howard.edu.lsp.exam.question40;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * This class contains the test cases for the methods in the abstract class Animal and the fly method 
 * outlined in the Flying interface.
 */
class AnimalTest {

	@Test
	@DisplayName("Test case for the Goose moving")
	void testGoose() {
		Animal goose = new Goose();
		goose.move();
		String expectedValue = "This Goose moves forward.";
	    assertEquals(expectedValue, goose.toString());
	}
	
	@Test
	@DisplayName("Test case for the Goose speaking")
	void testGoose1() {
		Animal goose = new Goose();
		goose.speak();
		String expectedValue = "This Goose speaks.";
	    assertEquals(expectedValue, goose.toString());
	}
	
	@Test
	@DisplayName("Test case for the Goose flying")
	void testGoose2() {
		Animal goose = new Goose();
		((Goose) goose).fly();
		String expectedValue = "This Goose is flying.";
	    assertEquals(expectedValue, goose.toString());
	}
	
	@Test
	@DisplayName("Test case for the Tiger moving")
	void testTiger() {
		Animal tiger = new Tiger();
		tiger.move();
		String expectedValue = "This Tiger moves forward.";
	    assertEquals(expectedValue, tiger.toString());
	}
	
	@Test
	@DisplayName("Test case for the Tiger speaking")
	void testTiger1() {
		Animal tiger = new Tiger();
		tiger.speak();
		String expectedValue = "This Tiger speaks.";
	    assertEquals(expectedValue, tiger.toString());
	}
	
	@Test
	@DisplayName("Test case for the Airplane flying")
	void testAirplane() {
		Airplane airplane = new Airplane();
		airplane.fly();
		String expectedValue = "This Airplane is flying.";
	    assertEquals(expectedValue, airplane.toString());
	}
}
