package com.kh.inheritance;

import com.kh.inheritance.child.*;

public class Application {

	public static void main(String[] args) {

		Notebook notebook = new Notebook("애플", "a1111", "맥북 프로 14", 2790000, "M2");
		SmartPhone phone = new SmartPhone("삼성", "s2222", "S23 울트라", 1590000, "skt");
		Tv tv = new Tv("엘지", "42LX3QKNA", "올레드 Flex", 3990000, 31);
		
		System.out.println(notebook);
		System.out.println(phone);
		System.out.println(tv);
		
	}

}
