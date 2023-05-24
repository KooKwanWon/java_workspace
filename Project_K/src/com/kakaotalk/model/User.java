package com.kakaotalk.model;

import java.util.Scanner;

public class User {
	
	Scanner sc = new Scanner(System.in);
		
	public String nickName ;
	public String password ;
	public String profileMsg ;
	public String email ;
	public String phone ;
	public String img = "[프로필 사진]";
	
	public String deletecheck ="삭제하겠습니다";
	public boolean ing = false;
	public boolean ox = true;
	

	public void signUp() {

		System.out.print("[회원가입] ID 입력 : ");
		String n_email = sc.nextLine();
		email = n_email;

		System.out.print("[회원가입] 비밀번호 입력 : ");
		String n_password = sc.nextLine();
		password = n_password;

		System.out.print("[회원가입] 전화번호 입력(-없이 입력) : ");
		String n_phone = sc.nextLine();
		phone = n_phone;

		System.out.print("[회원가입] 프로필 사진 등록 : ");
		String n_img = sc.nextLine();
		img = n_img;
		
		System.out.print("[회원가입] 닉네임 등록 : ");
		String n_nickName = sc.nextLine();
		nickName = n_nickName;

		System.out.print("[회원가입] 상태메시지 등록 : ");
		String n_profileMsg = sc.nextLine();
		profileMsg = n_profileMsg;
		
		System.out.println(" 회원가입이 완료되었습니다. 로그인 해주세요.");

	}

	public void login() {

		while (ox) {

			if (ing == false) {
				System.out.print("[로그인] ID : ");
				String a = sc.nextLine();

				if (a.equals(email)) {
					System.out.print("[로그인] 비밀번호 : ");
					String b = sc.nextLine();

					if (b.equals(password)) {
						System.out.println(" 로그인 되었습니다.");
						ing = true;
						viewProfile();
						ox = false;
					} else
						System.out.println(" 비밀번호가 잘못되었습니다.");
				} else
					System.out.println(" ID가 잘못되었습니다.");
			}
		}
	}

	public void p_menu() {
		System.out.print("[내 프로필] 원하는 메뉴를 선택해 주세요" + "\n" + "1.프로필  2.프로필 설정 : ");
		int pmenuchoice = sc.nextInt();
		
		if (pmenuchoice == 1) {
			
			viewProfile();

		} else if (pmenuchoice == 2) {
			settings();

		} 
		
	}
	
	public void viewProfile() {
		if (ing == true) {
			System.out.println("========== 내 프로필 ==========");
			System.out.print("[" + img + "] ");
			System.out.print("[" + nickName + "] ");
			System.out.println("[상태메시지 : " + profileMsg + "]");
			System.out.println("============================");
			
			System.out.print(" 1.프로필 설정 2.메인메뉴로 가기 : ");
			int pchoice = sc.nextInt();

			if (pchoice == 1) {
				settings();
			}

		} else
			login();
	}

	
	public void settings() {

			System.out.print("[프로필 설정] 1.프로필사진 변경  2.닉네임 변경  3.상태메시지 변경  4.계정삭제 : ");
			int choice_s = sc.nextInt();
			sc.nextLine();
			
			if (choice_s == 1) {
				System.out.print("변경할 사진을 등록해주세요 : ");
				String c_img = sc.nextLine();
				img = c_img;

			} else if (choice_s == 2) {
				System.out.print("변경할 닉네임을 입력해주세요 : ");
				String c_nickName = sc.nextLine();
				nickName = c_nickName;

			} else if (choice_s == 3) {
				System.out.print("변경할 상태메시지를 입력해주세요 : ");
				String c_profileMsg = sc.nextLine();
				profileMsg = c_profileMsg;
			
			} else if (choice_s == 4) {
				deleteProfile();
			}
			
			viewProfile();
	}

	public void deleteProfile() {
		
		System.out.print("정말로 계정을 삭제하시겠습니까?"+"\n"+ "삭제를 원하시면 '삭제하겠습니다'를 작성하세요 : ");
		String delete = sc.nextLine();
		
			if(delete.equals(deletecheck)) {
				System.out.println("계정이 삭제되었습니다.");
				System.out.println("회원가입을 새로 해주세요.");
				ing = false;
				signUp();
			}
			else
				settings();
	}
	
}