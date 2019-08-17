package com.mypack.service;

import java.util.List;
import com.mypack.model.Class;

public interface ClassService {
	List<Class> getClasses(Class class1);

	int getClassNumber(Class class1);

	String insClass(Class class1);
	
	Class getClassById(int id);
	
	String updateClass(Class class1);
	
	String delClass(int id);
}
