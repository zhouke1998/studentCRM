package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mypack.mapper.StudentMapper;
import com.mypack.model.Student;
import com.mypack.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Resource
	private StudentMapper studentMapper;

	@Override
	public List<Student> getStudent(Student student){
		if (student.getPage()!=-1) {
			int start = (student.getPage() - 1) * 5;
			student.setPage(start);
		}
		return studentMapper.getStudent(student);
	}

	@Override
	public int getStudentNumber(Student student) {
		return studentMapper.getStudentNumber(student);
	}

	@Override
	public String delStuById(int id) {
		return studentMapper.delStuById(id)==1?"OK":"NO";
	}

	@Override
	public String insStu(Student student) {
		return studentMapper.insStu(student)==1?"OK":"NO";
	}

	@Override
	public int getStuCode() {
		return studentMapper.getStuCode()+1;
	}

	@Override
	public Student getStudentById(int id) {
		return studentMapper.getStudentById(id);
	}

	@Override
	public String updStu(Student student) {
		return studentMapper.updStu(student)==1?"OK":"NO";
	}
}
