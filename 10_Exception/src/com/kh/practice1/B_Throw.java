package com.kh.practice1;

import java.io.IOException;

public class B_Throw {
	
	public static void main(String[] args) {
		
		try {
			new B_Throw().method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public void method1() throws ClassNotFoundException, IOException {
		System.out.println("method1() 호출");
		method2();
		System.out.println("method1() 종료");
	}
	
	public void method2() throws ClassNotFoundException, IOException {
		System.out.println("method2() 호출");
		method3();
		System.out.println("method2() 종료");
	}
	
	public void method3() throws IOException, ClassNotFoundException {
		System.out.println("method3() 호출");
		int random = (int)(Math.random() * 3 + 1);
		
		if(random == 1) {
			throw new ClassNotFoundException();
		}
		else if(random == 2) {
			throw new IOException();
		}
		System.out.println("method3() 종료");
	}
	
}
