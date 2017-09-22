package com.shocard;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Question1Test {

	

	@Test
	public void testBalanced() {
		ArrayList<String> balanced = new ArrayList<>();
		balanced.add("(1+2)");
		balanced.add("1+2[]");
		balanced.add("if(true)");
		balanced.add("void test() { }");
		
			
		//method results
		for (String s : balanced) {
			boolean condition = Question1.isBalanced(s);
			System.out.println("is "+s+ " balanced? --> " + condition);
			assertTrue( condition);
		}
		
		
	}
	
	
	
	@Test
	public void testUnBalanced() {
		ArrayList<String> balanced = new ArrayList<>();
		balanced.add("(1+2");
		balanced.add("1+2]");
		balanced.add("iftrue)");
		balanced.add("void test() { ");
		
			
		//method results
		for (String s : balanced) {
			boolean condition = Question1.isBalanced(s);
			System.out.println("is "+s+ " balanced? --> " + condition);
			assertFalse( condition);
		}
		
		
	}
	
}