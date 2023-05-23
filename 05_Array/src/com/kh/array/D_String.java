package com.kh.array;

public class D_String {

	
	/*
	 * 문자열 : 문자의 배열, 여러개의 문자가 배열을 이룬것이 문자열
	 * 자바에서는 문자는 작은 따옴표
	 * 문자열은 큰 따옴표를 사용하여 나타낼수 있음
	 * 
	 * -String.charAt(int index)
	 * :인덱스에 있는 문자를 char 형식으로 반환
	 * 
	 * -String.toCharArray()
	 * :모든 문자가 들어 있는 Char[] 형식의 데이터를 반환
	 * 
	 * 
	 * */
	
	public void method1() {
		
		char[]arr = "Hello, World!".toCharArray();
		
		for(char c : arr) {
			System.out.println(c);
		}
	}
	
	/*
	 * ArrayIndexOutOfBoungsException
	 *  배열의 인덱스 범위를 벗어나서 발생하는 에러!
	 *  해결책 조건식 수정
	 * */
	public void method2() {
		
		
		
	}
	
	
	public static void main(String[] args) {


		D_String d = new D_String();
		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
//		d.method5();
//		d.method6();
//		c.method7();

	}

}
