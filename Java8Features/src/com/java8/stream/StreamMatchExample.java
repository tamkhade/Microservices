package com.java8.stream;

import com.java8.StudentDatabase;

public class StreamMatchExample {

	public static boolean allMatch() {
		
		return StudentDatabase.getStudentDatabase().stream()
		   .allMatch(student -> student.getGpa() >=3.5);
	}
	
public static boolean anyMatch() {
		
		return StudentDatabase.getStudentDatabase().stream()
		   .anyMatch(student -> student.getGpa() >=3.4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(allMatch());
		
		System.out.println(anyMatch());

	}

}
