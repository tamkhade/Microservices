package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intergerList = Arrays.asList(4,5,7,10,87);
		
	System.out.println(findMaxvalueOptional(intergerList));	;
	}
	
	
public static Optional<Integer> findMaxvalueOptional(List<Integer> list)
{
	return
	
			list.stream()
			//4
			//5
			//7
			//10
			//87
			//x varibale hold max value for each element in the iterration
	        .reduce((a,b) ->a>b ?a : b);
	
}

}
