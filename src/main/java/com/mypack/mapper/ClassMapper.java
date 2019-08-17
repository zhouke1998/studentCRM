package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Class;

public interface ClassMapper {
	List<Class> getClasses(Class class1);

	int getClassNumber(Class class1);

	int insClass(Class class1);
	
	Class getClassById(int id);
	
	int updateClass(Class class1);
	
	int delClass(int id);
}
