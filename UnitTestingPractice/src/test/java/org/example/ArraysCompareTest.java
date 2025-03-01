package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
//		assertEquals(expected,numbers); //it checks the hashcode of the both object !
		assertArrayEquals(expected, numbers);
	}

	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		//it is a negative type test
		//if numbers is not null then it will fail the testcase bcz it expects nullPointerException
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=100)
	public void testSort_Performance(){
		//if it takes more time than this timeout then it will fail
		int array[] = {12,23,4};
		for(int i=1;i<=1000000;i++)
		{
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
