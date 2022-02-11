package com.java8.stream;

import com.java8.Student;
import com.java8.StudentDatabase;

public class StreamMapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(noOfNoteBooks());
	}

	
	
	public static int noOfNoteBooks()
	{
		
	    int numberOfNoteBook =	StudentDatabase.getStudentDatabase().stream()
		              .map(Student::getNotebooks)//Stream<integer>
		              .reduce(0,(a,b) ->a+b);
		              
		return numberOfNoteBook;              
	}
}
