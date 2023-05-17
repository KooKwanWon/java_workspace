package com.kh.operator;

public class G_Compound {

	/*
	 * 복학 대입 연산자
	 * - 산술연산자와 대입연산자가 결합되어 있는 형태
	 * - 연산처리 속도가 빨라져, 사용하는걸 권장!
	 * 
	 * += -= *= /= %=
	 *  
	 */
	
	public static void main(String[] args) {
		
		G_Compound g = new G_Compound();
		g.method1();
		
	}
	
	public void method1() {
		
		int number = 12;
		String str = "Hello";
		
		number += 3;
		System.out.println(number); // 15
		
		number -= 5;
		System.out.println(number); // 10
		
		number *= 6;
		System.out.println(number); // 60
		
		number /= 3;
		System.out.println(number); // 20
		
		number %= 3;
		System.out.println(number); // 2
		
		str += " World!";
		System.out.println(str); // Hello World!
		
		
	}
	
	
	
}
