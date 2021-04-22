package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	String phrase;
	
	public Goose() {
		super("Goose");
	}
	public void speak() {
		phrase = "This " + this.getClass().getSimpleName()+ " speaks.";
		return;
	}
	
	public void move() {
		phrase = "This " + this.getClass().getSimpleName()+ " moves forward.";
		return;
	}
	
	public void fly() {
		phrase = "This " + this.getClass().getSimpleName()+ " is flying.";
		return;
	}
	
	public String toString() {
		return phrase;
	}
}