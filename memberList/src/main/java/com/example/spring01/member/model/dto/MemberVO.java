package com.example.spring01.member.model.dto;

import java.sql.Date;

public class MemberVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private Date userRegdate; //java.sql.Date
	private Date userUpdatedate;
	
	//Getter/Setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String UserPw) {
		this.userPw = UserPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String UserName) {
		this.userName = UserName;
	}
	public String getuserEmail() {
		return userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getuserRegdate() {
		return userRegdate;
	}
	public void setuserRegdate(Date userRegdate) {
		this.userRegdate = userRegdate;
	}
	public Date getuserUpdatedate() {
		return userUpdatedate;
	}
	public void setuserUpdatedate(Date userUpdatedate) {
		this.userUpdatedate = userUpdatedate;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ",userPw" + userPw + ",userName=" +  userName + ",userEmail="
				+ userEmail + ",userRegdate=" + userRegdate + ",userUpdatedate=" + userUpdatedate + "]";
	}
}
