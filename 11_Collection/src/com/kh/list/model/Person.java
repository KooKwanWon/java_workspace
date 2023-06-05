package com.kh.list.model;

public class Person implements Comparable<Person>{

	private String name;
	private String addr;
	private int age;
	
	public Person() {
	}

	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	
	//compareTo() 비교해서 자신이 크다면 1 작다면 -1 같다면 0
	//나이 순서대로 출력, 이름 순으로 출력
	@Override
	public int compareTo(Person o) {
//		return this.age == o.age ? 0 : this.age > o.age ? 1 : -1;
		return this.name.compareTo(o.name);
	}
	
	
	
}
