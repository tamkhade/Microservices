package com.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.Student;
import com.java8.StudentDatabase;

public class StramComparator {
	
	public static List<Student> sortStudent()
	{
		
		
		return StudentDatabase.getStudentDatabase()
		               .stream()
		               .sorted(Comparator.comparing(Student::getName))
		               .collect(Collectors.toList());
		
	}
	
	public static List<Student> sortStudentGpa()
	{
		
		
		return StudentDatabase.getStudentDatabase()
		               .stream()
		               .sorted(Comparator.comparing(Student::getGpa))
		               .collect(Collectors.toList());
		
	}
	
	public static List<Student> sortStudentGpaDREC()
	{
		
		
		return StudentDatabase.getStudentDatabase()
		               .stream()
		               .sorted(Comparator.comparing(Student::getGpa).reversed())
		               .collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		sortStudent().forEach(System.out::println);
		sortStudentGpa().forEach(System.out::println);
		sortStudentGpaDREC().forEach(System.out::println);

		
		//System.out.println(" list--"+sortStudent());

	}

}
