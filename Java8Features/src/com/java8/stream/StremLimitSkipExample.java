package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StremLimitSkipExample {
	
	public static Optional<Integer> limitNumber(List<Integer> integer)
	{
		//6
		//7
		
		return integer.stream()
		      .limit(2)
		      .reduce((a,b) ->a+b);

	}
	
	public static Optional<Integer> skipNumber(List<Integer> integer)
	{
		//6
		//7
		
		return integer.stream()
		      .skip(3)
		      .reduce((a,b) ->a+b);

	}
	
	
	public static void main(String[] args) {
		
		List<Integer> integer = Arrays.asList(6,7,8,9,10);
	System.out.println(limitNumber(integer));	;
	System.out.println((skipNumber(integer)));
	}

}
