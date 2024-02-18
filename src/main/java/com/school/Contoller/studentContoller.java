package com.school.Contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.Servise.StudentServise;
import com.school.model.Student;

 

@RestController
public class studentContoller {
	@Autowired
	private StudentServise StudentServises;
	 @GetMapping("/students")
	    public List<Student> getAllStudents() {
	
	       return StudentServises.getAll();
	    }
	 @GetMapping("/student")
	 public Optional<Student> getByID(@RequestParam int id) {
		 return StudentServises.getByid(id);
	 
	 }
	 
	 @GetMapping("/studentBy")
	 public List<Student> getByClassses(@RequestParam String classe) {
		 return StudentServises.getByClasss(classe);
	 }
	 @PostMapping("/addStudent")
	 public String addStudent(@RequestBody Student student) {
		 StudentServises.addStudent(student);
		 return "done";
	 }
	 @PutMapping("/UpdateStudent")
	 public String updateStudent(@RequestBody Student student) {
		 StudentServises.addStudent(student);
		 return "done";
	 }
	 @DeleteMapping("/DeleteStudent")
	 public String deleteStudent(@RequestParam int id) {
		 StudentServises.deletdStudent(id);
		 return "done";
	 }
	 
}
