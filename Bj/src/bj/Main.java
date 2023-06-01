package bj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int axis = 0;

		int a = Integer.parseInt(sc.nextLine());

		int[] num = new int[a];

		for (int i = 0; i < a; i++) {
			num[i] = (String) sc.nextLine();
		}
		System.out.println(Arrays.toString(num));

//		for (int i = 0; i < a; i++) {
//			int x = (int) num[i].charAt(0);
//			int y = (int) num[i].charAt(2);
//
//			if (x > 0 && y > 0) {
//				q1++;
//			} else if (x > 0 && y < 0) {
//				q2++;
//			}
//			else if (x < 0 && y < 0) {
//				q3++;
//			}
//			else if (x < 0 && y > 0) {
//				q4++;
//			}
//			else {
//				axis++;
//			}
//		}
//		System.out.println("Q1:" + q1);
//		System.out.println("Q2:" + q2);
//		System.out.println("Q3:" + q3);
//		System.out.println("Q4:" + q4);
//		System.out.println("AXIS:" + axis);
	}
}