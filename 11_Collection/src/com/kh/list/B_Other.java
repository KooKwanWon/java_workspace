package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {

	public static void main(String[] args) {
		B_Other b = new B_Other();
		b.method3();
	}
	
	// Vector
	public void method1() {
		Vector v = new Vector();
		v.add(0);
		v.add(1);
		v.trimToSize();					//capacity 사이즈 맞추기
		
		v.add(3);
		v.add(4);
		v.ensureCapacity(5);			
		v.setSize(10);
		
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity()); //미리 만들어 놓은 공간의 크기
		
	}
	
	public void method2() {
		
		Stack s = new Stack();
		
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();					//마지막꺼 뺌 //3이 빠져나감
		s.push(4);
		s.pop();					//마지막꺼 뺌 //4가 빠져나감
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop();					//마지막꺼 뺌 //7이 빠져나감
		
		System.out.println(s);
	}
	
	public void method3() {
		
		Queue q = new LinkedList();
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll();			//0이 빠져나감
		q.add(4);
		q.remove();			//1이 빠져나감
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove();			//2가 빠져나감
		
		System.out.println(q);
	}
	
	
}
