package com.mypack.controller;

import com.mypack.model.Class;
import com.mypack.model.JobCompany;
import com.mypack.service.JobCompanyService;
import com.mypack.tools.TraDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

@Controller
public class JobCompanyController {
	@Resource
	private JobCompanyService jobCompanyServiceImpl;
	
	@RequestMapping("/ajax/getJCompany")
	@ResponseBody
	public List<JobCompany> getAllJCompany(JobCompany jobCompany){
		return jobCompanyServiceImpl.getJCompany(jobCompany);
    }
	
	@RequestMapping("/index/JCompany")
	public String jCompanyHref(){
		return "/index/jo_bCompany.html";
	}

	@RequestMapping("/ajax/getJCompanyNumber")
	@ResponseBody
	public int getJCompany(JobCompany jobCompany){
		return jobCompanyServiceImpl.getJCompanyNumber(jobCompany);
	}
	
	@RequestMapping(value = "/ajax/createJCompany",method=RequestMethod.POST)
	@ResponseBody
	public String createJCompany(JobCompany jobCompany){
		return jobCompanyServiceImpl.insJCompany(jobCompany);
	}
	
	@RequestMapping(value = "/ajax/getcrmJCompanyById",method=RequestMethod.GET)
	@ResponseBody
	public JobCompany getcrmJCompanyById(int id){
		return jobCompanyServiceImpl.getJCompanyById(id);
	}
	
	@RequestMapping(value = "/ajax/updateJCompany",method=RequestMethod.POST)
	@ResponseBody
	public String updateJobCompany(JobCompany jobCompany){
		return jobCompanyServiceImpl.updateJCompany(jobCompany);
	}
	
	@RequestMapping(value = "/ajax/deleteJCompany",method=RequestMethod.POST)
	@ResponseBody
	public String deleteJCompany(int id){
		return jobCompanyServiceImpl.delJCompany(id);
	}
}
