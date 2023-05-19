package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {

		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
//		o.method5();
		o.method6();
		
	}

	public void method1() {
		
		int people = 0;
		int pencil = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 > " );
		people = sc.nextInt();
	
		System.out.print("연필 개수 > " );
		pencil = sc.nextInt();
		
		System.out.println("1인당 연필 개수 : " + pencil/people);
		System.out.println("남은 연필 개수 : " + pencil%people);
		
	}	
	
	public void method2() {
		
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해주세요 > " );
		a = sc.nextInt();
		
		b = a - (a % 100);
		
		System.out.println(b);
		
	}
	
	public void method3() {
	
		int a, b, c =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : " );
		a = sc.nextInt();

		System.out.print("입력2 : " );
		b = sc.nextInt();
		
		System.out.print("입력3 : " );
		c = sc.nextInt();
		
		System.out.println((a==b)&&(b==c));
		
	}
	
	public void method4() {
		
		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : " );
		a = sc.nextInt();
		
		System.out.println(a % 2 ==0 ? "짝수다" : "홀수다");
		
	}
	
	public void method5() {
	
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : " );
		age = sc.nextInt();
		
		System.out.println(age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년"));
		
	}

	public void method6() {
	
		int apple, basket, need = 0;
						
		Scanner sc = new Scanner(System.in);
		System.out.print("사과의 개수 : ");
		apple = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		basket = sc.nextInt();
		
		need = (apple + basket -1) / basket;
		
		System.out.println("필요한 바구니의 수 : " + need);
	}
	
}
