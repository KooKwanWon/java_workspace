package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int a = Integer.parseInt(sc.nextLine());

		String[] score = new String[a];
		int[] last = new int[a];

		for (int i = 0; i < a; i++) {
			score[i] = sc.nextLine();
		}
//		
		for(int l = 0; l < a; l++) {
			int sum = 0;
		for (int j = 0; j < score[0].length(); j++) {

			if (score[l].charAt(j) == 'O') {
				sum++;
						
				if (j!=0 && score[l].charAt(j-1) == 'O') {
					sum++; 
				}
				else if(j==0) {
					sum++; 
				}
			
			} 
			else if (score[l].charAt(j) == 'X') {
				sum += 0;
			}
			last[l] = sum;
		}
		
		}
		for (int l = 0; l < last.length; l++) {
			System.out.println(last[l]);
		}
		
	}
}