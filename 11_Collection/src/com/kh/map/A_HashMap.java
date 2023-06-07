package com.kh.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.map.model.Snack;

//key value를 쌍으로 저장
//순서 없음
//중복 키 x,  값 o 

//HashMap
//Map 인터페이스를 구현한 대표적인 컬렉션 클래스

public class A_HashMap {

	public static void main(String[] args) {

		A_HashMap a = new A_HashMap();

		a.method1();
	}

	public void method1() {

		Map<String, Integer> map = new HashMap<>();

		map.put("빈 디젤", 90);
		map.put("제이슨 모모아", 100);
		map.put("미셸 로드리게즈", 85);
		map.put("제이슨 스타뎀", 90);

		System.out.println(map);

//		키만 가져오기 keySet()
		Set<String> key = map.keySet();
		System.out.println(key);

//		값만 가져오기 values()
		Collection<Integer> col = map.values();
		System.out.println(col);

		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name + " : " + map.get(name));
		}
		System.out.println();
//		entrySet()메서드
//		entrySet() 메서드는 맵 컬렉션에 있는 Entry 객체(키 밸류)를 Set 컬렉션에 담아서 반환

		Set<Entry<String, Integer>> ets = map.entrySet();

		for (Entry<String, Integer> entry : ets) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

//		총점 365
//		평균 91
//		최고점수 100
//		최저점수 85
		System.out.println();

		Map<String, Integer> score = new HashMap<>();

		int max = 0;
		int min = 100;
		int sum = 0;

		for (Integer entry : col) {
			sum += entry;
			if (entry > max) {
				max = entry;
			} else if (entry < min) {
				min = entry;
			}
		}
		int avr = sum / map.size();

		System.out.println(Collections.max(col));
		System.out.println(Collections.min(col));

		score.put("총점", sum);
		score.put("평균", avr);
		score.put("최고점수", max);
		score.put("최저점수", min);

		Set<Entry<String, Integer>> ets2 = score.entrySet();

		for (Entry<String, Integer> entry2 : ets2) {
			System.out.println(entry2.getKey() + " : " + entry2.getValue());
		}

//		Set<String> key2 = score.keySet();
//		System.out.println(key2);
//
//		System.out.println();

//		Iterator<String> a = key2.iterator();
//		while (a.hasNext()) {
//			String name = a.next();
//			System.out.println(name + " : " + score.get(name));
//		}
//		System.out.println();
	}

	public void method2() {

		Map<String, Snack> map = new HashMap<>();

		map.put("웨하스", new Snack("치즈", 240));
		map.put("웨하스", new Snack("딸기", 255));
		map.put("고래밥", new Snack("양념치킨", 173));
		map.put("자유시간", new Snack("아몬드", 232));
		map.put("칸쵸", new Snack("딸기 요거트", 880));
		map.put("홈런볼", new Snack("초코", 270));
		map.put("스윙칩", new Snack("볶음고추", 347));
		map.put("나쵸", new Snack("치즈", 486));
		map.put("꼬깔콘", new Snack("매콤달콤", 175));
		map.put("후렌치파이", new Snack("딸기", 900));

		System.out.println(map);
		System.out.println(map.size());

//		key에 해당하는 밸루값 가져오기
		Snack snack = map.get("웨하스");
		System.out.println(snack);

//		key값에 해당하는 Entry 객체 삭제
		map.remove("꼬깔콘");
		System.out.println(map);
		System.out.println();
		System.out.println("=============================");

		//		홈런볼에 해당하는 과자 정보 출력 
		Snack snack1 = map.get("홈런볼");
		System.out.println(snack1);

		//		후렌치파이의 맛 정보 출력
		Snack snack2 = map.get("후렌치파이");
		System.out.println(snack2.getFlavor());

		//		딸기가 들어간 과자들의 칼로리 평균
		Collection<Snack> snack3 = map.values();

		int sum = 0;
		int count = 0;
		for (Snack str : snack3) {
			if (str.getFlavor().contains("딸기")) {
				sum += str.getCalorie();
				count++;
			}
		}
		System.out.println(sum/count);

		System.out.println("=============================");

	}

}
