package com.mypack.model;

public class Refer {
	private String id ;
	private String source ;
	private String userid ;
	private String staffName ;
	private String username ;
	private String gender ;
	private String address ;
	private String email ;
	private String idcard;
	private String phone;
	private String weixin;
	private String qq;
	private String shopGood;
	private String rstate;
	private String isJob;
	private String byAcademy;
	private String resourceLevel;
	private String remark;
	private int page=-1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getShopGood() {
		return shopGood;
	}
	public void setShopGood(String shopGood) {
		this.shopGood = shopGood;
	}
	public String getRstate() {
		return rstate;
	}
	public void setRstate(String rstate) {
		this.rstate = rstate;
	}
	public String getIsJob() {
		return isJob;
	}
	public void setIsJob(String isJob) {
		this.isJob = isJob;
	}
	public String getByAcademy() {
		return byAcademy;
	}
	public void setByAcademy(String byAcademy) {
		this.byAcademy = byAcademy;
	}
	public String getResourceLevel() {
		return resourceLevel;
	}
	public void setResourceLevel(String resourceLevel) {
		this.resourceLevel = resourceLevel;
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
		return "Refer{" +
				"id='" + id + '\'' +
				", source='" + source + '\'' +
				", userid='" + userid + '\'' +
				", staffName='" + staffName + '\'' +
				", username='" + username + '\'' +
				", gender='" + gender + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", idcard='" + idcard + '\'' +
				", phone='" + phone + '\'' +
				", weixin='" + weixin + '\'' +
				", qq='" + qq + '\'' +
				", shopGood='" + shopGood + '\'' +
				", rstate='" + rstate + '\'' +
				", isJob='" + isJob + '\'' +
				", byAcademy='" + byAcademy + '\'' +
				", resourceLevel='" + resourceLevel + '\'' +
				", remark='" + remark + '\'' +
				", page=" + page +
				'}';
	}
}
