package com.kh.loop;

import java.util.Scanner;

public class C_For {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * for(초기식; 조건식; 증감식;)
	 * 
	 * - 주어진 횟수만큼 코드를 반봅 실행하는 구문
	 * - 초기식은 반복문이 수행될 떄 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * - 조건식의 결과가 false이면 실행코드를 수행하지 않고 반복문을 빠져나간다.
	 * - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 * 
	 * */
	
	//1~5 출력
	public void method1() {
		
		for(int i = 0; i < 5; i++){
			
			System.out.println(i + 1);
		}
		
		
	}
	/*
	 * 5 4 3 2 1 출력
	 * */
	public void method2() {
		
		for(int i = 5; i > 0; i--){
			
			System.out.println(i);
		}
	}
	/*
	 * 1~10사이
	 * 홀수만 출력
	 * */
	public void method3() {
		
		for(int i = 0; i < 10; i++){
			
			if(i % 2 ==1) {
			System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		C_For c = new C_For();
//		c.method1();
//		c.method2();
		c.method3();
	}

}
