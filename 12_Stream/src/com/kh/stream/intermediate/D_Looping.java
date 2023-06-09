package com.kh.stream.intermediate;

import java.util.Arrays;

public class D_Looping {

	
	public static void main(String[] args) {

		int sum = 0;
		int [] values = {1,2,3,4,5};
		
		sum = Arrays.stream(values).filter(i -> i % 2 ==0).peek(value -> System.out.println(value)).sum();
		System.out.println(sum);
		
		sum = Arrays.stream(values).filter(i -> i % 2 ==0)
//				.forEach(value -> System.out.println(value))
				.sum();
		System.out.println(sum);
	}

}
