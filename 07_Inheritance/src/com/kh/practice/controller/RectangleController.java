package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width){
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int area = r.getHeight()*r.getWidth();
		
		return "너비 : " + "너비 : " + r.getWidth() + ", 높이 : " + r.getHeight() +" / "+ area;
						
	}
	
	public String calcPerimeter(int x, int y, int height, int width){
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int perimeter = 2*(r.getHeight()+r.getWidth());
		
		return "둘레 : " + " 너비 : " + r.getWidth() + ", 높이 : " +  r.getHeight() +" / "+ perimeter;
	}
	
	
	
}
