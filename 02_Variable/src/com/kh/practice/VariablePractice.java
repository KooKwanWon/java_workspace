package com.kh.practice;
import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
				
			
		VariablePractice v = new VariablePractice();
//		v.method1();
//		v.method2();
//		v.method3();
		v.method4();
		
	}
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 > ");
		int a = sc.nextInt();
					
		System.out.print("두 번째 정수를 입력하세요 > ");
		int b = sc.nextInt();
		
		int p = a + b;
		int m = a - b;	
		int t = a * b;
		int s = a / b;
		
		System.out.printf("더하기 결과 : %d\n빼기  결과 : %d\n곱하기 결과 : %d\n나누기 결과 : %d\n", p, m, t, s);
		}
///////////////////////////////////////////////////////////////////////////
	
	public void method2(){
		
		int adult = 10000;
		int teen = 7000;
		
		int result = 2*adult + 3*teen; 
		System.out.println(result);
	}
	
///////////////////////////////////////////////////////////////////////////
	
	public void method3(){
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		int a = 0;		
			
		a = x;
		x = y;
		y =	z;
		z = a;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
				
	}
///////////////////////////////////////////////////////////////////////////
	
	public void method4(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
		
		
		char first = a.charAt(0);
		char last = a.charAt(7);
		
		System.out.println("첫번째 문자 : " + first);
		System.out.println("마지막 문자 : " + last);
		
	}	
	
	
}
