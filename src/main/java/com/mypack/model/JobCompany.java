package com.mypack.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class JobCompany {
	private String id ;
	private String companyName ;
	private String comCode ;
	private String address ;
	private String linkman ;
	private String telephone ;
	private String quarters ;
	private String emolument;
	private String state;
	private String remark;
	private int page=-1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getQuarters() {
		return quarters;
	}

	public void setQuarters(String quarters) {
		this.quarters = quarters;
	}

	public String getEmolument() {
		return emolument;
	}

	public void setEmolument(String emolument) {
		this.emolument = emolument;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
		return "JobCompany{" +
				"id='" + id + '\'' +
				", companyName='" + companyName + '\'' +
				", comCode='" + comCode + '\'' +
				", address='" + address + '\'' +
				", linkman='" + linkman + '\'' +
				", telephone='" + telephone + '\'' +
				", quarters='" + quarters + '\'' +
				", emolument='" + emolument + '\'' +
				", state='" + state + '\'' +
				", remark='" + remark + '\'' +
				", page=" + page +
				'}';
	}
}
