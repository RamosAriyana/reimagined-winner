package org.howard.edu.assignment7.tollbooth;

public class ColumbusTollBooth implements TollBooth {
	private int receiptsSinceCollection;
	private int trucksSinceCollection;
	
	int numaxles;
	int totalweight;
	int tollDue;
	
	public void calculateToll(Truck truck) {
		this.numaxles = truck.getAxles();
		this.totalweight = truck.getTotalWeight();
		this.tollDue = 5 * numaxles + 10 * (totalweight/1000);
		trucksSinceCollection = trucksSinceCollection + 1;
		receiptsSinceCollection = receiptsSinceCollection + tollDue;
		return;
	}
	
	/**
	 * This method displays information about receipts and trucks.
	 */
	public void displayData() {
//		System.out.print("Totals since last collection - Receipts: $");
//		System.out.print(receiptsSinceCollection);
//		System.out.print(" Trucks: ");
//		System.out.println(trucksSinceCollection);
//		System.out.println("*************************************************************");
		//return;
		DisplaytoString();
    }
	
	/**
	 * This method resets the receipts and trucks variables back to 0, prints out 
	 * the total receipts of trucks and dues, then resets them back to 0.
	 */
	public void reset() {
//		System.out.print("*** Collecting receipts ***");
//		System.out.print("\n");
		//displayData();
		receiptsSinceCollection = 0;
		trucksSinceCollection = 0;
	}
	
	public String CalculatetoString() {
		return "Truck Arrival - Axles: " + this.numaxles + " Total Weight: " + this.totalweight
	          + " Toll Due: " + this.tollDue;

    }
	
	public String DisplaytoString() {
		return "Totals since last collection - Receipts: $" + this.receiptsSinceCollection + " Trucks: " + 
				this.trucksSinceCollection + "\n ************************************************************* \n";

    }
	
	public String ResettoString() {
		return "*** Collecting receipts ***";

    }
}
