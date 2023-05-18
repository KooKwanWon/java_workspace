package com.kh.loop;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.method1();
		
	}
	
	public void method1(){

		int time1 = sc.nextInt();
		
		int time2 = sc.nextInt();
		
		int cooking = sc.nextInt();
		
		int time3 = 0;
		
		
		time3 = time1*60 + time2;
		
		time3 = time3 + cooking ;
		
		String season = "";
		
	}	
	
}
