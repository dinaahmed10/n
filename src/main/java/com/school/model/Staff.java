package com.school.model;
public class Staff extends Person{
	  
	private  String jop;
	private  int Salary;
	private  int timetable;
	private  int numdayswork;
	private  String socialStatus;
	 
	  
	  Staff(int id,String name, int age, String jop,int Salary,int timetable,int numdayswork, String socialStatus){
		  super(id,name,age);
		   this.jop=jop;
		   this.Salary=timetable;
		   this.numdayswork=numdayswork;
		   this.socialStatus=socialStatus;
	  }

 
	public String getJop() {
		return jop;
	}
	public void setJop(String jop) {
		this.jop = jop;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getTimetable() {
		return timetable;
	}
	public void setTimetable(int timetable) {
		this.timetable = timetable;
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


	@Override
	public void Print() {
		// TODO Auto-generated method stub
		
	}
}
