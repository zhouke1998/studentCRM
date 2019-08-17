package com.mypack.service;

import java.util.List;
import com.mypack.model.Student;

public interface StudentService {
	List<Student> getStudent(Student student);

	int getStudentNumber(Student student);
	
	String delStuById(int id);
	
	String insStu(Student student);
	
	int getStuCode();
	
	Student getStudentById(int id);
	
	String updStu(Student student);
}
