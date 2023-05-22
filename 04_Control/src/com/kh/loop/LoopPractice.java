package com.kh.loop;

import java.util.Scanner;

class LoopPractice {

	/*
	 * 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오. 사용자 입력 : 5 5 4 3 2 1
	 */
	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자(1~100) : ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println(a - i);
		}
	}

	// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() {

		int sum = 0;

		for (int i = 1;; i++) {

			if (i % 2 == 1 && sum < 100) {
				sum += i;
			} else if (i % 2 == 0 && sum < 100) {
				sum -= i;
			} else {
				System.out.println(i - 1 + "까지 더 했을때 " + "합은 : " + sum);
				break;
			}
		}
	}

	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
	 * 
	 * 문자열 : banana 문자 : a banana 안에 포함된 a 개수 : 3
	 * 
	 */
	public void method3() {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int j = 0;

		System.out.print("문자열 : ");
		String word = sc.nextLine();
		System.out.print("문자 : ");
		char al = sc.next().charAt(0);

		for (i = 0; i < word.length(); i++) {
			if (al == word.charAt(i)) { // 오호~ 역시 잘하셨음! GOOD! 
				j++;
			}
		}
		System.out.println(word + " 안에 포함된 a 개수 : " + j);
	}

	/*
	 * 0이 나올 때까지 숫자를 출력하시오. (random 사용!) 7 3 4 2 3 4 0 (0~9)
	 */
	public void method4() {

		for (int i = 0;; i++) {

			double num = Math.random() * 10; // 요렇게 되면 0~9까지잖아요~~ 0~10까지라면? 

			if ((int) num != 0) {
				System.out.print((int) num);
			} else {
				System.out.print((int) num);
				break;
			}
		}
	}

	/*
	 * 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
	 * 
	 * 1 : 3 2 : 2 3 : 1 4 : 0 5 : 4 6 : 0
	 * 
	 */
	public void method5() {

		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;

		for (int i = 0; i < 10; i++) {

			int num = (int) ((Math.random() * 10 + 1) / 2 + 1); // 위에서 0~10까지를 해보면 여기 부분을 더 간편하게 바꿀 수 있어요~ 

			if (num == 1) {
				one++;
			} else if (num == 2) {
				two++;
			} else if (num == 3) {
				three++;
			} else if (num == 4) {
				four++;
			} else if (num == 5) {
				five++;
			} else if (num == 6) {
				six++;
			}
		}

		System.out.println(
				"1 : " + one + ", 2 : " + two + ", 3 : " + three + ", 4 : " + four + ", 5 : " + five + ", 6 : " + six);

	}

	/*
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 * 
	 * 
	 * 당신의 이름을 입력해주세요 : 가위바위보 : 가위 컴퓨터 : 가위 박신우 : 가위 비겼습니다.
	 * 
	 * 가위바위보 : 가위 컴퓨터 : 바위 박신우 : 가위 졌습니다 ㅠㅠ
	 * 
	 * 가위바위보 : 보 컴퓨터 : 바위 박신우 : 보 이겼습니다 !
	 */
	public void method6() {

		String rsp = "";
		int rsp_num = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
				
		while (true) {
			
			System.out.print("가위바위보 : ");
			rsp = sc.nextLine();
			
			int computer = (int)((Math.random() * 3) + 1); // 여기서는 하셨구만! 위에 문제 random 범위 꼭 지정해봐요!
			
			if (rsp.equals("바위")) {
				rsp_num = 1;
				
				if((rsp_num-computer) == -1) {
					System.out.println("컴퓨터 : 가위  " +name + " : "+ rsp + " 이겼습니다 !");
					a++;
					break;
				}
				else if((rsp_num-computer) == -2) {
					System.out.println("컴퓨터 : 보  " +name + " : "+ rsp + " 졌습니다 ㅠㅠ");
					b++;
				}
				else if((rsp_num-computer) == 0) {
					System.out.println("컴퓨터 : 바위  " +name + " : "+ rsp + " 비겼습니다.");
					c++;
				}
			} 
			
			else if (rsp.equals("가위")) {
				rsp_num = 2;
				
				if((rsp_num-computer) == -1) {
					System.out.println("컴퓨터 : 보  " +name + " : "+ rsp + " 이겼습니다 !");
					a++;
					break;
				}
				else if((rsp_num-computer) == 1) {
					System.out.println("컴퓨터 : 바위  " +name + " : "+ rsp + " 졌습니다 ㅠㅠ");
					b++;
				}
				else if((rsp_num-computer) == 0) {
					System.out.println("컴퓨터 : 가위  " +name + " : "+ rsp + " 비겼습니다.");
					c++;
				}
			} 
			
			else if (rsp.equals("보")) {
				rsp_num = 3;
				
				if((rsp_num-computer) == 2) {
					System.out.println("컴퓨터 : 바위  " +name + " : "+ rsp + " 이겼습니다 !");
					a++;
					break;
				}
				else if((rsp_num-computer) == 1) {
					System.out.println("컴퓨터 : 가위  " +name + " : "+ rsp + " 졌습니다 ㅠㅠ");
					b++;
				}
				else if((rsp_num-computer) == 0) {
					System.out.println("컴퓨터 : 보  " +name + " : "+ rsp + " 비겼습니다.");
					c++;
				}
			}
		}
		System.out.println("승 "+ a + "번, " +"패 "+ b + "번, " +"무승부 "+ c + "번");
	}

	public static void main(String[] args) {

		LoopPractice l = new LoopPractice();

//		l.method1();
//		l.method2();
//		l.method3();
//		l.method4();
//		l.method5();
		l.method6();
	}
}