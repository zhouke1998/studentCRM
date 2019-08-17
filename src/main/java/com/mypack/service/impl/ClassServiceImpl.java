package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mypack.mapper.ClassMapper;
import com.mypack.model.Class;
import com.mypack.service.ClassService;
@Service
public class ClassServiceImpl implements ClassService{
	@Resource
	private ClassMapper classMapper;

	@Override
	public List<Class> getClasses(Class class1){
		if (class1.getPage()!=-1) {
			int start = (class1.getPage() - 1) * 5;
			class1.setPage(start);
		}
			return classMapper.getClasses(class1);
	}

	@Override
	public int getClassNumber(Class class1) {
		return classMapper.getClassNumber(class1);
	}

	@Override
	public String insClass(Class class1) {
		return classMapper.insClass(class1)==1?"OK":"NO";
	}

	@Override
	public Class getClassById(int id) {
		return classMapper.getClassById(id);
	}

	@Override
	public String updateClass(Class class1) {
		return classMapper.updateClass(class1)==1?"OK":"NO";
	}

	@Override
	public String delClass(int id) {
		return classMapper.delClass(id)==1?"OK":"NO";
	}
}
