package com.kh.step3;

import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 변수 호출 방법
		 * - 참조변수.변수;
		 * 
		 * 메서드 호출 방법
		 * - 참조변수.메서드이름();			//매개변수가 없는 경우
		 * - 참조변수.메서드이름(값1,값2, ...);//매개변수가 있는 경우
		 * 
		 * */
		
		Calculator c = new Calculator();
		
		c.a = 100;
		c.b = 200;
		
		System.out.println("최대값 : " + c.max());
		System.out.println("더하기 : " + c.add());
		System.out.println("빼기 : " + c.subtract());
		System.out.println("곱하기 : " + c.multiply(3, 6));
		System.out.println("나누기 : " + c.divide(8, 5));
		System.out.println("몫 : " + c.quotient(8, 5));
		System.out.println("나머지 : " + c.remainder(8, 5));
		
		System.out.println("팩토리얼 : " + c.factorial(5));
		System.out.println("팩토리얼2 : " + c.factorial2(5));
		
		/*
		 * 1. 인스턴스 메서드
		 * -인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
		 * -인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는 메서드
		 * 클래스 메서드(static메서드)
		 * -객체 생성 없이 '클래스이름.메서드이름()'으로 호출
		 * -인스턴스 변수나 인스턴스 메서드와 관련 없는 작업을
		 * */
		
//		System.out.print("a입력 : ");
//		a = sc.nextInt(); 
//		System.out.print("b입력 : ");
//		b = sc.nextInt();
		
		
	}

}
