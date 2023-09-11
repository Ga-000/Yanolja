package com.care.yanolja.admin;

/*
CREATE TABLE admin(
	admin_location VARCHAR(60),
	region VARCHAR(50),
  	admin_pw VARCHAR(60),
  	business_number VARCHAR(60),
  	admin_mobile VARCHAR(20),
  	admin_id VARCHAR(20),
  	admin_name`VARCHAR(20),
  	PRIMARY KEY (admin_location,region,business_number,admin_mobile,admin_id)
) CHARSET=UTF8;
*/

public class AdminDTO {
	private String adminId;
	private String adminPw;
	private String adminLocation;
	private String region;
	private String businessNumber;
	private String adminMobile;	
	private String adminName;
	
	public String getAdminLocation() {
		return adminLocation;
	}
	public void setAdminLocation(String adminLocation) {
		this.adminLocation = adminLocation;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getAdminMobile() {
		return adminMobile;
	}
	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
}
