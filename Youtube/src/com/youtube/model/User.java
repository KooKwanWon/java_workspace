package com.youtube.model;

public class User {

	private String email;
	private String phone ;
	private String id ;
	private String pwd ;
	private String nickName ;
	private char gender;
	
	public User() {}

	public User(String email, String phone, String id, String pwd, String nickName, char gender) {
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.pwd = pwd;
		this.nickName = nickName;
		this.gender = gender;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}


	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", pwd=" + pwd + ", nickName=" + nickName
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	
	// 로그인
//	Create (생성): 데이터베이스에 새로운 데이터를 만들거나 추가합니다.     //회원가입

//	Read   (읽기): 데이터베이스에서 데이터를 조회하고 읽습니다.          //프로필보기

//	Update (갱신): 데이터베이스에 저장된 데이터를 업데이트하거나 수정합니다. //프로필수정

//	Delete (삭제): 데이터베이스에서 데이터를 삭제합니다.               //계정삭제
	
	

	
}
