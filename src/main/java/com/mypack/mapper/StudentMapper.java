package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Student;

public interface StudentMapper {
	List<Student> getStudent(Student student);

	int getStudentNumber(Student student);
	
	int delStuById(int id);
	
	int insStu(Student student);
	
	int getStuCode();
	
	Student getStudentById(int id);
	
	int updStu(Student student);
}
