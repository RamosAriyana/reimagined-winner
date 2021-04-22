package org.howard.edu.assignment7.tollbooth;

public class HinoTruck implements Truck {
	private int numaxles;
	private int totalweight;
	private String make = "Hino";
	
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
	
	/**
	 * This function gets the make of the truck
	 * @return make
	 */
	public String getMake() {
		return this.make;
	}

}
