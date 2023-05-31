package com.kh.polymorphism.controller;

import com.kh.polymorphism.Application;
import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {

	static Employee emp = new Employee();
	static Engineer eng = new Engineer();
	static int engAnnualSalary;

	public Employee findEmployeeByName(Employee[] ea, String name) {

		emp = null;

		for (int i = 0; i < ea.length; i++) {

			if (ea[i].getName().equals(name)) {
				emp = ea[i];

			}

		}
		return emp;
	}

	// 연봉계산 엔지니어 보너스 있음
	public int getAnnualSalary(Employee e) {

		int sum = (int) e.getSalary() * 12;

		if (e instanceof Engineer) {
			Engineer eg = (Engineer) e; // Employee e를 (Engineer)로 형변환 //부모 -> 자식 : 강제형변환
			sum = (int) e.getSalary() * 12 + eg.getBonus();

			return sum;
		}

		return sum;
	}

	// 연봉합계
	public int getTotalCoast(Employee[] ea) {
		int total = 0;

		for (int j = 0; j < ea.length; j++) {
			total += getAnnualSalary(ea[j]);
		}

		return total;
	}

}
