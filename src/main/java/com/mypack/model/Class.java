package com.mypack.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Class {
	private String id ;
	private String staffCode ;
	private String className ;
	private String cstate ;
	private String totalCount ;
	private String goCount ;
	private String leaveCount ;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date beginTime ;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	private String lessonTypeId;
	private String teacherid;
	private String userid;
	private String uploadFileName;
	private String uploadPath;
	private String remark;
	private String lessonName;
	private int page=-1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getGoCount() {
		return goCount;
	}
	public void setGoCount(String goCount) {
		this.goCount = goCount;
	}
	public String getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(String leaveCount) {
		this.leaveCount = leaveCount;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getLessonTypeId() {
		return lessonTypeId;
	}
	public void setLessonTypeId(String lessonTypeId) {
		this.lessonTypeId = lessonTypeId;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getRemark() {
		return remark;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", staffCode=" + staffCode + ", className=" + className + ", cstate=" + cstate
				+ ", totalCount=" + totalCount + ", goCount=" + goCount + ", leaveCount=" + leaveCount + ", beginTime="
				+ beginTime + ", endTime=" + endTime + ", lessonTypeId=" + lessonTypeId + ", teacherid=" + teacherid
				+ ", userid=" + userid + ", uploadFileName=" + uploadFileName + ", uploadPath=" + uploadPath
				+ ", remark=" + remark + ", lessonName=" + lessonName + "]";
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	
}
