package org.example;


import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {
	@Test(timeout=28)
	public void testPerformance() {
		for(int  i=0;i<1000000;i++){
			Arrays.sort(new int[]{i,i-1,i+1});
		}
	}
}
