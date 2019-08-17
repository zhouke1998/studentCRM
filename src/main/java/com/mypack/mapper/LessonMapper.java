package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Lesson;

public interface LessonMapper {
	List<Lesson> getLesson(Lesson lesson);

	int getLessonNumber(Lesson lesson);

	int insLesson(Lesson lesson);
	
	Lesson getLessonById(int id);
	
	int updateLesson(Lesson lesson);
	
	int deleteLesson(int id);
}
