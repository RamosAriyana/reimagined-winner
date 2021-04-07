package org.howard.edu.lsp.assignment4.test;

import java.util.*;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> setA = new ArrayList<>();
		ArrayList<Integer> setB = new ArrayList<>();
		  
		IntegerSet set1 = new IntegerSet(setA);
		IntegerSet set2 = new IntegerSet(setB);
		
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
		  
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		  
		System.out.println("Set 1: " + set1.getSet());
		System.out.println("Set 2: " + set2.getSet());
		  
		System.out.println("Is Equal: " + set1.equals(set2));
		
		System.out.println("Contains '7': " + set1.contains(7));
		
		set1.union(set2);
		
		System.out.println("Union: " + set1.toString());
		
		set1.diff(set2);
		
		System.out.println("Difference: " + set1.toString());
		  
		try {
			System.out.println("Largest Element in Set 1: " + set1.largest());
			System.out.println("Largest Element in Set 2: " + set2.largest());
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		  
		try {
			System.out.println("Smallest Element in Set 1: " + set1.smallest());
			System.out.println("Smallest Element in Set 2: " + set2.smallest());
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		set1.remove(7);
		
		System.out.println("Set 1: " + set1.getSet());
		
		System.out.println("Contains '7': " + set1.contains(7));
		
		System.out.println("Set 1 Size: " + set1.length());
		System.out.println("Set 2 Size: " + set2.length());
		
		
		System.out.println("Set 1 Is Empty: " + set1.isEmpty());
		System.out.println("Set 2 Is Empty: " + set2.isEmpty());
		
		set1.clear();
		
		System.out.println("Set 1: " + set1.getSet());
		System.out.println("Set 2: " + set2.getSet());
		
		System.out.println("Set 1 Is Empty: " + set1.isEmpty());
		System.out.println("Set 2 Is Empty: " + set2.isEmpty());
		
		set1.add(-0);
		set1.add(-2);
		set1.add(-4);
		set1.add(-6);
		set1.add(-8);
		
		System.out.println("Set 1: " + set1.getSet());
		System.out.println("Set 2: " + set2.getSet());
		
		System.out.println("Contains '2': " + set1.contains(2));
		
		set2.remove(4);
		set2.remove(8);
		
		set2.add(-81);
		set2.add(69);
		
		try {
			System.out.println("Largest Element in Set 1: " + set1.largest());
			System.out.println("Largest Element in Set 2: " + set2.largest());
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		  
		try {
			System.out.println("Smallest Element in Set 1: " + set1.smallest());
			System.out.println("Smallest Element in Set 2: " + set2.smallest());
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		set1.clear();
		set2.clear();
		
		System.out.println("Set 1: " + set1.getSet());
		System.out.println("Set 2: " + set2.getSet());
		
		try {
			System.out.println("Largest Element in Set 1: " + set1.largest());
			System.out.println("Largest Element in Set 2: " + set2.largest());
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		  
		try {
			System.out.println("Smallest Element in Set 1: " + set1.smallest());
			System.out.println("Smallest Element in Set 2: " + set2.smallest());
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println("Set 1 Is Empty: " + set1.isEmpty());
		System.out.println("Set 2 Is Empty: " + set2.isEmpty());
		
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
		  
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		set1.intersect(set2);
		
		System.out.println("Intersection: " + set1.toString());
	}

}