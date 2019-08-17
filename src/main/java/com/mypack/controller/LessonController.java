package com.mypack.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Lesson;
import com.mypack.service.LessonService;

@Controller
public class LessonController{
	@Resource
	private LessonService lessonServiceImpl;
	
	@RequestMapping("/ajax/getLesson")
	@ResponseBody
	public List<Lesson> getLesson(Lesson lesson){
		return lessonServiceImpl.getLesson(lesson);
    }
	
	@RequestMapping("/index/lesson")
	String stuHref(){
		return "/index/les_son.html";
	}

	@RequestMapping("/ajax/getLessonNumber")
	@ResponseBody
	public int getLessonNumber(Lesson lesson){
		return lessonServiceImpl.getLessonNumber(lesson);
	}

	@RequestMapping(value = "/ajax/createLesson",method=RequestMethod.POST)
	@ResponseBody
	public String createLesson(Lesson lesson){
		return lessonServiceImpl.insLesson(lesson);
    }
	
	@RequestMapping("/ajax/getLessonById")
	@ResponseBody
	public Lesson getLessonById(int id){
		return lessonServiceImpl.getLessonById(id);
    }
	
	@RequestMapping(value="/ajax/updateLesson",method=RequestMethod.POST)
	@ResponseBody
	public String updateLesson(Lesson lesson){
		return lessonServiceImpl.updateLesson(lesson);
    }
	
	@RequestMapping(value="/ajax/deleteLesson",method=RequestMethod.POST)
	@ResponseBody
	public String deleteLesson(int id){
		return lessonServiceImpl.deleteLesson(id);
    }
	
}
