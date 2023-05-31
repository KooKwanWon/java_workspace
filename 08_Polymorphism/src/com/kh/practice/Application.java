package com.kh.practice;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.*;
import com.kh.polymorphism.controller.*;
import java.util.*;

public class Application {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();

	public static void main(String[] args) {

		Application a = new Application();
		a.mainMenu();
		
	}

	public void mainMenu() {
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		lc.insertMember(name, age);
		boolean check = true;
		while (check) {
			System.out.println("=====메뉴=====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 검색하기");
			System.out.println("3. 도서 대여하기");
			System.out.println("4. 프로그램 종료하기");
			System.out.println("메뉴 번호: ");
			int select = Integer.parseInt(sc.nextLine());

			switch(select) {
			case 1 :
				System.out.println(lc.myInfo());
				break;
			case 2 :
				this.searchBook();
				break;
			case 3 :
				this.rentBook();
				break;
			case 4 :
				check = false;
				break;
				
			default : 
				System.out.println("잘못입력하셨습니다."); this.mainMenu();
			
			}
			
			
		}
	}

	public void searchBook() {

		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		System.out.println(lc.searchBook(keyword));
		
	}

	public void rentBook() {
		
		Member m = new Member();
		int i = 0;
		
		for (Book a : lc.viewBooks()) {
			System.out.println(i++ + "번째 도서 : " + a);
		}
		System.out.print("대여할 도서 번호 선택 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 0 :
			lc.rentBook(0);
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1 :
			lc.rentBook(1);
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 2 :
			if(lc.rentBook(num)==false) {
				System.out.println("나이 제한으로 대여 불가능입니다.");
			}
			else {				
			System.out.println("성공적으로 대여되었습니다.");
			}
			break;
		case 3 :
			if(lc.rentBook(num)==false) {
				System.out.println("나이 제한으로 대여 불가능입니다.");
			}
			else {				
			System.out.println("성공적으로 대여되었습니다.");
			}
			break;
			
		default : 
			System.out.println("잘못입력하셨습니다."); this.rentBook();
		}
	}
}