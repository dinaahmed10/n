package com.school.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student   {

	 

	@Id
	int id;
	private String name;
	private int age;
	//@Column(name="schoolYear")
	private int schoolYear;
	private	String classs;
	//@Column(name="numCourses")
	private	int numCourses;
	
	Student(){
		
	}
	Student(int id,String name,int age,int schoolYear,String classs, int numCourses){
		  this.id=id;
		   this.name=name;
		   this.age=age;
		   this.schoolYear=schoolYear;
		   this.classs=classs;
		   this.numCourses=numCourses;
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
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public int getNumCourses() {
		return numCourses;
	}
	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

 


}



