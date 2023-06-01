package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen {
	
	String name = "S23 Ultra";
	String brand = "삼성";

	public S23Ultra() {
		
	}

	public void printInformation() {
		
		System.out.println(name + "는 " + brand + "에서 만들어졌고 제원은 다음과 같다.");
		System.out.println(makeCall());
		System.out.println(takeCall());
		System.out.println(picture());
		System.out.println("펜 탑재 여부 : " + pen());
		
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "2억 화소 카메라";
	}

	@Override
	public boolean pen() {
		return true;
	}
}
