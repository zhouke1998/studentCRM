package com.mypack.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Student {
	private String id ;
	private String stuName =null;
	private String stuCode =null;
	private String stuSex =null;
	private String referid =null;
	private String classid =null;
	private int page=-1;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date beginTime =null;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date jobTime=null;
	private String stuState =null;
	private String checkLevel =null;
	private String remark =null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getReferid() {
		return referid;
	}
	public void setReferid(String referid) {
		this.referid = referid;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getJobTime() {
		return jobTime;
	}
	public void setJobTime(Date jobTime) {
		this.jobTime = jobTime;
	}
	public String getStuState() {
		return stuState;
	}
	public void setStuState(String stuState) {
		this.stuState = stuState;
	}
	public String getCheckLevel() {
		return checkLevel;
	}
	public void setCheckLevel(String checkLevel) {
		this.checkLevel = checkLevel;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuCode=" + stuCode + ", stuSex=" + stuSex
				+ ", referid=" + referid + ", classid=" + classid + ", beginTime=" + beginTime + ", jobTime=" + jobTime
				+ ", stuState=" + stuState + ", checkLevel=" + checkLevel + ", remark=" + remark + "]";
	}
	
}
