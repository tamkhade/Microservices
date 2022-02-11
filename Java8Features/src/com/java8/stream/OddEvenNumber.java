package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddEvenNumber {
	
	
	
	
	public static void checkData(int input2)
	{
		int number=3;
		int number2=5;
		
		if(input2%number==0 || input2%number2==0)
		{
			System.out.println("bizz");
			
		}else if(input2%number2==0)
		{
			System.out.println("fizz");
		}else if(input2%number==0 && input2%number2==0)
		{
			System.out.println("bizz fizz");
		}else
		{
			System.out.println(input2);
			
		}
	
		
		
	}
	

	
	public static Optional<Integer> checkCommon(List<Integer> listInput)
	{
		
	return 	listInput.stream()
		.reduce((s1,s2) -> {
			
			if(s1==s2)
			{
				
				return s1;
			}else
			{
				return s2;
			}
		});
		
		
		
	}
	
	
	
	public static boolean checkEven(int inputvalue)
	{
		return inputvalue%2==0;	
	}
	
	public static boolean checkOdd(int listInput)
	{
		return listInput%2!=0;	
	}
	
	public static void main(String[] args) {
		
		List<Integer> listInput = Arrays.asList(3,5,5,4);
		//checkData(15);
	   System.out.println(checkCommon(listInput));
	}

}
