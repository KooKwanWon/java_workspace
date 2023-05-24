package com.youtube.model;

public class User {

	public String email = "rksjsl@naver.com";
	public String phone = "01026795094";
	public String id = "rksjsl";
	public String pwd = "1234";
	public String nickName = "가넌";
	public char gender = 'M';
	
	// 로그인
//	Create (생성): 데이터베이스에 새로운 데이터를 만들거나 추가합니다.     //회원가입

//	Read   (읽기): 데이터베이스에서 데이터를 조회하고 읽습니다.          //프로필보기

//	Update (갱신): 데이터베이스에 저장된 데이터를 업데이트하거나 수정합니다. //프로필수정

//	Delete (삭제): 데이터베이스에서 데이터를 삭제합니다.               //계정삭제
	public boolean login(){
		
		return false;
	}
		
	public boolean signUp(){
		
		return false;
	}
	
	public void viewProfile(){}

	public void updateProfile(){}
	
	public void deleteProfile(){}
	
	

	
}
