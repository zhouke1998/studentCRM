package com.mypack.controller;

import java.text.ParseException;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Student;
import com.mypack.service.StudentService;
import com.mypack.tools.TraDate;

@Controller
public class StudentController{
	@Resource
	private StudentService studentServiceImpl;
	
	@RequestMapping("/ajax/getStudent")
	@ResponseBody
	public List<Student> getAllStudent(Student student){
		return studentServiceImpl.getStudent(student);
    }
	
	@RequestMapping("/index/student")
	String stuHref(){
		return "/index/stu.html";
	}

	@RequestMapping("/ajax/getStudentNumber")
	@ResponseBody
	public int getStudentNumber(Student student){
		return studentServiceImpl.getStudentNumber(student);
	}
	
	@RequestMapping(value="/ajax/deleteStu",method=RequestMethod.POST)
	@ResponseBody
	public String deleteStudent(int id){
		return studentServiceImpl.delStuById(id);
    }
	
	@RequestMapping(value="/ajax/createStu",method=RequestMethod.POST)
	@ResponseBody
	public String createStu(Student student,String beginTime2,String jobTime2){
		try {
			student.setBeginTime(TraDate.traDate(beginTime2));
			student.setJobTime(TraDate.traDate(jobTime2));
		} catch (ParseException e) {
			return "NO";
		}
		student.setStuCode(String.valueOf(studentServiceImpl.getStuCode()));
		return studentServiceImpl.insStu(student);
    }
	
	@RequestMapping("/ajax/getStudentById")
	@ResponseBody
	public Student getStudentById(int id){
		return studentServiceImpl.getStudentById(id);
    }
	
	@RequestMapping(value="/ajax/updateStu",method=RequestMethod.POST)
	@ResponseBody
	public String updateStu(Student student,String beginTime2,String jobTime2){
		try {
			student.setBeginTime(TraDate.traDate(beginTime2));
			student.setJobTime(TraDate.traDate(jobTime2));
		} catch (ParseException e) {
			e.printStackTrace();
			return "NO";
		}
		student.setStuCode(String.valueOf(studentServiceImpl.getStuCode()));
		if(student.getReferid().equals("")){
			student.setReferid(null);
		}
		try{
			return studentServiceImpl.updStu(student);
		}catch (Exception e) {
			e.printStackTrace();
			return "No";
		}
    }
}
