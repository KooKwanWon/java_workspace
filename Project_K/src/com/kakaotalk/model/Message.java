package com.kakaotalk.model;

import java.util.Scanner;

public class Message {
	
	Scanner sc = new Scanner(System.in);
			
	public String checked_Msg;
	public String unchecked_Msg;
	public String send_Msg;
	public String delete_Msg;
//	public Date time_Msg;
	
	public void m_menu() {

		System.out.print("[메시지] 원하는 메뉴를 선택해 주세요" + "\n" + "1.메시지 보내기 2.받은메시지 목록  3.보낸메시지 목록  4.메시지 삭제 : ");
		int mmenuchoice = sc.nextInt();

		if (mmenuchoice == 1) {
			sendM();
		}
	}

	
	
	
	
	public void sendM() {
				
		System.out.print("[메시지] 보낼 대상 선택");
		String sendf = sc.nextLine();
		
		System.out.print("1.메뉴로 나가기 : ");
		int mchoice = sc.nextInt();
//
//		if (mchoice == 1) {
//			m_menu();
//		}
		
	}
	
	
}