package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);
	/*
	 * [표현법]
	 * 
	 * switch(조건식){ case 값1: ...조건식의 결과가 값1과 같을 경우 실행 코드... break; case 값2: ...조건식의
	 * 결과가 값2과 같을 경우 실행 코드... break; default: ...조건식의 결과가 일치하는 case문이 없을 떄 실행 코드...
	 * 
	 * }
	 * 
	 * - case문의 수는 제한이 없다. - 조건식 결과는 정수, 문자, 문자열이어야 한다. - 조건문을 빠져나오려면 break가 필요하다. -
	 * default문은 생략 가능하다.
	 * 
	 */

	public void method1() {

		/*
		 * 숫자를 입력받아 1일 경우 "빨간색" 1일 경우 "파란색" 1일 경우 "초록색" 잘못 입력했을 경우 "잘못 입력하셨습니다"
		 */
		System.out.print("정수 입력 >");
		int num = sc.nextInt();
		String color = "";

//		if(num ==1) color = "빨간색";
//		else if(num ==2) color = "파란색";
//		else if(num ==3) color = "초록색";
//		else color = "잘못 입력하셨습니다";

//		System.out.println(color);

		switch (num) {

		case 1:
			color = "빨간색";
			break;
		case 2:
			color = "파란색";
			break;
		case 3:
			color = "초록색";
			break;
		default:
			color = "잘못 입력하셨습니다";
			break;
		}
		System.out.println(color);
	}

	/*
	 * 등급별 권한 1 : 관리 권한, 글쓰기 권한, 읽기권한 2 : 글쓰기 권한, 읽기권한 3 : 읽기권한
	 */
	public void method2() {

		System.out.print("등급을 입력하세요 >");
		int level = sc.nextInt();

		String access = "";

//		switch(level) {

//		case 1:
//			access = "관리 권한, 글쓰기 권한, 읽기권한";
//			break;
//		case 2:
//			access = "글쓰기 권한, 읽기권한";
//			break;
//		case 3:
//			access = "읽기권한";
//			break;
//		default:
//			access = "권한이 없습니다.";
//			break;	
//		}
//		System.out.println(access);	

		switch (level) {

		case 1:
			access = "관리 권한, ";
		case 2:
			access += "글쓰기 권한, ";
		case 3:
			access += "읽기 권한";
		}
		System.out.println(access);

	}
	/*
	 * 월을 입력 했을 때 계절을 출력
	 * 
	 * 3, 4, 5 : 봄 6, 7 ,8 : 여름 9, 10, 11 : 가을 12, 1, 2 : 겨울
	 * 
	 * 월 > 5 봄
	 * 
	 * 월 > 11 가을
	 * 
	 */

	public void method3() {

		System.out.print("월 > ");
		int month = sc.nextInt();

		String season = "";

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}
		System.out.println(season);

	}

	

	public static void main(String[] args) {

		B_Switch b = new B_Switch();
//		b.method1();
//		b.method2();
		b.method3();


	}

}
