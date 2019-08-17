package com.mypack.controller;

import com.mypack.model.Class;
import com.mypack.model.Job;
import com.mypack.service.ClassService;
import com.mypack.service.JobService;
import com.mypack.tools.TraDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

@Controller
public class JobController {
	@Resource
	private JobService jobServiceImpl;
	
	@RequestMapping("/ajax/getJobs")
	@ResponseBody
	public List<Job> getAllJob(Job job){
		return jobServiceImpl.getJob(job);
    }
	
	@RequestMapping("/index/stuJob")
	public String stuHref(){
		return "/index/jo_b.html";
	}

	@RequestMapping("/ajax/getJobNumber")
	@ResponseBody
	public int getJobNumber(Job job){
		return jobServiceImpl.getJobNumber(job);
	}
	
	@RequestMapping(value = "/ajax/createJob",method=RequestMethod.POST)
	@ResponseBody
	public String createJob(Job job,String jobTime2){
		try {
			job.setJobTime(TraDate.traDate(jobTime2));
		} catch (ParseException e) {
			return "NO";
		}
		return jobServiceImpl.insJob(job);
	}
	
	@RequestMapping(value = "/ajax/getcrmjobById",method=RequestMethod.GET)
	@ResponseBody
	public Job getcrmjobById(int id){
		return jobServiceImpl.getJobById(id);
	}
	
	@RequestMapping(value = "/ajax/updateJob",method=RequestMethod.POST)
	@ResponseBody
	public String updateJob(Job job,String jobTime2){
		try {
			job.setJobTime(TraDate.traDate(jobTime2));
		} catch (ParseException e) {
			return "NO";
		}
		return jobServiceImpl.updateJob(job);
	}
	
	@RequestMapping(value = "/ajax/deleteJob",method=RequestMethod.POST)
	@ResponseBody
	public String deleteJob(int id){
		return jobServiceImpl.delJob(id);
	}
}
