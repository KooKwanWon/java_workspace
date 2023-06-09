package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.model.Student;

public class B_Sorted {
	/*
	 * 정렬 스트림은 최종 처리가 되기 전 중간 단계에서 요소들을 정렬해서 최종 처리 순서를 변경할 수 있다. Stream<T>은 요소 객체가
	 * Comparable 인터페이스를 구현해야 정렬할 수 있다. IntStream, DoubleStream, LongStream은 요소를 오름차
	 * 순으로 정렬한다.
	 */

	public static void main(String[] args) {
		B_Sorted b = new B_Sorted();
		b.method1();
		b.method2();
		b.method3();
		b.method4();
		b.method5();
		b.method6();
	}

	public void method1() {
		// 요소가 기본 자료형일때

		// 오름차순
		Arrays.stream(new int[] { 3, 5, 1, 2, 4 }).sorted().forEach(value -> System.out.println(value));

		// 내림차순
		Arrays.stream(new int[] { 3, 5, 1, 2, 4 }).boxed().sorted(Comparator.reverseOrder())
				.forEach(value -> System.out.println(value));
	}

	public void method2() {
		List<String> names = Arrays.asList("김민수", "구관원", "임지우", "박승환");
		names.stream().sorted().forEach(name -> System.out.println(name));
		System.out.println();
		names.stream().sorted(Comparator.reverseOrder()).forEach(name -> System.out.println(name));
		System.out.println();

		List<Student> students = Arrays.asList(
				new Student("김민수", 18, "남자", 80, 70),
				new Student("구관원", 12, "남자", 90, 50), 
				new Student("임지우", 16, "여자", 80, 90),
				new Student("박승환", 11, "남자", 70, 100));
		
		students.stream().sorted().forEach(value -> System.out.println(value));

	}

	public void method3() {

	}

	public void method4() {

	}

	public void method5() {

	}

	public void method6() {

	}
}