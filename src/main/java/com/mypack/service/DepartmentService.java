package com.mypack.service;

import java.util.List;
import com.mypack.model.Department;

public interface DepartmentService {
	List<Department> getDepartment(Department department);

	int getDepNumber(Department department);

	String insDep(Department department);
	
	String delDep(int id);
	
	Department getDepById(int id);
	
	String updateDep(Department department);
}
