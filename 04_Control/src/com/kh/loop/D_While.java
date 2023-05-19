package com.kh.loop;

import java.util.Scanner;

public class D_While {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * while(조건식) {
	 * 
	 * 		...실행코드
	 * }
	 * 
	 * 
	 * */
	public void method1() {
		
//		for(int i = 1; i <= 5; i++)
		
			
		int i=1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		
	}
	/*
	 * break문
	 * - switch, 반복문의 실행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
	 * 
	 * */
	
	//for문 무한루프
	public void method2() {
		
		for(int i = 1; i<=5; ) {
			System.out.println(i);
		}
		for(int i = 1;  ; ) {
			System.out.println(i);
		}
		
	}
	
	// while문 무한루프
	public void method3() {
		
		int input = 0;
		
		while(true) {
			System.out.print("숫자 입력 > ");
			input = sc.nextInt();
			
			System.out.println(input);
			
		}
	}
	
	/*
	 * do while 문
	 * 
	 *  [표현법]
	 *  
	 *  do{
	 *  	...실행코드...
	 *  }while(조건식);
	 *  
	 *  -조건과 상관없이 무조건 한번은 실행
	 * */
	
	public void method4() {
		
		int input = 0;
				
		do {
			System.out.println("do");
		}
		
		while(input == 1);
		
	}
	
	public void method5() {
		
		int random = 0;
		int i=0;
		
		random = (int)(Math.random() * 100 + 1) ;
		
		while(true) {
			
			System.out.print("숫자를 입력하세요 ");
			int num = sc.nextInt();
			++i;
			
			if (random > num) {
				
				System.out.println("정답보다 작습니다." + "도전횟수 : " + i);
			}
			else if (random < num) {
				
				System.out.println("정답보다 큽니다." + "도전횟수 : " + i);
			}
			else {
				
				System.out.println("정답입니다."+ i +"번만에 맞췄습니다.");
				break;}
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		D_While d = new D_While();
		
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
		d.method5();
//		d.method5();
//		d.method5();
//		d.method5();
//		d.method5();
		
	}

}
