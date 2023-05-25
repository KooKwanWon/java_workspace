package com.kakaotalk;

import java.util.Scanner;

import com.kakaotalk.controller.FriendController;
import com.kakaotalk.model.Friend;

public class Application {

	
	public static void main(String[] args) {

		FriendController fcr = new FriendController();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("이름 : ");
		String f_list = sc.nextLine();
		
	
		System.out.print("이름 : ");
		String fname = sc.nextLine();
		
		System.out.print("맛 : ");
		int menuchoice = sc.nextInt();
		
		System.out.print("개수 : ");
		int choice = sc.nextInt();
		
		System.out.print("가격 : ");
		int add = sc.nextInt();
		
		System.out.print("가격 : ");
		int add_line = sc.nextInt();
		
		System.out.print("가격 : ");
		int d_line = sc.nextInt();
		
		
		Friend f1 = new Friend(f_list, fname, menuchoice, choice, add, add_line, d_line);
		
		if(fcr.saveData(f1)) {
		
			fcr.Sum();
		
		}
		
//		Mainmenu mm = new Mainmenu();
//		mm.menu();
	}

}