package com.mypack.service.impl;

import com.mypack.mapper.ClassMapper;
import com.mypack.mapper.JobCompanyMapper;
import com.mypack.model.Class;
import com.mypack.model.Job;
import com.mypack.model.JobCompany;
import com.mypack.service.JobCompanyService;
import com.mypack.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobCompanyServiceImpl implements JobCompanyService {
	@Resource
	private JobCompanyMapper jobCompanyMapper;

	@Override
	public List<JobCompany> getJCompany(JobCompany jobCompany){
		if (jobCompany.getPage()!=-1) {
			int start = (jobCompany.getPage() - 1) * 5;
			jobCompany.setPage(start);
		}
			return jobCompanyMapper.getJCompany(jobCompany);
	}

	@Override
	public int getJCompanyNumber(JobCompany jobCompany) {
		return jobCompanyMapper.getJCompanyNumber(jobCompany);
	}

	@Override
	public String insJCompany(JobCompany jobCompany) {
		return jobCompanyMapper.insJCompany(jobCompany)==1?"OK":"NO";
	}

	@Override
	public JobCompany getJCompanyById(int id) {
		return jobCompanyMapper.getJCompanyById(id);
	}

	@Override
	public String updateJCompany(JobCompany jobCompany) {
		return jobCompanyMapper.updateJCompany(jobCompany)==1?"OK":"NO";
	}

	@Override
	public String delJCompany(int id) {
		return jobCompanyMapper.delJCompany(id)==1?"OK":"NO";
	}
}
