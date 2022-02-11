package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.Student;
import com.java8.StudentDatabase;

public class StreamFilterExample {
	
	
	public static List<Student> filterStudents()
	{
		return StudentDatabase.getStudentDatabase().stream()
		              .filter((student) -> student.getGender().equals("female"))
		              .collect(Collectors.toList());
		
	}
	
	
	public static void main(String[] args) {
		
	
		System.out.println(filterStudents());;
	}

}
