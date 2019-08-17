package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Department;

public interface DepartmentMapper {
	List<Department> getDepartment(Department department);

	int getDepNumber(Department department);

	Department getDepById(int id);
	
	int insDep(Department department);
	
	int delDep(int id);
	
	int updateDep(Department department);
}
