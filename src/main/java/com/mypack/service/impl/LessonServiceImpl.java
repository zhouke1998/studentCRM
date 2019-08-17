package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mypack.mapper.LessonMapper;
import com.mypack.model.Lesson;
import com.mypack.service.LessonService;
@Service
public class LessonServiceImpl implements LessonService{
	@Resource
	private LessonMapper lessonMapper;

	@Override
	public List<Lesson> getLesson(Lesson lesson){
		if (lesson.getPage()!=-1) {
			int start = (lesson.getPage() - 1) * 5;
			lesson.setPage(start);
		}
		return lessonMapper.getLesson(lesson);
	}

	@Override
	public int getLessonNumber(Lesson lesson) {
		return lessonMapper.getLessonNumber(lesson);
	}

	@Override
	public String insLesson(Lesson lesson) {
		return lessonMapper.insLesson(lesson)==1?"OK":"NO";
	}

	@Override
	public Lesson getLessonById(int id) {
		return lessonMapper.getLessonById(id);
	}

	@Override
	public String updateLesson(Lesson lesson) {
		return lessonMapper.updateLesson(lesson)==1?"OK":"NO";
	}

	@Override
	public String deleteLesson(int id) {
		return lessonMapper.deleteLesson(id)==1?"OK":"NO";
	}
}
