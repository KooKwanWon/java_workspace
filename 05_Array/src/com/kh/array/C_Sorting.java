package com.kh.array;

import java.util.Arrays;
import java.util.Collections;

public class C_Sorting {

	public void method1() {

//		//1. 오름차순 정렬 (작>>큰)
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[]copy = arr.clone();
				
//		//2. 내림차순 정렬
		for (int i = 0; i < copy.length; i++) {
			copy[(arr.length-1)-i] = arr[i];
			}
		System.out.println(Arrays.toString(copy));

	}

	public void method2() {

		String[] arr = { "사과", "orange", "배", "banana", "Lemon" };

		// 오름차순 정렬(영어 대문자 - 소문자 - 한글 순으로 정렬)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		String[]copy = arr.clone();
//		// 내림차순 정렬
//		for (int i = 0; i < copy.length; i++) {
//			copy[(arr.length-1)-i] = arr[i];
//			}
//		System.out.println(Arrays.toString(copy));
		
		Arrays.sort(arr, Collections.reverseOrder());
		
	}

	public void method3() {

		int[] arr = { 79, 88, 91, 44, 100, 55, 95 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] copy = arr.clone();
		
		System.out.println(copy[copy.length-1]);
		
		for (int i = 0; i < copy.length; i++) {
			copy[(arr.length - 1) - i] = arr[i];
		}
		System.out.println(Arrays.toString(copy));
		System.out.println(copy[copy.length-1]);

	}
	
	/*
	 * 선택정렬(selection sort)
	 * -가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, 그다음 작은 데이터를 선택해 앞에서 두번째 데이터와 바꾸는 과정을 반복
	 * -배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
	 * -데이터 양이 적을 때 좋음!
	 *  하지만 100개 이상의 자료에서는 급격한 속도 저하
	 * 
	 * 7, 5, 9, 0, 3, 1, 6, 2, 4, 8
	 * 0, 7, 5, 9, 3, 1, 6, 2, 4, 8
	 * 0, 1, 7, 5, 9, 3, 6, 2, 4, 8
	 * 0, 1, 2, 7, 5, 9, 3, 6, 4, 8
	 * ....
	 * 
	 * 
	 * 
	 * */
	public void method4() {
		
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		//비교주체 비교대상
		// i = 0 j = 1~9
		// i = 1 j = 2~9
		
		//1. 비교주체
		for(int i = 0 ; i < arr.length; i++) {
			
			//2.비교대상
			for(int j = i+1 ; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	// 삽입정렬 
	// 동작 원리는 직관적, 선택 정렬에 비해서는 구현난이도가 높음
	// 필요할 때만 위치를 바꾸므로 '데이터가 거의 정렬되어 있을 때' 효율적
	//	7, 5, 9, 0, 3, 1, 6, 2, 4, 8
	//	7, 5, 9, 0, 3, 1, 6, 2, 4, 8
	
	
	public void method5() {
		
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		//비교주체  비교대상
		// i = 0  x
		// i = 1  j = 0
		// i = 2  j = 0~1
		// i = 3  j = 0~2
		// i = 4  j = 0~3
		
		//1. 비교주체
		for(int i = 0 ; i < arr.length; i++) {
			
			//2.비교대상
			for(int j = 0 ; j < i; j++) {
				
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		System.out.println(Arrays.toString(arr));
		
	}
//	버블 정렬
//	인접한 두 수를 비교해서 큰 수를 뒤로 보내는 것이 특징
//	구현이 쉽다는 장점이 있지만 다른 정렬에 비해 속도가 느리며
//	역순으로 정렬할 때 가장 느린 속도를 가짐
//	7, 5, 9, 0, 3, 1, 6, 2, 4, 8
//	7, 5, 0, 3, 1, 6, 2, 4, 8, 9
//	5, 0, 3, 1, 6, 2, 4, 7, 8, 9
	
	public void method6() {

		
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int i = arr.length-1 ; i >= 0; i--) {
			
			//2.비교대상
			for(int j = 0 ; j < arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		C_Sorting c = new C_Sorting();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
		c.method6();
//		c.method7();

	}

}
