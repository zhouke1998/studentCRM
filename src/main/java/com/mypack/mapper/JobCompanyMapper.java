package com.mypack.mapper;

import com.mypack.model.Job;
import com.mypack.model.JobCompany;

import java.util.List;

public interface JobCompanyMapper {
	List<JobCompany> getJCompany(JobCompany jobCompany);

	int getJCompanyNumber(JobCompany jobCompany);

	int insJCompany(JobCompany jobCompany);

	JobCompany getJCompanyById(int id);

	int updateJCompany(JobCompany jobCompany);

	int delJCompany(int id);
}
