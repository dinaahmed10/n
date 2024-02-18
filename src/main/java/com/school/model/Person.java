package com.school.model;

import jakarta.persistence.Id;

public abstract class Person   {
	 @Id
	int id;
	private String name;
	private int age;
	  Person(){
		  
	  }
	  Person(int id,String name,int age){
		  this.id=id;
		  this.name=name;
		   this.age=age;
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
	public abstract void Print();
	 
	
	public void show() {
		System.out.println("Hello Person");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
