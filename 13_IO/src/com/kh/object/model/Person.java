package com.kh.object.model;

import java.io.Serializable;

// 객체를 직렬화로 통과하려면 받드시 implements Serializable
public class Person implements Serializable{
	private String name;
	private int age;
	private String id;
	public Person() {
	}
	public Person(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	
}
