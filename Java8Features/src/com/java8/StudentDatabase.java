package com.java8;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	
	
	
	public static List<Student> getStudentDatabase()
	{
		
		
		Student student1 = new Student("mahesh",2,3.6,"male",11,Arrays.asList("swimming,basketball,vollyball"));
		
		Student student2 = new Student("jenney",2,3.8,"female",12,Arrays.asList("swimming,basketball,vollyball"));

		Student student3 = new Student("somya",3,4.0,"male",13,Arrays.asList("swimming,basketball,vollyball"));

		Student student4 = new Student("gomya",3,3.9,"male",14,Arrays.asList("swimming,basketball,vollyball"));

		Student student5 = new Student("balu",4,3.5,"male",15,Arrays.asList("swimming,basketball,vollyball"));

		Student student6 = new Student("shahu",4,3.9,"male",16,Arrays.asList("swimming,basketball,vollyball"));

		List<Student> list = Arrays.asList(student1,student2,student3,student4,student5,student6);
	return 	list;
	
	}

}
