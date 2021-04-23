package org.howard.edu.assignment7.tollbooth;

/**
 * This interface declares the behaviors or methods to be implemented by ColumbusTollBooth.
 */
public interface TollBooth {
	void calculateToll(Truck t);
	void displayData();
	void reset();
}
