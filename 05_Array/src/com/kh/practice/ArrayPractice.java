package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
		String[] arr = {"가", "나", "다", "라", "마"};
		
		arr[0] = "사과";
		arr[1] = "바나나";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "딸기";
		
		System.out.println(arr[4]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		
		System.out.println("정수 : ");
		int a = sc.nextInt();
		
		int sum = 0;
		int[] b = new int[a];
		
		for(int i = 0; i < a; i++) {
		System.out.println("배열 " + (i) + "번째 인덱스에 넣을 값 : ");
		b[i] = sc.nextInt();
		
		sum += b[i];
		
		}
		System.out.println(Arrays.toString(b));
		System.out.println(sum);

	}
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		
		String [] menu = new String [] {"비빔밥", "돌솥비빔밥", "황태해장국", "육회비빔밥"};
		
		System.out.println("메뉴 입력 : ");
		String a = sc.nextLine();
		
		boolean out = false;
						
		for(int i=0; i < menu.length; i++) {
			if(menu[i].equals(a)) {
				System.out.println("배달 가능");
				out = true;
			}
		}
		
		if(out == false) {
			System.out.println("배달 불가능");
		}
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		System.out.println("주민등록번호 : ");
		String a = sc.nextLine();
		int i = 0;
		int j = 0;
		
		String[] number = new String[a.length()];
		
		for(i = 0; i < a.length(); i++) {
			number[i] = String.valueOf(a.charAt(i));
		}	
		
		String number2[] = new String[number.length];
		number2 = Arrays.copyOf(number, number.length);
		
		for(j =0 ; j < number2.length; j++) {
			if(j<8) {System.out.print(number2[j]);
				}
			else
				System.out.print("*");
			
		}
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
		System.out.println("단어 입력 : ");
		String a = sc.nextLine();
		int i = 0;
		
		String[] word = new String[a.length()]; 
		
		for(i =0; i<a.length(); i++) {
			word[i] = String.valueOf(a.charAt(i));
		}
		
		for(i =0; i<a.length(); i++) {
		System.out.print(word[a.length()-1-i]);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayPractice a = new ArrayPractice();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		a.method5();
		
		
		
	}
}