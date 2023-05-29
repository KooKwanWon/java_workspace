package com.kh.composite;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * -상속 관계 : ~은 ~이다. (is-a)
 * -포함 관계 : ~은 ~을 가지고 있다. (has-a)
 * -자바는 단일상속만 허용
 * -클래스 간의 관계를 많이 맺을수록 재사용을 높이고 관리하기 쉽다.
 * */

//포함관계를 사용하면 객체지향 설계 원칙을 따르고, 코드의 재사용성과 유연성을 높일 수 있다. 
//또한, 객체 간의 관계를 명확하게 표현하고 다형성을 활용하여 코드의 가독성과 확장성을 향상시킬 수 있다.

public class Customer extends Object{

	protected String name;
	protected String grade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	Product product; // 포함관계
	
	
	public Customer() {
	}


	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER"; // 기본 등급
	
		this.bonusRatio = 0.01; // 기본 적립 비율
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public double getBonusRatio() {
		return bonusRatio;
	}


	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	
	@Override //<-애노테이션! '이 메서드는 재정의된 메서드이다.' 라고 컴파일러에 명확히 알려주는 역할
	public boolean equals(Object obj) {
		Customer c = (Customer) obj; //다형성!
		return this.name == c.name;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint + ", bonusRatio="
				+ bonusRatio + "]";
	}
	
	
}
