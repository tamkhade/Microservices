package com.java8.stream;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	
	public static void sumOfNumbers(List<Integer> integerslist)
	{
		
		IntStream ins =  IntStream.range(1, 51);
		
		ins.forEach(System.out::println);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		sumOfNumbers(list);

	}

}
