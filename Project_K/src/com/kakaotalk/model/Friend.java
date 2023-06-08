package com.kakaotalk.model;

import java.util.Arrays;









//
//public class Friend {
//	
//	private String f_list; //[] = { "비어있음", "비어있음", "비어있음", "비어있음", "비어있음" }; //
//	private String fname; //
//	private int menuchoice; //
//	private int choice; //
//	private int add; //
//	private int add_line; //
//	private int d_line; //
//	
//	public Friend() {
//	}
//	
//	
//	public Friend(String f_list, String fname, int menuchoice, int choice, int add, int add_line, int d_line) {
//		this.f_list = f_list;
//		this.fname = fname;
//		this.menuchoice = menuchoice;
//		this.choice = choice;
//		this.add = add;
//		this.add_line = add_line;
//		this.d_line = d_line;
//	}
//	
//	
//	public String getF_list() {
//		return f_list;
//	}
//	public void setF_list(String f_list) {
//		this.f_list = f_list;
//	}
//
//
//	public String getFname() {
//		return fname;
//	}
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//
//
//	
//	public int getMenuchoice() {
//		return menuchoice;
//	}
//	public void setMenuchoice(int menuchoice) {
//		this.menuchoice = menuchoice;
//	}
//	
//
//	public int getChoice() {
//		return choice;
//	}
//	public void setChoice(int choice) {
//		this.choice = choice;
//	}
//
//	
//
//	public int getAdd() {
//		return add;
//	}
//	public void setAdd(int add) {
//		this.add = add;
//	}
//
//
//	public int getAdd_line() {
//		return add_line;
//	}
//	public void setAdd_line(int add_line) {
//		this.add_line = add_line;
//	}
//
//
//	public int getD_line() {
//		return d_line;
//	}
//	public void setD_line(int d_line) {
//		this.d_line = d_line;
//	}
//
//	
//	
//	public String toString() {
//		return "Friend [f_list=" + f_list + ", fname=" + fname + ", menuchoice=" + menuchoice
//				+ ", choice=" + choice + ", add=" + add + ", add_line=" + add_line + ", d_line=" + d_line + "]";
//	}
//
//
//	
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
//}
