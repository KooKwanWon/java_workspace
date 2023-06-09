package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.kh.model.Student;

public class A_Filtering {

	public static void main(String[] args) {

		A_Filtering a = new A_Filtering();
		
		a.method2();
		
	}

	public void method1() {
		List<String> names = Arrays.asList("가", "가", "나", "다", "라", "마");
		Stream<String> stream = names.stream();
		
		stream.distinct().forEach(name -> System.out.println(name));
		
		List<Student> students = Arrays.asList(
				new Student("가", 8, "남자", 80, 50),
				new Student("나", 10, "남자", 60, 50), 
				new Student("다", 8, "여자", 80, 50), 
				new Student("라", 13, "남자", 80, 90), 
				new Student("마", 15, "여자", 76, 100), 
				new Student("가", 8, "남자", 80, 70)); 
				
		students.stream().distinct().forEach(name -> System.out.println(name));
		
	}
	
	public void method2() {
	
		List<String> names = Arrays.asList("가나", "가다", "가나", "나라", "다라", "라가", "마바");

		names.stream().distinct().filter(name -> name.startsWith("가"))
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		List<Student> students = Arrays.asList(
				new Student("가", 8, "남자", 80, 50),
				new Student("나", 10, "남자", 60, 50), 
				new Student("다", 8, "여자", 80, 50), 
				new Student("라", 13, "남자", 80, 90), 
				new Student("마", 15, "여자", 76, 100), 
				new Student("가", 8, "남자", 80, 70)); 
		students.stream().distinct()
		.filter(student -> student.getGender().equals("여자"))
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		students.stream().distinct()
		.filter(student -> student.getMath()>= 70 && student.getEnglish()>= 80)
		.forEach(name -> System.out.println(name));
	}
//	수학 점수 70점 이상, 영어 점수는 80점 이상
	
	
}
