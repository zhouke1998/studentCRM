package com.mypack.mapper;

import com.mypack.model.Job;

import java.util.List;

public interface JobMapper {
	List<Job> getJob(Job job);

	int getJobNumber(Job job);

	int insJob(Job job);

	Job getJobById(int id);
	
	int updateJob(Job job);
	
	int delJob(int id);
}
