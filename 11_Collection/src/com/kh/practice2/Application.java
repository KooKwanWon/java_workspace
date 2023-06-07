package com.kh.practice2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		boolean same = true;
		long num = 0;
		for (int i = 0; set.size() < 6; i++) {
			int a = (int) (Math.random() * 45) + 1;
			set.add(a);
		}
		while (same) {
			num++;
			set2.clear();
			for (int i = 0; set2.size() < 6; i++) {
				int a = (int) (Math.random() * 45) + 1;
				set2.add(a);
			}
			System.out.println("로또번호 : " + set);
			System.out.println("내 번호 : " + set2);
			System.out.println("횟수 : " + num);
			if (set.equals(set2)) {
				same = false;
				break;
			}
		}
		System.out.println("비용 : " + num * 1000);
	}
}