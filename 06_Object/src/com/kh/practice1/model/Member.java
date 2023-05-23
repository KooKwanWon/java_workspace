package com.kh.practice1.model;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	
	public String memberId = "rksjsl";
	public String memberPwd = "1234";
	public String memberName = "구관원";
	public int age = 32;
	public char gender = 'M';
	public String phone = "01026795094";
	public String email = "rksjsl@naver.com";
	
	public void changeName(String newName) {
		memberName = newName;
	}
	
	public void printName() {
		System.out.println("변경된 이름은 : " + memberName);
	}
}
