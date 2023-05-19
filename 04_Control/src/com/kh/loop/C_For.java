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
	 * - 주어진 횟수만큼 코드를 반봅 실행하는 구문 - 초기식은 반복문이 수행될 떄 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될
	 * 변수를 선언하고 초기값을 대입한다. - 조건식의 결과가 false이면 실행코드를 수행하지 않고 반복문을 빠져나간다. - 증감식은 반복문을
	 * 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 * 
	 */

	// 1~5 출력
	public void method1() {

		for (int i = 0; i < 5; i++) {

			System.out.println(i + 1);
		}

	}

	/*
	 * 5 4 3 2 1 출력
	 */
	public void method2() {

		for (int i = 5; i > 0; i--) {

			System.out.println(i);
		}
	}

	/*
	 * 1~10사이 홀수만 출력
	 */
	public void method3() {

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	/*
	 * contiue문
	 *
	 * - continue문은 반복문 안에서 사용 - 반복문 안에서 continue문을 만나게 되면 "현재 구문"을 종료 - 반복문을 벗어나는 건
	 * 아님! 다음 반복을 계속 수행
	 */
	// 1~10 사이의 짝수만 출력
	public void method4() {

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1)
				continue;
			System.out.println(i);
		}
	}

	// 1~10까지의 합계
	public void method5() {

		// 1+2+3+4+5+6+7+8+9+10
		int a = 0;

		for (int i = 1; i < 11; i++) {
			a += i;
			System.out.println("1부터" + i + "까지의 합계 : " + a);
		}
		System.out.println(a);

	}

	// 1부터 사용자가 입력한 수까지의 합계
	public void method6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 :");
		int a = sc.nextInt();

		int sum = 0;

		for (int i = 1; i < a + 1; i++) {
			sum += i;
			System.out.println("1부터 " + i + " 까지의 합계 : " + sum);
		}
		System.out.println(sum);

	}

	// 1부터 랜덤값까지의 합계
	/*
	 * java.lang.Math 클래스에서 제공하는 random() 메소드 매번 다른 랜덤값을 얻어 낼 수 있음!
	 */
	public void method7() {

//		double random = Math.random();
//		System.out.println(random); //0.0 <= random < 1.0
//		
//		random = Math.random() * 10;
//		System.out.println(random); //0.0 <= random < 10.0
//		
//		random = Math.random() * 10 + 1;
//		System.out.println(random); //1.0 <= random < 11.0
//		
//		int num = (int) random;
//		System.out.println(num);

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 :");
		int a = sc.nextInt();

		int sum = 0;

		for (int i = 1; i < a + 1; i++) {
			sum += i;
			System.out.println("1부터 " + i + " 까지의 합계 : " + sum);
		}
		System.out.println(sum);

	}

	/*
	 * H e l l o
	 */
	public void method8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		String a = sc.nextLine();

		int length = a.length();

		for (int i = 0; i < length; i++) {
			System.out.println(a.charAt(i));
		}
	}

	public void method9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		System.out.print("시간 : ");
		int num3 = sc.nextInt();

		int sum = num1 * 60 + num2 + num3;

		if (sum / 60 >= 24)
			System.out.print((sum / 60 - 24) + " " + sum % 60);
		else
			System.out.print((sum / 60) + " " + sum % 60);

	}

	// 구구단
	public void method10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("구구단 몇 단? (2~9) > ");
		int num1 = sc.nextInt();

		if (num1 > 1 && num1 < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num1 + " x " + i + " = " + num1 * i);
			}
		} else
			System.out.println("잘못 입력하셨습니다.");

	}

	// 2~9단 출력
	public void method11() {
			
		for (int num1 = 2; num1 < 10; num1++) {
			System.out.println("--"+num1+"단--");
			for (int i = 1; i < 10; i++) 
				System.out.println(num1 + " x " + i + " = " + num1 * i);
		}
	}
	// ****
	// ****
	// ****
	// ****
	public void method12() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("행 > ");
		int num1 = sc.nextInt();
		System.out.print("열 > ");
		int num2 = sc.nextInt();
		
		
		for (int i = 0; i < num2; i++) {
			System.out.println();
			for (int j = 0; j < num1; j++)
				System.out.print("*");
		}	
		
	}
	// 1***
	// *2**
	// **3*
	// ***4
	public void method13() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("행 > ");
		int num1 = sc.nextInt();
		System.out.print("열 > ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i < num2 + 1; i++) {
			System.out.println();
			for (int j = 1; j < num1 + 1; j++)
				if(j == i)
					System.out.print(i);
				else
					System.out.print("*");
		}
	}
	/*
	 *  *
	 *  **
	 *  ***
	 *  ****
	 * */
	public void method14() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("행 > ");
		int num1 = sc.nextInt();
		System.out.print("열 > ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i < num2 + 1; i++) {
			System.out.println();
			for (int j = 1; j < num1 + 1; j++)
				if(j > i)
					System.out.print("");
				else
					System.out.print("*");
		}
	}
	/*
	 *    *
	 *   **
	 *  ***
	 * **** 
	 *  
	 * */
	public void method15() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("행 > ");
		int num1 = sc.nextInt();
		System.out.print("열 > ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i < num2 + 1; i++) {
			System.out.println();
			for (int j = 1; j < num1 + 1; j++)
				if(j > num1-i)
					System.out.print("*");
				else
					System.out.print(" ");
		}
	}
	
	

	
	public static void main(String[] args) {

		C_For c = new C_For();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
//		c.method6();
//		c.method7();
//		c.method8();
//		c.method9();
//		c.method10();
//		c.method11();
//		c.method12();
//		c.method13();
//		c.method14();
		c.method15();
	
		


	}

}
