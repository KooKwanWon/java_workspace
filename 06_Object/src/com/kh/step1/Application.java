package com.kh.step1;

import com.kh.step1.model.Tv;

public class Application {

	/*
	 * 객체 : 실제로 존재하는 것
	 * 사물과 같은 유형적인 것뿐만 아니라, 개념이나 논리와 같은 무형적인 것도 포함
	 * 
	 * 객체 지향 프로그래밍(OOP, Objected-Oriented Programming)
	 * - 프로그램을 개발하는 기법으로 객체들을 만들고 이러한 객체들을 연결해서 프로그램을 완성하는 기법
	 * - 객체지향 프로그래밍 특성을 지원하는 언어를 객체지향 프로그래밍 언어라고 한다.
	 * - 코드의 재사용성이 높고, 유지보수가 용이하다.
	 * 
	 * 객체 지향 프로그래밍의 특징
	 * 추상화 : 객체들이 가진 공통의 특성들을 파악하고 불필요한 특성들을 제거하는 과정
	 * 캡슐화 : 객체의 속성(필드)와 기능(메서드)를 하나로 묶고 실제 구현 내용을 감추는것
	 * 상속  : 하나의 객체가 가지고 있는 속성(필드)과 기능(메서드)를 다른 객체가 물려받는 것
	 * 다형성 : 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
	 *
	 * 클래스 
	 * - 객체의 특성(속성, 기능)을 정의해 놓은 설계도
	 * - 객체의 속성은 필드(변수)를 통해서 정의
	 * - 객체의 기능은 메소드를 통해서 정의
	 * 
	 * [표현법]
	 * 
	 * [접근제한자][예약어]class 클래스명{...}
	 * - 클래스 이름은 작성 규칙에 따라 대문자로 시작
	 * - 파일 이름은 반드시 선언된 클래스 이름과 같도록!
	 * - 접근 제한자는 public, (default) 설정 가능
	 * - 클래스는 필드(Field), 메소드(Method), 생성자(Constructor)가 정의
	 * - 클래스 작성 시 객체 지향 언어의 특징 중 추상화(Abstraction), 캡슐화(Encapsulation)가 적용되어야 함
	 * 
	 * */
	
	public static void main(String[] args) {
	
		/*
		 * 객체 생성
		 * 
		 * [표현법]
		 * 
		 * 클래스명 변수명 = new 클래스명();
		 * 
		 * - new 연산자를 사용해서 생성
		 * - new 연산자는 Heap 영역에 객체를 생성하고 객체의 주소값을 반환
		 * - 객체의 주소값을 참조 타입인 변수에 저장해서 객체 사용
		 *
		 * 객체 생성 = 메모리에 올린다 = 객체의 구성요소가 다 올라간다 (Field, Method)
		 * */
		
		Tv tv = new Tv();
		
		System.out.println("TV 상태 : " + tv.power); //false
		
		tv.power();
		System.out.println("TV 상태 : " + tv.power); //true
		
		System.out.println("TV 채널 : " + tv.channel); //20
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		System.out.println("TV 채널 : " + tv.channel); //22
		
	}

}


	