package com.mypack.service;

import java.util.List;
import com.mypack.model.Lesson;

public interface LessonService {
	List<Lesson> getLesson(Lesson lesson);

	int getLessonNumber(Lesson lesson);
	
	String insLesson(Lesson lesson);
	
	Lesson getLessonById(int id);
	
	String updateLesson(Lesson lesson);
	
	String deleteLesson(int id);
}
