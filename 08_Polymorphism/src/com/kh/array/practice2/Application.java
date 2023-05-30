package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {

	static Scanner sc = new Scanner(System.in);

	static MemberController mc = new MemberController();

	static Member m = new Member();

	public static void main(String[] args) {
		Application a = new Application();

		a.mainMenu();
	}

	public void mainMenu() {

		System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
		System.out.println("현재 등록된 회원 수는 " + mc.count + "명입니다.");
		if (mc.count < 3) {

			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			int m = Integer.parseInt(sc.nextLine());

			switch (m) {

			case 1:
				insertMember();
				break;
			case 2:
				updateMember();
				break;
			case 3:
				printAll();
				break;
			case 9:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		} else {
			System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			int n = Integer.parseInt(sc.nextLine());

			switch (n) {

			case 2:
				updateMember();
				break;
			case 3:
				printAll();
				break;
			case 9:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void insertMember() {

		System.out.print("아이디 : ");
		String a = sc.nextLine();

		if (mc.checkid(a) != -1) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();

		} else {

			System.out.print("이름 : ");
			String b = sc.nextLine();

			System.out.print("비밀번호 : ");
			String c = sc.nextLine();

			System.out.print("이메일 : ");
			String d = sc.nextLine();

			System.out.print("성별(M/F) : ");
			char e = sc.nextLine().charAt(0);

			System.out.print("나이 : ");
			int f = Integer.parseInt(sc.nextLine());

			Member m = new Member(a, b, c, d, e, f);
			mc.insertMember(m);
		}

		mainMenu();
	}

	public void updateMember() {

		System.out.print("수정할 회원의 아이디 : ");
		String a = sc.nextLine();

		if (mc.checkid(a) != -1) {
			System.out.print("수정할 이름 : ");
			String b = sc.nextLine();

			System.out.print("수정할 이메일 : ");
			String d = sc.nextLine();

			System.out.print("수정할 비밀번호 : ");
			String c = sc.nextLine();
			
			mc.updateMember(a, b, c, d);
		}

		else {
			System.out.println("회원 정보가 없습니다..");
		}
		
		mainMenu();
	}

	public void printAll() {

		Member[] mArr = mc.printAll();
//		for (Member m : mArr) {
//			if (m != null)
//				System.out.println(m);
//		}
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i] != null)
				System.out.println(mArr[i]);
		}
		mainMenu();
	}

}
