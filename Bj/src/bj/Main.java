package bj;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 11; i++) {

			if (i < 6) {
				for (int j = 0; j < (11 - 2 * i) / 2; j++) {
					System.out.print(" ");
				}
				for (int l = 0; l < 2 * i + 1; l++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int a = 0; a < i -5; a++) {
					System.out.print(" ");
				}
				for (int b = 0; b <(21 - 2*i) ; b++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		
	}

}