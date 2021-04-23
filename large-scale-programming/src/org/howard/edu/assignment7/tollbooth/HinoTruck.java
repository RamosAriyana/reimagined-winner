package org.howard.edu.assignment7.tollbooth;

/**
 * This class implements and constructs a Hino truck.
 */
public class HinoTruck implements Truck {
	/**
	 * Declares attributes of the RenaultTruck class.
	 */
	private int numaxles;
	private int totalweight;
	
	/**
	 * This constructs a Hino truck with the axles and weight information that is an argument when called in the main.
	 * @param axles number of axles for the truck
	 * @param weight total weight of the truck
	 */
	public HinoTruck(int axles, int weight) {
		this.numaxles = axles;
		this.totalweight = weight;
	}
	
	/**
	 * This function gets the number of axles of the truck
	 * @return numaxles 
	 */
	public int getAxles() {
		return this.numaxles;
	}
	
	/**
	 * This function gets the weight of the truck
	 * @return totalweight
	 */
	public int getTotalWeight() {
		return this.totalweight;
	}

}
