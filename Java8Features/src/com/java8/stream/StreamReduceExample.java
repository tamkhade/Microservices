package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

	
	
	
	
	public static int performMultiplication(List<Integer> integerlist)
	{
		return integerlist.stream()
		//1
		//2
		//3
		//5
		//7
		//a=1,b=1(from stream) =>result 1 is return
		//a=1,b=2 result 2 is return
		//a=3,b=3 result 9 is return
		.reduce(1,(a,b) -> a*b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integer = Arrays.asList(1,2,3,5,7);
		System.out.println(performMultiplication(integer));

	}

}
