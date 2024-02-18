package com.school.model;

public class School  {
	int id;
   String name;
   int numTeacher;
   int numStudent;
   int numStaff;
   int classes ;
   int building;
   School( int id,String name,int numTeacher, int numStudent, int numStaff, int classes,int building){
	   this.id=id;
	   this.name=name;
	   this.numTeacher=numTeacher;
	   this.numStudent=numStudent;
	   this.numStaff=numStaff;
	   this.classes=classes;
	   this.building=building;
   }
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public int getNumTeacher() {
	return numTeacher;
}
public void setNumTeacher(int numTeacher) {
	this.numTeacher = numTeacher;
}
public int getNumStudent() {
	return numStudent;
}
public void setNumStudent(int numStudent) {
	this.numStudent = numStudent;
}
public int getNumStaff() {
	return numStaff;
}
public void setNumStaff(int numStaff) {
	this.numStaff = numStaff;
}
public int getClasses() {
	return classes;
}
public void setClasses(int classes) {
	this.classes = classes;
}
public int getBuilding() {
	return building;
}
public void setBuilding(int building) {
	this.building = building;
} 
}
