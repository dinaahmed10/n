package com.school.Servise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.Repository.studentRepository;
import com.school.model.Student;
@Service
@Transactional
public class StudentServise {
	 @Autowired
	private studentRepository studentrepository;
	 
		public List<Student> getAll() { 
			return studentrepository.findAll();
		}
		public  Optional<Student> getByid(int id) { 
			return studentrepository.findById(id);
		}
		public List<Student> getByClasss(String classs) { 
			return studentrepository.findByClasss(classs);
		}
		public void addStudent(Student student) {
			studentrepository.save(student);
		}
		public void deletdStudent(int id) {
			studentrepository.deleteById(id);
		}
		
		
}
