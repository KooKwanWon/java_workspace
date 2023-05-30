package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[30];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int j = 1; j < 29; j++) {
			int a = sc.nextInt();
			num[a - 1] = 0;
		}

		for (int z = 0; z < num.length; z++) {
			if (num[z] != 0) {
				System.out.println(num[z]);
			}
		}

	}
}
