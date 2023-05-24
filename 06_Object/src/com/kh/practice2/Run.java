package com.kh.practice2;

import java.util.Scanner;

import com.kh.practice2.model.Circle;

public class Run {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println("둘레 : "+c.length());
		System.out.println("넓이 : "+c.area());
		
		c.incrementRadius();
		
		System.out.println("반지름 "+ 1 +" 증가 후 둘레 : " + c.length());
		System.out.println("반지름 "+ 1 +" 증가 후 넓이 : " + c.area());
	}

}
