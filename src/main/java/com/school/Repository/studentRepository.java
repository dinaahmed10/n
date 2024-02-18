package com.school.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Student;
@Repository
public interface studentRepository  extends JpaRepository<Student,Integer> {
	public List<Student> findByClasss(String classs);
}
