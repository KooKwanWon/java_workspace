package com.kh.practice.controller;

import com.kh.practice.model.AniBook;
import com.kh.practice.model.Book;
import com.kh.practice.model.CookBook;
import com.kh.practice.model.Member;

public class LibraryController {

	int i = 0;
	private Member member = null;
	private Book[] bookList = new Book[4];
	{
	bookList[0] = new CookBook("김대석 셰프의 집밥레시피", true);   
	bookList[1] = new CookBook("에브리데이 베이글", false); 
	bookList[2] = new AniBook("귀멸의 칼날 23", 19); 
	bookList[3] = new AniBook("원피스 105", 15); 
	}
	
	public void insertMember(String name, int age) {
		
		member = new Member(name,age);
		
	}
	
	public Member myInfo() {
		
		
		return member;
	}
	
	public Book searchBook(String keyword) {
		
		Book a = new Book();
		
		for (int i = 0; i < bookList.length; i++) {
			if(bookList[i].getTitle().contains(keyword)) {
				a = bookList[i];
			}
		}
				
		return a;
	}
	
	public Book[] viewBooks() {
		
				
		return bookList;
	}
	//대여할 책의 인덱스를 매개변수로 받아서 조건에 따라 처리
	//나이제한 쿠폰있을때
	public boolean rentBook(int index) {
		
		boolean x = true;
		//if (selectBook instanceof AniBook){} 
		switch(index) {
		
		case 0 : 
			member.setCookCoupon(++i);
			member.setBook(bookList[index]);
			x = true;
			break;
		case 1 : 
			member.setBook(bookList[index]);
			x = false;
			break;
		case 2 : 
			if(19>member.getAge()) {
				x=false;
			}else {
				member.setBook(bookList[index]);
			} break;
		case 3 :
			if(15>member.getAge()) {
				x=false;
			}else {
				member.setBook(bookList[index]);
			} break;
		}
		return x;
	}
}