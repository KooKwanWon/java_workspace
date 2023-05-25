package com.kakaotalk.controller;

import com.kakaotalk.model.Friend;


public class FriendController {

	private Friend f = new Friend();
	
	public FriendController() {}
	
	public boolean saveData(Friend f) {
		
		this.f.setF_list(f.getF_list());
		this.f.setFname(f.getFname());
		this.f.setMenuchoice(f.getMenuchoice());
		this.f.setChoice(f.getChoice());
		this.f.setAdd(f.getAdd());
		this.f.setAdd_line(f.getAdd_line());
		this.f.setD_line(f.getD_line());
		
		return true;
	}
	
	public Friend confirmData() {
	
		return this.f;
	}
	
	public void Sum() {
		
		System.out.println(f.getF_list() + f.getFname());
	}
//	
//	public void f_menu() {
//
//		System.out.print("[친구] 원하는 메뉴를 선택해 주세요" + "\n" + " 1.친구목록  2.친구관리  3.전체 메뉴로 가기 : ");
//		int menuchoice = sc.nextInt();
//
//		if (menuchoice == 1) {
//			f_view();
//		}
//
//		else if (menuchoice == 2) {
//			f_settings();
//
//		}
//	
//	}
//
//	public void f_view() {
//
//		for (int i = 0; i < f_list.length; i++) {
//			System.out.println(f_list[i]);
//		}
//
//		System.out.print(" 1.친구관리  2.나가기 : ");
//		int choice = sc.nextInt();
//
//		if (choice == 1) {
//			f_settings();
//		} else {
//
//		}
//
//	}
//
//	public void f_settings() {
//		System.out.print("[친구관리] 1.친구 추가  2.친구 삭제 : ");
//		int add = sc.nextInt();
//
//		if (add == 1) {
//			f_add();
//			
//		}
//		else if (add == 2) {
//			f_delete();
//		}
//	}
//	
//	
//	
//	public void f_add() {
//		for (int i = 0; i < f_list.length; i++) {
//			System.out.println(f_list[i]);
//		}
//
//		System.out.print("[친구 추가] 몇 번째 줄에 추가 하시겠습니까? (1~5): ");
//		int add_line = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("[친구 추가] 추가할 친구 이름을 작성해주세요 : ");
//		String fname = sc.nextLine();
//		
//		if(0 < add_line && 6 > add_line) {
//			f_list[(add_line - 1)] = fname;
//			System.out.println("[추가 완료]");
//		}
//		else {
//			System.out.println(" 입력값이 잘못되었습니다. ");
//		}
//							 
//	}
//	
//	public void f_delete() {
//
//		for (int i = 0; i < f_list.length; i++) {
//			System.out.println(f_list[i]);
//		}
//
//		System.out.print("[친구 삭제] 몇 번째 줄을 삭제 하시겠습니까? (1~5): ");
//		int d_line = sc.nextInt();
//		sc.nextLine();
//		
//		f_list[(d_line - 1)] = "비어있음";
//		
//		System.out.println("[삭제 완료]");
//	}
//	

	
}
