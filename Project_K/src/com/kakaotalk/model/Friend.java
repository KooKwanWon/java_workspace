package com.kakaotalk.model;

import java.util.Scanner;

public class Friend {

	Scanner sc = new Scanner(System.in);

	public String f_list[] = { "비어있음", "비어있음", "비어있음", "비어있음", "비어있음" };
	public String f_nickName;
	public String f_profile_Msg;
	public String f_phone;
	public String f_birthday;
	public String f_music;
	public String f_img;
	public String f_delete;
	public String f_account;

	public void f_menu() {

		System.out.print("[친구] 원하는 메뉴를 선택해 주세요" + "\n" + " 1.친구목록  2.친구관리  3.전체 메뉴로 가기 : ");
		int fmenuchoice = sc.nextInt();

		if (fmenuchoice == 1) {
			f_view();
		}

		else if (fmenuchoice == 2) {
			f_settings();

		}

		else if (fmenuchoice == 4) {

		}
	}

	public void f_view() {

		for (int i = 0; i < f_list.length; i++) {
			System.out.println(f_list[i]);
		}

		System.out.print(" 1.친구관리  2.나가기 : ");
		int fchoice = sc.nextInt();

		if (fchoice == 1) {
			f_settings();
		} else {

		}

	}

	public void f_settings() {
		System.out.print("[친구관리] 1.친구 추가  2.친구 삭제 : ");
		int fadd = sc.nextInt();

		if (fadd == 1) {
			f_add();
			
		}
		else if (fadd == 2) {
			f_delete();
		}
	}
	
	public void f_add() {
		for (int i = 0; i < f_list.length; i++) {
			System.out.println(f_list[i]);
		}

		System.out.print("[친구 추가] 몇 번째 줄에 추가 하시겠습니까? (1~5): ");
		int fline = sc.nextInt();
		sc.nextLine();

		System.out.print("[친구 추가] 추가할 친구 이름을 작성해주세요 : ");
		String fname = sc.nextLine();
		
		if(0 < fline && 6 > fline) {
			f_list[(fline - 1)] = fname;
			System.out.println("[추가 완료]");
		}
		else {
			System.out.println(" 입력값이 잘못되었습니다. ");
		}
							 
	}
	
	public void f_delete() {

		for (int i = 0; i < f_list.length; i++) {
			System.out.println(f_list[i]);
		}

		System.out.print("[친구 삭제] 몇 번째 줄을 삭제 하시겠습니까? (1~5): ");
		int fline = sc.nextInt();
		sc.nextLine();
		
		f_list[(fline - 1)] = "비어있음";
		
		System.out.println("[삭제 완료]");
	}
}
