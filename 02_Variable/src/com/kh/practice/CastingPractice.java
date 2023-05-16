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
}
