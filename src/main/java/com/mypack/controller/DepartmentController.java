package com.mypack.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Department;
import com.mypack.service.DepartmentService;

@Controller
public class DepartmentController{
	@Resource
	private DepartmentService departmentServiceImpl;
	
	@RequestMapping("/ajax/getDepartment")
	@ResponseBody
	public List<Department> getStudent(Department department){
		return departmentServiceImpl.getDepartment(department);
    }
	
	@RequestMapping("/index/department")
	String stuHref(){
		return "/index/dep.html";
	}

	@RequestMapping("/ajax/getDepNumber")
	@ResponseBody
	public int getDepNumber(Department department){
		return departmentServiceImpl.getDepNumber(department);
	}
	
	@RequestMapping("/ajax/createDep")
	@ResponseBody
	public String createDep(Department department){
		return departmentServiceImpl.insDep(department);
    }
	
	@RequestMapping("/ajax/deleteDep")
	@ResponseBody
	public String deleteDep(int id){
		return departmentServiceImpl.delDep(id);
    }
	
	@RequestMapping("/ajax/getDepById")
	@ResponseBody
	public Department getDepById(int id){
		return departmentServiceImpl.getDepById(id);
    }
	
	@RequestMapping(value = "/ajax/updateDep",method=RequestMethod.POST)
	@ResponseBody
	public String updateDep(Department department){
		return departmentServiceImpl.updateDep(department);
    }
}
