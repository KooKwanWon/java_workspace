package com.kh.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.list.model.Person;

public class A_ArrayList {

	public static void main(String[] args) {

		A_ArrayList a = new A_ArrayList();

		a.method2();
	}

	public void method1() {

		List list = new ArrayList();

		list.add("김민소");
		list.add("김민수");
		list.add("김준우");
		list.add("김준영");
		list.add("박주영");

		System.out.println(list);
	}

	public void method2() {

		ArrayList<Person> list = new ArrayList();
//		1. add(E e) : 리스트 끝에 추가
		list.add(new Person("전현무", "삼성동", 45));
		list.add(new Person("남궁민", "서울숲", 45));
		list.add(new Person("이시언", "상도", 40));
		list.add(new Person("이제훈", "서울숲", 38)); // list.add(new 어레이명 (매개변수))

//		 2. add(int index, E e) : 인덱스를 지정하며 해당 인덱스에 추가

		list.add(1, new Person("유재석", "압구정", 50));
		list.add(3, new Person("강호동", "압구정", 52));

//		 3. set(int index , E e) : 해당 인덱스의 값을 변경
		list.set(3, new Person("오은영", "강남", 57)); // 수정의 느낌

//		System.out.println(list);
//		System.out.println(list.size()+"명");
//		System.out.println();
//		
//		list.remove(1);								//삭제
//		System.out.println(list.remove(0) + "삭제");
//		System.out.println(list);
//		System.out.println(list.size()+"명");
//		System.out.println();
//		
//		System.out.println(list.get(0));			//0번째 호출
//		
//		List sub = list.subList(0, 2);				//0번째 2번째 추출 후 배열로
//		System.out.println(sub);
//	
//		list.addAll(sub);							//교체 x 더하는 것
//		System.out.println(list);
//		
//		
//		System.out.println(list.isEmpty()); 		//리스트가 비어 있는지 확인
		
		

		// 리스트에 저장된 사람들의 평균 연령을 출력

		// 저장된 사람들의 이름만 출력

		// 서울숲에 사는 사람들만 출력
		int sum = 0;

		for (int i = 0; i < list.size(); i++) {

			sum += (int) list.get(i).getAge();

		}
		System.out.println(sum / list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i).getName());
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getAddr().equals("서울숲")) {
				System.out.println(list.get(i));
			}
		}
		
		Collections.sort(list);					
		System.out.println(list);
		
//		list.clear();							//리스트 삭제
//		System.out.println(list.isEmpty());
//		System.out.println(list);
	}

	public void method3() {
		
		List<String> list = new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		System.out.println(list.indexOf("apple")); //몇 번째에 들어 있는지
		
		
		Collections.sort(list);					//오름차순
		System.out.println(list);
		
		Collections.reverse(list);				//반대로 뒤집는 메서드
		System.out.println(list);
		
		
		
	}
	
}
