package com.kakaotalk.model;

import java.util.Scanner;

public class Message {

	Scanner sc = new Scanner(System.in);

	public String checked_Msg;
	public String unchecked_Msg;
	public String send_Msg[] = { " 비어있음", " 비어있음", " 비어있음", " 비어있음", " 비어있음" };
	public String delete_Msg;
	public String send1;

//	public Date time_Msg;

	public void m_menu() {

		System.out.print("[메시지] 원하는 메뉴를 선택해 주세요" + "\n" + "1.메시지 보내기  2.보낸메시지 목록  3.메시지 삭제 : ");
		int mmenuchoice = sc.nextInt();
		sc.nextLine();

		if (mmenuchoice == 1) {
			m_send();
		} else if (mmenuchoice == 2) {
			viewsended();
		} else if (mmenuchoice == 3) {
			delete();
		}
	}

	public void m_send() {

		System.out.print("[메시지] 메시지 보낼 친구 이름 :  ");
		String schoice = sc.nextLine();

		System.out.print("[메시지] 메시지 입력 :  ");
		String smessage = sc.nextLine();

		send1 = " " + schoice + " : " + smessage;
		System.out.println(send1);

		sendsave();
	}

	public void delete() {
		for (int i = 0; i < send_Msg.length; i++) {
			System.out.println(send_Msg[i]);
		}

		System.out.print("[보낸 메시지 삭제] 몇 번째 줄을 삭제 하시겠습니까? (1~5): ");
		int fline = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < (send_Msg.length - fline); i++) {			
			send_Msg[(fline - 1 + i)] = send_Msg[(fline + i)];
		}
		send_Msg[4] = " 비어있음";
		
		System.out.println(" 삭제 완료");
		
	}

	public void viewsended() {
		for (String i : send_Msg) {
			System.out.println(i);
			}
	}
	
	public void sendsave() {

		for (int i = 0; i < send_Msg.length; i++) {

			if (send_Msg[i] == " 비어있음") {
				send_Msg[i] = send1;
				break;
			}
		}
	}
}