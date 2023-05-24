package com.kakaotalk.model;

import java.util.Scanner;

public class Mainmenu {

	public void menu() {

		Scanner sc = new Scanner(System.in);

		Friend f = new Friend();
		Message m = new Message();
		User koo = new User();

		while (true) {

			if (koo.ox == true) {
				koo.signUp();
				if (koo.ing == false) {
					koo.login();
				}
			}

			else {
				System.out.print("[메인메뉴] 원하는 메뉴를 선택해 주세요" + "\n" + " 1.프로필  2.친구  3.메시지 : ");
				int menuchoice = sc.nextInt();

				if (menuchoice == 1) {
					koo.p_menu();
				} else if (menuchoice == 2) {
					
					f.f_menu();
				} else if (menuchoice == 3) {
					
					m.m_menu();
				}
			}
		}
	}
}
