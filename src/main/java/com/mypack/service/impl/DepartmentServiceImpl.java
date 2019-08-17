package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mypack.mapper.DepartmentMapper;
import com.mypack.model.Department;
import com.mypack.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Resource
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> getDepartment(Department department){
		if (department.getPage()!=-1) {
			int start = (department.getPage() - 1) * 5;
			department.setPage(start);
		}
		return departmentMapper.getDepartment(department);
	}

	@Override
	public int getDepNumber(Department department) {
		return departmentMapper.getDepNumber(department);
	}

	@Override
	public String insDep(Department department) {
		return departmentMapper.insDep(department)==1?"OK":"NO";
	}

	@Override
	public String delDep(int id) {
		return departmentMapper.delDep(id)==1?"OK":"NO";
	}

	@Override
	public Department getDepById(int id) {
		return departmentMapper.getDepById(id);
	}

	@Override
	public String updateDep(Department department) {
		return departmentMapper.updateDep(department)==1?"OK":"NO";
	}
}
