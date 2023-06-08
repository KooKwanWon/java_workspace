package com.kh.map;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
public class B_Properties {
	/*
	 * Properties *(DB(데이터베이스)에서 사용한다.)*
	 * - HashMap 구버전인 Hashtable(Object, Object)을 상속받아 구현한 것
	 * - Properties는 (String, String) 형태로 단순환된 컬렉션 클래스
	 * - 주로 환경설정과 관련된 속성(property)를 저장하는데 사용
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
		B_Properties b = new B_Properties();
//		b.method1();
		b.method2();
	}
	
	public void method1() {
		Properties prop = System.getProperties();
		
		// prop에 저장된 요소들을 Enumeration을 이용해서 출력
		// 컬렉션 프레임워크 이전 구버전이므로 Iterator가 아닌 Enumeration
		
		Enumeration en = prop.propertyNames(); // Iterator와 같음
		
		while(en.hasMoreElements()) { // hasnext()와 같음
			String key = (String)en.nextElement();	// next()와 같음
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
	
	public void method2() {
		Properties prop = new Properties();
		
		// 순서 유지 X, 키값 중복 X
		// prop에 키와 값(key, value) 저장
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Stack", "값이 없음"));
		
		
		Set<Entry<Object, Object>>entrySet = prop.entrySet();
		Iterator<Entry<Object, Object>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}
}