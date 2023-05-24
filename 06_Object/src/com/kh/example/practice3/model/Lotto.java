package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

	int[] lotto;

	int[] win = { 3, 24, 5, 43, 30, 15 };

	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;

	

	public String information() {

		boolean ox = true;
		
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int number = (int) (Math.random() * 45 + 1);
			lotto[i] = number;
			
			for (int j = 0; j < i ; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
				
		return Arrays.toString(lotto);
	}




//	public static String information2() {
//        int[] lotto = new int[6];
//
//        for (int i = 0; i < lotto.length; i++) {
//            int number = (int) (Math.random() * 45 + 1);
//            lotto[i] = number;
//        }
//
//        boolean hasDuplicates = checkDuplicates(lotto);
//
//        while (hasDuplicates) {
//            for (int i = 0; i < lotto.length; i++) {
//                int number = (int) (Math.random() * 45 + 1);
//                lotto[i] = number;
//            }
//            hasDuplicates = checkDuplicates(lotto);
//        }
//
//        return Arrays.toString(lotto);
//    }
//
//    public static boolean checkDuplicates(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return true; // 중복된 숫자가 있음
//                }
//            }
//        }
//        return false; // 중복된 숫자가 없음
//    }
}
