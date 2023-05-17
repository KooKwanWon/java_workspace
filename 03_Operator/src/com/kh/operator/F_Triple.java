package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	/*
	 * 삼항 연산자
	 * [표현법] 조건식 ? 식1 : 식2;
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * - 조건식의 결과가 true이면 식1을 수행한다.
	 * - 조건식의 결과가 false 이면 식2를 수행한다.
	 *  
	 * */
	
	public static void main(String[] args) {
		
		F_Triple f = new F_Triple();
//		f.method1();
//		f.practice1();
		f.practice2();
		
	}
	
	public void method1() {

		int number = 0;
		String result = "";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수값 입력 >" );
		number = sc.nextInt();
		
		// 입력받은 정수가 양수인지 음수인지 판단
		//result = (number > 0) ? "양수입니다." : "음수입니다." ;
		//System.out.println(result);
		
		// 양수이다, 음수이다, 0이다
		
		result = (number > 0) ? "양수입니다." : ((number == 0) ? "0입니다. " : "음수입니다."); 
		System.out.println(result);
		
	}
	
	/*
	 * 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 크거나 같은 경우 "결과가 100 이상입니다"
	 * 아닌 경우 "결과가 100보다 작습니다" 출력
	 * */
	
	public void practice1() {
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		String result = "";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수값 입력 > " );
		number1 = sc.nextInt();
		
		System.out.print("두번째 정수값 입력 > " );
		number2 = sc.nextInt();
		
		number3 = number1 * number2;
		
		result = (number3 >= 100) ? "100이상입니다." : "100 보다 작습니다." ;
		System.out.println(result);
		
	}
	/*
	 * 문제2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다."
	 * 아닌 경우 "알파벳 대문자가 아니다." 출력
	 * */
	
	public void practice2() {
		
		char alphabet;
		String result = "";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("알파벳 입력 > " );
		alphabet = sc.nextLine().charAt(0);
		
		result = (alphabet < 'A') ? "알파벳 대문자가 아니다." : ((alphabet > 'Z')? "알파벳 대문자가 아니다." : "알파벳 대문자이다.");
		
		System.out.println(result);		
	}
	
}
