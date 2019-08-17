package com.mypack.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Staff {
	private String staffID ;
	private String staffCode ;
	private String loginName ;
	private String loginPwd ;
	private String staffName ;
	private String gender ;
	private String email ;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date birthday ;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date onDutyDate;
	private String postID;
	private String postName;
	private String state;
	private int page=-1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getStaffID() {
		return staffID;
	}
	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getOnDutyDate() {
		return onDutyDate;
	}
	public void setOnDutyDate(Date onDutyDate) {
		this.onDutyDate = onDutyDate;
	}
	public String getPostID() {
		return postID;
	}
	public void setPostID(String postID) {
		this.postID = postID;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Staff{" +
				"staffID='" + staffID + '\'' +
				", staffCode='" + staffCode + '\'' +
				", loginName='" + loginName + '\'' +
				", loginPwd='" + loginPwd + '\'' +
				", staffName='" + staffName + '\'' +
				", gender='" + gender + '\'' +
				", email='" + email + '\'' +
				", birthday=" + birthday +
				", onDutyDate=" + onDutyDate +
				", postID='" + postID + '\'' +
				", postName='" + postName + '\'' +
				", state='" + state + '\'' +
				", page=" + page +
				'}';
	}
}
