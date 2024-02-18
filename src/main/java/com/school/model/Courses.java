package com.school.model;

public class Courses {

 
   String name;
   int code;
   int numRejstered;
   String nameTeacher;

   Courses( String name, int code, int numRejstered, String nameTeacher){
	   this.name=name;
	   this.code=code;
	   this.numRejstered=numRejstered;
	   this.nameTeacher=nameTeacher;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public int getNumRejstered() {
	return numRejstered;
}
public void setNumRejstered(int numRejstered) {
	this.numRejstered = numRejstered;
}
public String getNameTeacher() {
	return nameTeacher;
}
public void setNameTeacher(String nameTeacher) {
	this.nameTeacher = nameTeacher;
}
}


