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

/**
 * This class contains the test cases for the methods in the ColumbusTollBooth class
 */
class ColumbusTollBoothTest {

	@Test
	@DisplayName("Test case for CalculateToll")
	void testCalculateToll() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		booth.calculateToll(renault);
		String expectedValue = "Truck Arrival - Axles: 5 Total Weight: 12000 Toll Due: 145";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for CalculateToll")
	void testCalculateToll1() {
		TollBooth booth = new ColumbusTollBooth();
		Truck hino = new HinoTruck(2, 5000); 
		booth.calculateToll(hino);
		String expectedValue = "Truck Arrival - Axles: 2 Total Weight: 5000 Toll Due: 60";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for CalculateToll")
	void testCalculateToll2() {
		TollBooth booth = new ColumbusTollBooth();
		Truck hino = new HinoTruck(6, 17000);
		booth.calculateToll(hino);
		String expectedValue = "Truck Arrival - Axles: 6 Total Weight: 17000 Toll Due: 200";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for CalculateToll with 0 values")
	void testCalculateToll3() {
		TollBooth booth = new ColumbusTollBooth();
		Truck hino = new HinoTruck(0, 0);
		booth.calculateToll(hino);
		String expectedValue = "Truck Arrival - Axles: 0 Total Weight: 0 Toll Due: 0";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for CalculateToll with large values")
	void testCalculateToll4() {
		TollBooth booth = new ColumbusTollBooth();
		Truck hino = new HinoTruck(18, 80000);
		booth.calculateToll(hino);
		String expectedValue = "Truck Arrival - Axles: 18 Total Weight: 80000 Toll Due: 890";
	    assertEquals(expectedValue, booth.toString());
	}

	@Test
	@DisplayName("Test case for DisplayData with empty booth")
	void testDisplayData() {
		TollBooth booth = new ColumbusTollBooth();
		booth.displayData();
		String expectedValue = "Totals since last collection - Receipts: $0 Trucks: 0";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for DisplayData")
	void testDisplayData1() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		booth.calculateToll(renault);
		booth.displayData();	
		String expectedValue = "Totals since last collection - Receipts: $145 Trucks: 1";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for DisplayData")
	void testDisplayData2() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.displayData();	
		String expectedValue = "Totals since last collection - Receipts: $205 Trucks: 2";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for DisplayData after calling reset()")
	void testDisplayData3() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		Truck hino2 = new HinoTruck(6, 17000);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.reset();
		booth.calculateToll(hino2);
		booth.displayData();	
		String expectedValue = "Totals since last collection - Receipts: $200 Trucks: 1";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for DisplayData after calling reset()")
	void testDisplayData4() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		Truck hino2 = new HinoTruck(3, 4500);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.reset();
		booth.calculateToll(hino2);
		booth.displayData();	
		String expectedValue = "Totals since last collection - Receipts: $55 Trucks: 1";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for DisplayData with many trucks")
	void testDisplayData5() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		Truck hino2 = new HinoTruck(3, 4500);
		Truck renault2 = new RenaultTruck(6, 17000);
		Truck renault3 = new RenaultTruck(18, 80000);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.calculateToll(hino2);
		booth.calculateToll(renault2);
		booth.calculateToll(renault3);
		booth.displayData();	
		String expectedValue = "Totals since last collection - Receipts: $1350 Trucks: 5";
	    assertEquals(expectedValue, booth.toString());
	}

	@Test
	@DisplayName("Test case for Reset")
	void testReset() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		booth.calculateToll(renault);
		booth.reset();
		booth.displayData();
		String expectedValue = "Totals since last collection - Receipts: $0 Trucks: 0";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for Reset")
	void testReset1() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.reset();
		booth.displayData();
		String expectedValue = "Totals since last collection - Receipts: $0 Trucks: 0";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for Reset to output most recent totals before reset")
	void testReset2() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.reset();
		String expectedValue = "Totals since last collection - Receipts: $205 Trucks: 2";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for Reset calculating toll after calling reset()")
	void testReset3() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		booth.calculateToll(renault);
		booth.reset();
		booth.calculateToll(hino);
		booth.displayData();
		String expectedValue = "Totals since last collection - Receipts: $60 Trucks: 1";
	    assertEquals(expectedValue, booth.toString());
	}
	
	@Test
	@DisplayName("Test case for Reset calling reset() multiple times")
	void testReset4() {
		TollBooth booth = new ColumbusTollBooth();
		Truck renault = new RenaultTruck(5, 12000);
		Truck hino = new HinoTruck(2, 5000);
		Truck hino2 = new HinoTruck(3, 4500);
		Truck renault2 = new RenaultTruck(6, 17000);
		Truck renault3 = new RenaultTruck(18, 80000);
		booth.calculateToll(renault);
		booth.calculateToll(hino);
		booth.reset();
		booth.calculateToll(hino2);
		booth.reset();
		booth.calculateToll(renault2);
		booth.calculateToll(renault3);
		booth.displayData();
		String expectedValue = "Totals since last collection - Receipts: $1090 Trucks: 2";
	    assertEquals(expectedValue, booth.toString());
	}

}
