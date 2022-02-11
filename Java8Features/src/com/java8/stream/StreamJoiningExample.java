package com.java8.stream;

import java.util.stream.Collectors;

import com.java8.Student;
import com.java8.StudentDatabase;

public class StreamJoiningExample {

	
	
	public static String studentData()
	{
		return StudentDatabase.getStudentDatabase()
		              .stream()
		              .map(Student :: getName)
		              .collect(Collectors.joining());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(studentData());

	}

}
