package com.kh.practice1;

import java.util.Scanner;

import com.kh.practice1.model.Member;

public class Run {

	public static void main(String[] args) {

		Member m = new Member();
		Scanner sc = new Scanner(System.in);
		
		System.out.println( m.memberId);
		System.out.println(m.memberPwd);
		System.out.println(m.memberName);
		System.out.println(m.age);
		System.out.println(m.gender);
		System.out.println(m.phone);
		System.out.println(m.email);
				
		System.out.print("변경할 이름은 : " );
		String newName = sc.nextLine();
		
		m.changeName(newName);
				
		m.printName();
	}

}
