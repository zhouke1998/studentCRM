package com.mypack.model;

public class Lesson {
	private String id ;
	private String lessonName ;
	private String lessoncost ;
	private String totalTime ;
	private String remark ;
	private int page=-1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getLessoncost() {
		return lessoncost;
	}
	public void setLessoncost(String lessoncost) {
		this.lessoncost = lessoncost;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
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
		return "Lesson [id=" + id + ", lessonName=" + lessonName + ", lessoncost=" + lessoncost + ", totalTime="
				+ totalTime + ", remark=" + remark + "]";
	}
	
}
