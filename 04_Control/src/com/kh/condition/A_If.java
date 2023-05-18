package com.kh.condition;

import java.util.Scanner;

public class A_If {

	Scanner sc = new Scanner(System.in); // 인스턴스 변수
	
	/*
	 * if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 	..조건식이 참(true)일 때 실행할 코드..
	 * }
	 * 
	 * -보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 * 
	 * */
	public void method1(){
		
		int score = 80; // 지역 변수
		
		// 60점 이상이어야 합격!!
		
//      만약 (60점 이상) {
//	    합격
//	    }
		
		if (score >= 60) {
			System.out.println("합격!");
		}
		
		// 불합격!
		
		if (score < 60) System.out.println("불합격!");
		
		
	}
	
	/*
	 * if-else문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 	...조건식이 참(true)일 때 실행할 코드...
	 * }
	 * else{
	 * 	...조건식이 거짓일 때 실행할 코드...
	 * }
	 * 
	 * */
	
	public void method2(){
	
		int score = 0;
		
		System.out.print("점수 입력 > ");
		score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("합격!");
		}
		else {
			System.out.println("불합격!");
		}

		//삼항연산자		
		
		System.out.println((score >= 60) ? "합격!" : "불합격!");
		
		
	}
	
	public void method3(){
	
		String name = "";
		
		System.out.print("이름을 입력해주세요 > ");
		name = sc.nextLine();
		
		System.out.println("구관원" == name); // false
		System.out.println("구관원".equals(name)); // true String 클래스의 equals()메소드
		System.out.println("구관원".charAt(0)); // String 클래스의 charAt(0)메소드
		
		// 본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."
		
		if("구관원".equals(name)) {
			System.out.println("본인이다.");
		}
		else
			System.out.println("본인이 아니다.");
	
	}
		
	public void method4(){
		
		int number = 0;
		
		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		
		// 0보다 크면 "양수", 그게 아니면 "음수"
		if(number > 0) {
			System.out.println("양수");
		}
		else {
//			System.out.println("음수");
			
			if(number == 0) {
				System.out.println("0입니다");
			}
			else {
				System.out.println("음수");
			}
		}
	}
	public void method5(){
		/*
		 * if - else if - else 
		 *
		 * [표현법]
		 * 
		 * if(조건식) {
		 * 	...조건식이 참(true)일 때 실행할 코드...
		 * }
		 * 
		 * else if(조건식2){
		 * 	...조건식2가 참(true)일 때 실행할 코드...
		 * }
		 * 
		 * else{
		 * 	...위에 어느 조건식에도 만족하지 않을 때 실행할 코드...
		 * }
		 * 제한이 없다
		 * else는 생략가능
		 * */
		int number = 0;
		
		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("양수");
		}
		
		else if(number < 0){
			System.out.println("음수");
		}
		else
			System.out.println("0입니다");
	
		
	}	
//	사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력하라
//	-90점 이상은 A등급
//	-90점 미만 80점 이상은 B
//	-80점 미만 70점 이상은 C
//	-70점 미만 60점 이상은 D
//	-60점 미만은 F
	
	public void method6(){

		int score = 0;
		
		System.out.print("점수 입력 > ");
		score = sc.nextInt();
		
		char grade = '\u0000';
		
		if(score >= 90) {
			grade = 'A';
		}	
		else if(score >= 80) {
			grade = 'B';
		}	
		else if(score >= 70) {
			grade = 'C';
		}	
		else if(score >= 60) {
			grade = 'D';
		}	
		else
			grade = 'F';	
		
		System.out.println(grade);
	}
	
	public void method7(){
	/*
	 * 세 정수를 입력했을 떄 짝수만 출력
	 * 
	 * num1 3
	 * num2 4
	 * num3 6
	 * 
	 * */
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("입력 > ");
		num1 = sc.nextInt();
		
		System.out.print("입력 > ");
		num2 = sc.nextInt();
		
		System.out.print("입력 > ");
		num3 = sc.nextInt();
		
		if(num1 % 2 == 0) System.out.println(num1);
		if(num2 % 2 == 0) System.out.println(num2);
		if(num3 % 2 == 0) System.out.println(num3);
				
	}
	/*
	 * 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero)/짝(even)/홀(odd) 출력
	 * 
	 * */
	public void method8(){
		
		int num = 0;

		System.out.print("정수 입력 > ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("음(minus)");
			if (num % 2 == 0)
				System.out.println("짝(even)");
			else
				System.out.println("홀(odd)");
		} 
		else if (num > 0) {
			System.out.println("양(plus)");
			if (num % 2 == 0)
				System.out.println("짝(even)");
			else
				System.out.println("홀(odd)");
		}

		else
			System.out.println("0(zero)");
		
		
		
	}
	
	public static void main(String[] args) {

		
		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		
//		a.method7();
		a.method8();
	
	}
	
	
}
