package com.kh.practice2.model;

public class Circle {

	public int radius = 1;
	final double PI = 3.14;

	public double length() {

		return (2 * PI * radius);
	}

	public double area() {

		return (PI * radius * radius);
	}

	public void incrementRadius() {

		++radius;
	}
}
