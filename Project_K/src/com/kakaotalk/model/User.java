package com.kakaotalk.model;

import java.util.Scanner;

public class User {
	
	Scanner sc = new Scanner(System.in);
	
	public String nickName = "관원";
	public String password = "1234";
	public String profileMsg = "안녕?";
	public String mutiProfile = "";
	public String email = "rksjsl@nate.com";
	public String phone = "01026795094";
	public String birthday ="920201";
	public String img ="";
	public boolean ing = false;
	
	
    public void login(){
    	
    	if(ing == false) {
    		System.out.print("로그인 email : ");
    		String a = sc.nextLine();
    		
    		if(a.equals(email)) {
    			System.out.print("로그인 비밀번호 : ");
        		String b = sc.nextLine();
        		
        		if(b.equals(password)) {
        			System.out.println("로그인 되었습니다.");
        			ing = true;
        			System.out.print(nickName + " ");
        			System.out.println(profileMsg);
        		}
        		else
            		System.out.println("비밀번호가 잘못되었습니다.");	
    		}
    		else
        		System.out.println("email이 잘못되었습니다.");		
    	}
    	
    	
    }
	
	public void signUp(){}
	
	public void viewProfile(){
		
		System.out.print(nickName + " ");
		System.out.println(profileMsg);
	}

	public void updateProfile(){}
	
	public void deleteProfile(){}
	
		
}
