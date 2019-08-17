package com.mypack.model;

public class Department {
	private String id ;
	private String depName =null;
	private String isCancel =null;
	private int page=-1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getIsCancel() {
		return isCancel;
	}
	public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + ", isCancel=" + isCancel + "]";
	}
}
