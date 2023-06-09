package com.kh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 스트림(stream)
* - 다양한 데이터 소스를 표준화 된 방법으로 다루기 위한 것
*
*
*
* 스트림의 특징
*
* - 데이터를 읽기만 할 뿐 변경 X
* - Iterator처럼 일회용 (필요하면 다시 스트림 생성)
* - 내부 반복처리
*
*
* 스트림의 종류
*
* - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를
* 	 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
*
*
* Stream API
*
* - 스트림은 자바 8부터 추가된 기능으올 컬렉션(배열)의 저장 요소들을
* 	 하나씩 잠조해서 람다식으로 처리할 수 있도록 해주는 반복자
*
* - 내부 반복자를 사용해서 중간처리(intermediate), 최종처리(terminal) 작업을 수행
* 		- 중간 처리 : 반복, 매핑(타입변환), 필터링, 정렬 등
* 		- 최종 처리 : 반복, 카운팅, 평균, 총합 등의 집계 처리
*
* - 중간 처리와 최종 처리 메서드를 구분하는 방법은 리턴타입으로 알 수 있음
* 		- 리턴 타입이 Stream이라면 중간 처리 메서드
* 		- 리턴 타입이 기본 타입이거나, Optional 객체라면 최종 처리 메서드
*
* - 지연된 연산 : 최종 연산이 수행되기 전까지는 중간 연산이 수행되지 않는다.
*/

public class Create {

	public static void main(String[] args) {
		Create c = new Create();
		c.method3();
	}

	public void method1() {
		IntStream stream = IntStream.range(1, 10);
		int sum = stream.sum();
		System.out.println("ranged의 sum : " + sum);
	
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.sum();
		System.out.println("rangeClosed의 sum : " + sum);
		
	}
	
	public void method2() {
		
		String[] names = {"노석우", "장미르", "금미리", "김준우"};
		
//		Stream<String> stream = Arrays.stream(names);
		Stream<String> stream = Stream.of(names);
		stream.forEach(name -> System.out.println(name + ""));
		
	}
	
	public void method3() {
		List<String> names = Arrays.asList("김민소", "김종휘", "이지훈", "김지은");
		Stream<String> stream = names.stream();
		stream.forEach(name -> System.out.println(name));
	}
	
	
	
}
