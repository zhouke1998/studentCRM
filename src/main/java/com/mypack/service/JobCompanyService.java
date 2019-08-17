package com.mypack.service;

import com.mypack.model.JobCompany;

import java.util.List;

public interface JobCompanyService {
	List<JobCompany> getJCompany(JobCompany jobCompany);

	int getJCompanyNumber(JobCompany jobCompany);

	String insJCompany(JobCompany jobCompany);

	JobCompany getJCompanyById(int id);
	
	String updateJCompany(JobCompany jobCompany);
	
	String delJCompany(int id);
}
