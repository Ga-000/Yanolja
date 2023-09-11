package com.care.yanolja.member;

/*
CREATE TABLE member(
	user_name VARCHAR(20),
	user_id VARCHAR(20),
	user_pw VARCHAR(60),
	user_mobile VARCHAR(60),
	user_dob VARCHAR(60),
	user_email VARCHAR(60),
	user_snsC VARCHAR(60),
	PRIMARY KEY(user_id,user_mobile)
)CHARSET=UTF8;
*/

public class MemberDTO {
	
    private String userId;
    private String userPw;
    private String userEmail;
    private String userName;
    private String userDob;   // 생년월일
    private String userMobile;    
    private String userSnsC;
    
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserSnsC() {
		return userSnsC;
	}
	public void setUserSnsC(String userSnsC) {
		this.userSnsC = userSnsC;
	}

}
	
	