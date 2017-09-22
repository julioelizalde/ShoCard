package com.shocard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question4Test {

	

	@Test
	public void test() {

		//input array
		int[] a = { 7, 9, 12, 9, 9, 8, 19, 22, 21, 22, 12, 6, 7, 9, 7 };
	
		//expected result for this test
		int[] expecteds = {7, 9, 12, 8, 19, 22, 21, 6};
		
		//method results
		int[] actuals = Question4.removeDuplicates(a);
		
		assertArrayEquals(expecteds, actuals);
		
	}
	
}