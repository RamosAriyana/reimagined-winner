/**
 * @author Ariyana Ramos
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * This class implements a booth that calculates the amount of the toll to be paid
 * and keeps track of the total of receipts and the number of trucks that have passed through
 */
public class ColumbusTollBooth implements TollBooth {
	private int receiptsSinceCollection;
	private int trucksSinceCollection;
	
	String message;
	
	/**
	 * This method is used to calculate the toll that the truck has due based on the information on the truck.
	 * Increments the number of trucks that have visited and adds the total of receipts
	 * @param truck This parameter takes in the truck instance so that it can get information on the truck to utilize.
	 */
	public void calculateToll(Truck truck) {
		int axles = truck.getAxles();
		int totalWeight = truck.getTotalWeight();
		int tollDue = 5 * axles + 10 * (totalWeight/1000);
		message = "Truck Arrival - Axles: " + axles + " Total Weight: " + totalWeight
		          + " Toll Due: " + tollDue;
		trucksSinceCollection = trucksSinceCollection + 1;
		receiptsSinceCollection = receiptsSinceCollection + tollDue;
		return;
	}
	
	/**
	 * This method displays the total collected toll receipts and the number of trucks that have passed
	 * through the toll booth.
	 */
	public void displayData() {
		message = "Totals since last collection - Receipts: $" + receiptsSinceCollection + " Trucks: " + 
				trucksSinceCollection;
		return;
    }
	
	/**
	 * This method displays the most recent info in the displayData() method 
	 * then resets the receipts and trucks totals to 0.
	 */
	public void reset() {
		message = "*** Collecting receipts ***";
		displayData();
		receiptsSinceCollection = 0;
		trucksSinceCollection = 0;
		return;
	}
	
	/**
	 * This method returns the String representation of the message to be displayed on the
	 * toll booth screen.
	 * @return String representation of message
	 */
	public String toString() {
		return message.toString();

    }
}
