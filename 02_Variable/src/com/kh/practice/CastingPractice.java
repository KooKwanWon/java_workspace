package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	public static void main(String[] args) {
		
		
		CastingPractice c = new CastingPractice();
//		c.method1();
		c.method2();

		
	}
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
		
		
		char first = a.charAt(0);
		int second = (int)first + 1;
		
		
		
		
		System.out.println(a + " unicode : " + (int)first);
		System.out.println((char)second + " unicode : " + (int)(first+1));
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean+english+math;
		double avr = sum/3.0;
		
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avr);
		
	}
}
