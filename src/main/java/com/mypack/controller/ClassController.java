package com.mypack.controller;

import java.text.ParseException;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Class;
import com.mypack.service.ClassService;
import com.mypack.tools.TraDate;

@Controller
public class ClassController{
	@Resource
	private ClassService classServiceImpl;
	
	@RequestMapping("/ajax/getClass")
	@ResponseBody
	public List<Class> getAllClass(Class class1){
		return classServiceImpl.getClasses(class1);
    }
	
	@RequestMapping("/index/class")
	public String stuHref(){
		return "/index/cla_ss.html";
	}

	@RequestMapping("/ajax/getClassNumber")
	@ResponseBody
	public int getClassNumber(Class class1){
		return classServiceImpl.getClassNumber(class1);
	}
	
	@RequestMapping(value = "/ajax/createClass",method=RequestMethod.POST)
	@ResponseBody
	public String createClass(Class class1,String beginTime2,String endTime2){
		try {
			class1.setBeginTime(TraDate.traDate(beginTime2));
			class1.setEndTime(TraDate.traDate(endTime2));
		} catch (ParseException e) {
			return "NO";
		}
		System.out.println(class1);
		return classServiceImpl.insClass(class1);
	}
	
	@RequestMapping(value = "/ajax/getcrmclassById",method=RequestMethod.GET)
	@ResponseBody
	public Class getcrmclassById(int id){
		return classServiceImpl.getClassById(id);
	}
	
	@RequestMapping(value = "/ajax/updateClass",method=RequestMethod.POST)
	@ResponseBody
	public String updateClass(Class class1,String beginTime2,String endTime2){
		try {
			class1.setBeginTime(TraDate.traDate(beginTime2));
			class1.setEndTime(TraDate.traDate(endTime2));
		} catch (ParseException e) {
			return "NO";
		}
		return classServiceImpl.updateClass(class1);
	}
	
	@RequestMapping(value = "/ajax/deleteClass",method=RequestMethod.POST)
	@ResponseBody
	public String deleteClass(int id){
		return classServiceImpl.delClass(id);
	}
}
