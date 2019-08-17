package com.mypack.service;

import com.mypack.model.Job;

import java.util.List;

public interface JobService {
	List<Job> getJob(Job job);

	int getJobNumber(Job job);

	String insJob(Job job);

	Job getJobById(int id);
	
	String updateJob(Job job);
	
	String delJob(int id);
}
