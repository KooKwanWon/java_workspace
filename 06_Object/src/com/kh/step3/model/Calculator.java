package com.kh.step3.model;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	/*
	 * 메서드(method)
	 * - 작업을 수행하기 위한 명령문의 집합
	 * - 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
	 * - 단, 입력받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있음.
	 * - 하나의 메서드는 한가지 기능만 수행하도록 작성하는 것을 권고
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메서드이름(타입 변수명, 타입 변수명, ...){
	 * 		// 메서드 호출시 수행될 코드
	 * 		return;
	 * }
	 * *return문
	 * -메서드에서 return문을 만나면 종료
	 * -반환값이 없는(void) 경우 return문만 사용!
	 * -반환값이 있는(void) 경우 return문 뒤에 반환값을 지정해야 함
	 * 
	 * */
	public int a;
	public int b;
	
	//최대값을 구하는 메서드
	
	Scanner sc = new Scanner(System.in);
	
	public int max() {
		
		if(a>b) {
			return a;
		}
		else
			return b;
	}
	
	public int add() {
		
		int sum = a+b;
				
		return sum;		
				
	}
	
	public int subtract() {
		
		int minus = a-b;
		
		return minus;	
	}
	
	public static int multiply(int a, int b) {
		
		return a * b;
	}
	
	//나누기  -> 형태 : 몫은 1, 나머지는 3
	
	public static String divide(int a, int b) {
		
		
		String i = ("몫은 " + a/b + ", 나머지는 " + a%b); 
		
		return i;
	}
	
	public static int quotient(int a, int b) {
		
		return a/b;
	}
	
	public static int remainder(int a, int b) {
		
		return a%b;
	}	
	
	public int factorial(int n) {
		
		/*
		 * 팩토리얼!
		 * 1! = 1
		 * 2! = 2 x 1
		 * 3! = 3 X 2 x 1
		 * */
		int fac = 1;
		
		for(int i=1; i<=n; i++) {
			fac *= i;
		}
		return fac;
	}
	/*
	 * 재귀 함수 (Recursion Function)
	 * -메서드 내에서 자기자신을 반복적으로 호출
	 * -반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
	 * -이해하기 쉽고 간결한 코드 작성이 가능 
	 *
	 * */
	
	public int factorial2(int n) {
        int fac = 0;
		if (n != 1) fac = n * factorial2(n - 1);
        return fac;
	}
}