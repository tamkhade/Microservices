package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStringMapExample {

  public static List<Integer> maptoObjectMethod() {
		  
	 return  IntStream.rangeClosed(1, 50)
	  .mapToObj((i) -> {
		  
		  return new Integer(i);
		  
	  })
	  .collect(Collectors.toList());
	  
	  
		  
	  }
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("maptoObjectMethod "+maptoObjectMethod());

	}

}
