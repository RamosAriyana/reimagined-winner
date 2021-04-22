package org.howard.edu.assignment7.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.howard.edu.assignment7.tollbooth.ColumbusTollBooth;
import org.howard.edu.assignment7.tollbooth.HinoTruck;
import org.howard.edu.assignment7.tollbooth.RenaultTruck;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColumbusTollBoothTest {

	@Test
	//@DisplayName("Test case for clear")
	void testCalculateToll() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		booth.calculateToll(renault);
		String expectedValue = "Truck Arrival - Axles: 5 Total Weight: 12000 Toll Due: 145";
	    assertEquals(expectedValue, ((ColumbusTollBooth) booth).CalculatetoString());
	}
	
	@Test
	//@DisplayName("Test case for clear")
	void testCalculateToll1() {
		TollBooth booth = new ColumbusTollBooth();
		Truck hino = new HinoTruck(2, 5000); 
		booth.calculateToll(hino);
	}
	
	@Test
	//@DisplayName("Test case for clear")
	void testCalculateToll2() {
		TollBooth booth = new ColumbusTollBooth();
		Truck hino = new HinoTruck(6, 17000);
		booth.calculateToll(hino);
	}

	@Test
	void testDisplayData() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		booth.calculateToll(renault);
		booth.displayData();
	}
	
	@Test
	void testDisplayData1() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		booth.calculateToll(renault);
		booth.displayData();
		booth.calculateToll(hino);
		booth.displayData();	
	}
	
	@Test
	void testDisplayData2() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		Truck hino2 = new HinoTruck(6, 17000);
		booth.calculateToll(renault);
		booth.displayData();
		booth.calculateToll(hino);
		booth.reset();
		booth.calculateToll(hino2);
		booth.displayData();	
	}

	@Test
	void testReset() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		//booth.calculateToll(renault);
		booth.reset();
		//String expectedValue = "Truck Arrival - Axles: 5 Total Weight: 12000 Toll Due: 145";
	    assertEquals(5, 12000);
	}
	
	@Test
	public void testCalculateToString() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		booth.calculateToll(renault);
	    String expectedValue = "Truck Arrival - Axles: 5 Total Weight: 12000 Toll Due: 145";
	    assertEquals(expectedValue, ((ColumbusTollBooth) booth).CalculatetoString());
	}

}
