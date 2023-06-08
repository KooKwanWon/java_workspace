package com.kakaotalk.controller;

import java.util.HashMap;
import java.util.Set;

import com.kakaotalk.model.User;



public class UserController {

	private HashMap<String, User> map = new HashMap<>();
	
	public boolean joinMembership(String id, User m) {
		
		Set<String> key = map.keySet();

		for (String idcheck : key) {
			if(id.equals(idcheck)){
				
				return false;
			}
		}
		map.put(id, m);
		return true;
	}
	
	public String login(String id, String password) {
		
		/*
		 * 
		 * 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와 
		 * 사용자가 입력한 비밀번호가 같은지 비교
		 * 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		 * 
		 * */
		
		if(map.containsKey(id) && (map.get(id).getPassword().equals(password))) {
			
			return map.get(id).getNickName();
			
		}
		
		return null;
	}
	
	public void changeProfile(String id, String img, String profileMsg) {
		
		/*
		 * 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		 * 
		 * */
		if(map.containsKey(id)) {
			
			map.get(id).setImg(img);
			map.get(id).setProfileMsg(profileMsg);
			
		System.out.println("프로필 수정 완료");
		}

	}
	
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
		/*
		 * 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		 * 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		 * */
		
		if(map.containsKey(id) && (map.get(id).getPassword().equals(oldPw))) {
			
			map.get(id).setPassword(oldPw);
						
			return true;
//					map.get(id).getName();
			
		}
		
		return false;
	}
	
	public void changeNickName(String id, String newName) {
		
		/*
		 * 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		 * 
		 * */
		map.get(id).setNickName(newName);
		System.out.println("이름 변경에 성공하였습니다.");
		

	}
	
	
	public void viewProfile(String id) {
		
			System.out.println("========== 내 프로필 ==========");
			System.out.print("[" + map.get(id).getImg() + "] ");
			System.out.print("[" + map.get(id).getNickName() + "] ");
			System.out.println("[상태메시지 : " + map.get(id).getProfileMsg() + "]");
			System.out.println("============================");
									
	}
	
	public HashMap idList() {
	
		
		
			return map;
		
	}
}










//
//public class UserController {
//
//
//	User user = null;
//	
//	public boolean login(String id, String password) { // 로그인
//		if(user!=null && user.getId().equals(id) 
//				  && user.getPassword().equals(password)) {
//			return true;
//		}
//		return false;
//	}
//
//	
//	public void signUp(User user) { // 회원가입
//		this.user = user;
//	}
//	
//private HashMap<String, Member> map = new HashMap<>();
//	
//	User user = null;
//	
//	public boolean login(String id, String password) { // 로그인
//		if(user!=null && user.getId().equals(id) 
//				  && user.getPassword().equals(password)) {
//			return true;
//		}
//		return false;
//	}
//	
//	public void signUp(String id, Member m) { // 회원가입
//		Set<String> key = map.keySet();
//		
//		for (String idcheck : key) {
//			if(id.equals(idcheck)){
//				
//				return false;
//			}
//		}
//		map.put(id, m);
//		return true;
//		
//	}
//
//	public void signUp() {
//
//		
//
//	}
//
//	
//	public User viewProfile() { // 프로필 보기 (로그인 된 경우)
//		
//		if(login(user.getId(), user.getPassword())) {
//			return user;
//		}
//		return null;
//	}
//
//	
//	public User updateProfile(User user) { // 프로필 수정 (로그인 된 경우)
//		if(login(this.user.getId(), this.user.getPassword())) {
//			this.user = user;
//		}
//		return this.user;
//	}
//
//
//	public void deleteProfile(String id) { // 계정 삭제
//		if(user.getId().equals(id)) {
//			user = null;
//		}
//	}
//	
//	
//	
//}
