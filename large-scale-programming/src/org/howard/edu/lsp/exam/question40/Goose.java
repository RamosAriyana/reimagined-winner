package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	String phrase;
	
	public Goose() {
		super("Goose");
	}
	
	public void fly() {
		phrase = "This " + this.getClass().getName()+ " is flying.";
		return;
	}
	
	public String toString() {
		return phrase;
	}
}