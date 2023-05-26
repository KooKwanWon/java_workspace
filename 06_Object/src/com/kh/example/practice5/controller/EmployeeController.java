package com.kh.example.practice5.controller;


import java.util.Scanner;

import com.kh.example.practice5.model.Employee;

public class EmployeeController {

	private Employee employee = new Employee();
	
	public EmployeeController() {}
	
	Scanner sc = new Scanner(System.in);
		
	public void add(int empNo, String name, char gender, String phone) {
		
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
	}
		
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {

		add(empNo, name, gender, phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
	}
	
	
	public void modify(String phone) {
					
		employee.setPhone(phone);
	}
	
	
	public void modify(int salary) {
		
		employee.setSalary(salary);
	}
	
	
	public void modify(double bonus) {
	
		employee.setBonus(bonus);
		
	}
	
	public Employee info() {
		
		return employee;
	}
	
}
