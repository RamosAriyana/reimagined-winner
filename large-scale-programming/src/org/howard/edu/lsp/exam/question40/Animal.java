/*
 * @author Ariyana Ramos
 */
package org.howard.edu.lsp.exam.question40;

/*
 * This is an abstract class defining a hierarchy that can represent Animals. The methods 
 * define the 2 behaviors: the ability to speak and the ability to move.
 */
public abstract class Animal {
	String name;
	String phrase;
	
	/*
	 * This methods takes in the name of the animal as the parameter
	 * @param name - name of the animal
	 */
	public Animal (String name) {
		this.name = name;
	}
	
	/*
	 * This method returns that the specified animal can speak.
	 * @return "This animal can speak."
	 */
	public void speak() {
		phrase = "This " + name + " speaks.";
		return;
	}
	
	/*
	 * This method returns that the specified animal can move.
	 * @return "This animal moves forward."
	 */
	public void move() {
		phrase = "This " + name + " moves forward.";
		return;
	}
	
	/*
	 * This method returns the string representation of the respective called method.
	 * @return String representation of the defined behavior.
	 */
	public String toString() {
		return phrase;
	}
}