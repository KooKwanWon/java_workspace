package com.kakaotalk;

import java.util.Scanner;

import com.kakaotalk.controller.FriendController;
import com.kakaotalk.controller.UserController;
import com.kakaotalk.model.Friend;
import com.kakaotalk.model.User;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private UserController uc = new UserController();
	private FriendController fc = new FriendController();
	
	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		System.out.println("======== 카카오톡 ========");

		boolean check = true;
		while (check) {
			System.out.println("------- 메인 메뉴 -------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 아이디 목록");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				break;
			case 3:
//				System.out.println(fc.addFriendList(uc.idList()));
				break;
			case 9:
				check = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public void joinMembership() {

		/*
		 * 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은 Member 객체에 담고 id와 객체는
		 * MemberController(mc)의 joinMembership()로 보냄
		 * 
		 * 받은 결과에 따라 true면 "성공적으로 회원가입 완료하였습니다." false면 "중복된 아이디입니다. 다시 입력해주세요." 출력
		 * 
		 */
		System.out.print("[회원가입] 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("[회원가입] 비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("[회원가입] 닉네임 : ");
		String nickname = sc.nextLine();
		
		System.out.print("[회원가입] e-mail : ");
		String email = sc.nextLine();
//		
//		System.out.print("[회원가입] 프로필 사진 : ");
//		String img = sc.nextLine();
//						
//		System.out.print("[회원가입] 상태메시지 : ");
//		String profileMsg = sc.nextLine();		
		
		User u = new User();
		Friend f = new Friend();
		
		u.setPassword(password);
		u.setNickName(nickname);
		u.setEmail(email);		
		
		f.setNickName(nickname);
			
		fc.addFriendList(id, f);
		

		if (uc.joinMembership(id, u) == true) {
			System.out.println("성공적으로 회원가입을 완료하였습니다.");
			login();
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			joinMembership();
		}

	}

	public void login() {

		/*
		 * 아이디와 비밀번호를 사용자에게 받아 mc의 login() 메서드로 넘겨 줌 반환 값 있으면 "OOO님, 환영합니다!" 출력 후 로그인 된
		 * 화면으로(memberMenu()) 없으면 "틀란 아이디 또는 비밀번호입니다. 다시 입력해주세요." 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		uc.login(id, password);
		fc.viewFriendList(id);

		System.out.println(uc.login(id, password) + " 님, 로그인 완료");
		viewProfile(id);
		memberMenu(id);
	}

	public void memberMenu(String id) {
		boolean check = true;
		while (check) {
			System.out.println("------- 회원 메뉴 -------");
			System.out.println("1. 친구 목록");
			System.out.println("2. 프로필 변경");
			System.out.println("3. 비밀번호 변경");
			System.out.println("4. 닉네임 변경");
			System.out.println("5. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1 : 
				viewFriendList(id);
				break;
			case 2 : 
				changeProfile(id);
				break;
			case 3:
				changePassword();
				break;
			case 4:
				changeNickName(id);
				break;
			case 5:
				check = false;
				break;
			}
		}
	}

	public void changeProfile(String id) {
		
		System.out.println("------- 프로필 변경 -------");
						
		System.out.print("[프로필 변경] 변경할 프로필 사진 : ");
		String img = sc.nextLine();
						
		System.out.print("[프로필 변경] 변경할 상태메시지 : ");
		String profileMsg = sc.nextLine();		
		
		Friend f = new Friend();
		
		f.setProfileMsg(profileMsg);
		f.setImg(img);
		
		fc.addFriendList(id, f);
		
		uc.changeProfile(id, img, profileMsg);
		viewProfile(id);
	}
	
	
	
	public void changePassword() {

		/*
		 * 아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 changePassword()로 보냄 받은 결과 값이 true면
		 * "비밀번호 변경에 성공했습니다." false면 "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();

		if (uc.changePassword(id, oldPw, newPw) == true) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			changePassword();
		}

	}

	public void changeNickName(String id) {

		/*
		 * 아이디와 비밀번호를 받아 mc의 login()으로 넘겨 현재 저장되어 있는 이름을 받고 사용자에게 현재 저장되어 있는 이름을 출력하여
		 * 보여줌 변경할 이름을 받아 mc의 changeName()로 id와 함께 넘기고 "이름 변경에 성공하였습니다." 출력 만약
		 * login()로부터 저장되어 있는 이름을 받지 못 했다면 "이름 변경에 실패했습니다. 다시 입력해주세요" 출력
		 */
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.println("현재 설정된 이름 : " + uc.login(id, password));
		
		System.out.print("변경할 이름 : ");
		String newName = sc.nextLine();


		if (uc.login(id, password) == null) {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
		}

		Friend f = new Friend();
		
		f.setNickName(newName);
		
		fc.addFriendList(id, f);
		
		uc.changeNickName(id, newName);

	}
	
	public void viewProfile(String id) {
		
		uc.viewProfile(id);
	}
	
	public void idList() {
		uc.idList();
	}
	
	
	
	public void viewFriendList(String id) {
		
		System.out.println(fc.viewFriendList(id));
	}
	
	
	
}













//		
//		public void signUp() {
//
//			System.out.print("[회원가입] ID 입력 : ");
//			String email = sc.nextLine();
//		
//			System.out.print("[회원가입] 비밀번호 입력 : ");
//			String password = sc.nextLine();
//						
//			System.out.print("[회원가입] 프로필 사진 등록 : ");
//			String img = sc.nextLine();
//				
//			System.out.print("[회원가입] 닉네임 등록 : ");
//			String n_nickName = sc.nextLine();
//			
//			System.out.print("[회원가입] 상태메시지 등록 : ");
//			String n_profileMsg = sc.nextLine();
//					
//			System.out.println(" 회원가입이 완료되었습니다. 로그인 해주세요.");
//
//		}
//		
//		
////		Mainmenu mm = new Mainmenu();
////		mm.menu();
//	}
//
//}