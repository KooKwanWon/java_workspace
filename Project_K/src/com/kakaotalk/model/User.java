package com.kakaotalk.model;

import java.util.Objects;


public class User {

	private String password ;
	private char gender;
	private String birth;
	private String nickName ;
	private String profileMsg = "내용없음";
	private String phone ;
	private String img = "기본 프로필 사진";
	
	public User() {
	}

	public User(String password, char gender, String birth, String nickName, String profileMsg, String phone,
			String img) {
		super();
		this.password = password;
		this.gender = gender;
		this.birth = birth;
		this.nickName = nickName;
		this.profileMsg = profileMsg;
		this.phone = phone;
		this.img = img;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getProfileMsg() {
		return profileMsg;
	}

	public void setProfileMsg(String profileMsg) {
		this.profileMsg = profileMsg;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", gender=" + gender + ", birth=" + birth + ", nickName=" + nickName
				+ ", profileMsg=" + profileMsg + ", phone=" + phone + ", img=" + img + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birth, gender, img, nickName, password, phone, profileMsg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birth, other.birth) && gender == other.gender && Objects.equals(img, other.img)
				&& Objects.equals(nickName, other.nickName) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(profileMsg, other.profileMsg);
	}

	
	
}	

//	
//	Scanner sc = new Scanner(System.in);
//	
//		
//	private String id;
//	private char gender;
//	private String nickName ;
//	private String password ;
//	private String profileMsg ;
//	private String email ;
//	private String phone ;
//	private String img = "[프로필 사진]";
//	
//	private String deletecheck ="삭제하겠습니다";
//	private boolean ing = false;
//	private boolean ox = true;
//	
//
//	public void signUp() {
//
//		System.out.print("[회원가입] ID 입력 : ");
//		String id = sc.nextLine();
//		
//		System.out.print("[회원가입] e-mail 입력 : ");
//		String email = sc.nextLine();
//
//		System.out.print("[회원가입] 비밀번호 입력 : ");
//		String password = sc.nextLine();
//		
//		System.out.print("[회원가입] 프로필 사진 등록 : ");
//		String img = sc.nextLine();
//				
//		System.out.print("[회원가입] 닉네임 등록 : ");
//		String nickName = sc.nextLine();
//		
//		System.out.print("[회원가입] 상태메시지 등록 : ");
//		String profileMsg = sc.nextLine();
//				
//		System.out.println(" 회원가입이 완료되었습니다. 로그인 해주세요.");
//
//	}
//
//	public void login() {
//
//		while (ox) {
//
//			if (ing == false) {
//				System.out.print("[로그인] ID : ");
//				String a = sc.nextLine();
//
//				if (a.equals(email)) {
//					System.out.print("[로그인] 비밀번호 : ");
//					String b = sc.nextLine();
//
//					if (b.equals(password)) {
//						System.out.println(" 로그인 되었습니다.");
//						ing = true;
//						viewProfile();
//						ox = false;
//					} else
//						System.out.println(" 비밀번호가 잘못되었습니다.");
//				} else
//					System.out.println(" ID가 잘못되었습니다.");
//			}
//		}
//	}
//
//	public void p_menu() {
//		System.out.print("[내 프로필] 원하는 메뉴를 선택해 주세요" + "\n" + "1.프로필  2.프로필 설정 : ");
//		int pmenuchoice = sc.nextInt();
//		
//		if (pmenuchoice == 1) {
//			
//			viewProfile();
//
//		} else if (pmenuchoice == 2) {
//			settings();
//
//		} 
//		
//	}
//	
//	public void viewProfile() {
//		if (ing == true) {
//			System.out.println("========== 내 프로필 ==========");
//			System.out.print("[" + img + "] ");
//			System.out.print("[" + nickName + "] ");
//			System.out.println("[상태메시지 : " + profileMsg + "]");
//			System.out.println("============================");
//			
//			System.out.print(" 1.프로필 설정 2.메인메뉴로 가기 : ");
//			int pchoice = sc.nextInt();
//
//			if (pchoice == 1) {
//				settings();
//			}
//
//		} else
//			login();
//	}
//
//	
//	public void settings() {
//
//			System.out.print("[프로필 설정] 1.프로필사진 변경  2.닉네임 변경  3.상태메시지 변경  4.계정삭제 : ");
//			int choice_s = sc.nextInt();
//			sc.nextLine();
//			
//			if (choice_s == 1) {
//				System.out.print("변경할 사진을 등록해주세요 : ");
//				String c_img = sc.nextLine();
//				img = c_img;
//
//			} else if (choice_s == 2) {
//				System.out.print("변경할 닉네임을 입력해주세요 : ");
//				String c_nickName = sc.nextLine();
//				nickName = c_nickName;
//
//			} else if (choice_s == 3) {
//				System.out.print("변경할 상태메시지를 입력해주세요 : ");
//				String c_profileMsg = sc.nextLine();
//				profileMsg = c_profileMsg;
//			
//			} else if (choice_s == 4) {
//				deleteProfile();
//			}
//			
//			viewProfile();
//	}
//
//	public void deleteProfile() {
//		
//		System.out.print("정말로 계정을 삭제하시겠습니까?"+"\n"+ "삭제를 원하시면 '삭제하겠습니다'를 작성하세요 : ");
//		String delete = sc.nextLine();
//		
//			if(delete.equals(deletecheck)) {
//				System.out.println("계정이 삭제되었습니다.");
//				System.out.println("회원가입을 새로 해주세요.");
//				ing = false;
//				signUp();
//			}
//			else
//				settings();
//	}
//	
//}