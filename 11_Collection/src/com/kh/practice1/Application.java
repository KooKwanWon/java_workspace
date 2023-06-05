package com.kh.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.list.model.Person;
import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {

	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public static void main(String[] args) {
				
		Application a = new Application();
		
		a.mainMenu();
	}
	
	public void mainMenu() {
		
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력 ");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호 입력 : ");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice){
			
		case 1 : addList();
		break;
		
		case 2 : addAtZero();
		break;
		
		case 3 : printAll();
		break;
		
		case 4 : searchMusic();
		break;
		
		case 5 : removeMusic();
		break;
		
		case 6 : setMusic();
		break;
		
		case 7 : ascTitle();
		break;
		
		case 8 : descArtist();
		break;
		
		case 9 : System.out.println("종료");
		mainMenu();
		break;
		}
		
		
	} 
	public void addList() {
		
		Music m = new Music();
		
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 입력 : ");
		String artist = sc.nextLine();
		
		m.setTitle(title);
		m.setArtist(artist);
		
		if(mc.addList(m)==true) {
			System.out.println("추가 성공");
		}
		else {
			System.out.println("추가 실패");
		}
		
		mainMenu();
	} 
	
	public void addAtZero() {
		
		Music m = new Music();
		
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 입력 : ");
		String artist = sc.nextLine();
		
		m.setTitle(title);
		m.setArtist(artist);
		
		if(mc.addAtZero(m)==true) {
			System.out.println("추가 성공");
		}
		else {
			System.out.println("추가 실패");
		}
		
		mainMenu();
		
	} 
	public void printAll() {
		
		System.out.println(mc.printAll());
		mainMenu();
	} 
	public void searchMusic() {
		
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		
		System.out.println(mc.searchMusic(title));
		mainMenu();
		
	} 
	public void removeMusic() {
	
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		
		System.out.println(mc.removeMusic(title));
		mainMenu();
		
	} 
	public void setMusic() {
		
		Music m = new Music();
		
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		
		if(mc.searchMusic(title)==null) {
			System.out.println("수정할 곡이 없습니다.");
		}
		else {
			System.out.print("수정할 곡 명 입력 : ");
			String title1 = sc.nextLine();
			System.out.print("수정할 가수 명 입력 : ");
			String artist1 = sc.nextLine();
			m.setTitle(title1);
			m.setArtist(artist1);
			mc.setMusic(title, m);
		}
		
		
		
		mainMenu();
	} 
	public void ascTitle() {
		System.out.println("***************곡명 오름차순***************");
		for (Music music : mc.ascTitle()) {
			System.out.println(music);
		}
		mainMenu();
	} 
	public void descArtist() {
		System.out.println("***************가수명 내림차순***************");
		for (Music music : mc.descArtist()) {
			System.out.println(music);
		}
		mainMenu();
	} 
	

	
	
}
