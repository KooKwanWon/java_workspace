package com.kh.practice;

public class IPhone14Pro extends SmartPhone implements Pen {

	String name = "Phone 14 Pro";
	String brand = "애플";

	public IPhone14Pro() {
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
		return "4800만 화소 카메라";
	}

	@Override
	public boolean pen() {
		return false;
	}

}
