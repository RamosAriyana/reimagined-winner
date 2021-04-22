package org.howard.edu.lsp.exam.question40;

public class Airplane implements Flying {
	String phrase;
	
	public void fly() {
		phrase = "This " + this.getClass().getSimpleName() + " is flying.";
		return;
	}
	
	public String toString() {
		return phrase;
	}
}
