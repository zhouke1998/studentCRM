package com.mypack.service.impl;

import com.mypack.mapper.JobMapper;
import com.mypack.model.Job;
import com.mypack.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
	@Resource
	private JobMapper jobMapper;

	@Override
	public List<Job> getJob(Job job){
		if (job.getPage()!=-1) {
			int start = (job.getPage() - 1) * 5;
			job.setPage(start);
		}
			return jobMapper.getJob(job);
	}

	@Override
	public int getJobNumber(Job job) {
		return jobMapper.getJobNumber(job);
	}

	@Override
	public String insJob(Job job) {
		return jobMapper.insJob(job)==1?"OK":"NO";
	}

	@Override
	public Job getJobById(int id) {
		return jobMapper.getJobById(id);
	}

	@Override
	public String updateJob(Job job) {
		return jobMapper.updateJob(job)==1?"OK":"NO";
	}

	@Override
	public String delJob(int id) {
		return jobMapper.delJob(id)==1?"OK":"NO";
	}
}
