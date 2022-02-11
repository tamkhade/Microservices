package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	public Student(String name, int gradelevel, double gpa, String gender, int notebooks, List activityList) {
		super();
		this.name = name;
		this.gradelevel = gradelevel;
		this.gpa = gpa;
		this.gender = gender;
		this.notebooks = notebooks;
		this.activityList = activityList;
	}
	private String name;
	private int gradelevel;
	private double gpa;
	private String gender;
	public int getNotebooks() {
		return notebooks;
	}
	public void setNotebooks(int notebooks) {
		this.notebooks = notebooks;
	}
	private int notebooks;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gradelevel=" + gradelevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activityList=" + activityList + "]";
	}
	public Student(String name, int gradelevel, double gpa, String gender, List activityList) {
		super();
		this.name = name;
		this.gradelevel = gradelevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activityList = activityList;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(int gradelevel) {
		this.gradelevel = gradelevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List getActivityList() {
		return activityList;
	}
	public void setActivityList(List activityList) {
		this.activityList = activityList;
	}
	public List activityList = new ArrayList<>();
	
	
	

}
