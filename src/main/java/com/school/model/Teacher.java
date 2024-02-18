package com.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher  {
     @Id
	int id;
	private String name;
	private int age;
	private  int Salary;
	private  int Season;
	private  int numdayswork;
	private  String socialStatus;
	 
	  
	  Teacher(int id,String name,int age, int Salary,int timetable,int numdayswork, String socialStatus){
		  this.id=id;
		  this.name=name;
		   this.age=age;
		   this.Salary=Salary;
		   this.Season=timetable;
		   this.numdayswork=numdayswork;
		   this.socialStatus=socialStatus;
	  }


	 



	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public int getTimetable() {
		return Season;
	}


	public void setTimetable(int timetable) {
		this.Season = timetable;
	}


	public int getNumdayswork() {
		return numdayswork;
	}


	public void setNumdayswork(int numdayswork) {
		this.numdayswork = numdayswork;
	}
	public String getSocialStatus() {
		return socialStatus;
	}
	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	public int getSeason() {
		return Season;
	}






	public void setSeason(int season) {
		Season = season;
	}
	
	 
 






	 
}

