package com.mypack.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Job {
	private String id ;
	private String stuCode ;
	private String stuName ;
	private String gender ;
	private String classid ;
	private String className;
	private String jobcomId ;
	private String companyName;
	private String location ;
	private String activeCode;
	private String jobState;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date jobTime;
	private String remark;
	private int page=-1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStuCode() {
		return stuCode;
	}

	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getJobcomId() {
		return jobcomId;
	}

	public void setJobcomId(String jobcomId) {
		this.jobcomId = jobcomId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getJobState() {
		return jobState;
	}

	public void setJobState(String jobState) {
		this.jobState = jobState;
	}

	public Date getJobTime() {
		return jobTime;
	}

	public void setJobTime(Date jobTime) {
		this.jobTime = jobTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Job{" +
				"id='" + id + '\'' +
				", stuCode='" + stuCode + '\'' +
				", stuName='" + stuName + '\'' +
				", gender='" + gender + '\'' +
				", classid='" + classid + '\'' +
				", className='" + className + '\'' +
				", jobcomId='" + jobcomId + '\'' +
				", companyName='" + companyName + '\'' +
				", location='" + location + '\'' +
				", activeCode='" + activeCode + '\'' +
				", jobState='" + jobState + '\'' +
				", jobTime=" + jobTime +
				", remark='" + remark + '\'' +
				", page=" + page +
				'}';
	}
}
