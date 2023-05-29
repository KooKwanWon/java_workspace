package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;
import com.kh.practice.model.Circle;
import com.kh.practice.model.Point;
import com.kh.practice.model.Rectangle;

public class Application {

	Scanner sc = new Scanner(System.in);

	CircleController cc = new CircleController();

	RectangleController rc = new RectangleController();

	Circle c = new Circle();
	
	Rectangle r = new Rectangle();
	
	Point p = new Point();
	
	public static void main(String[] args) {

				
		Application a = new Application();
		
		a.mainMenu();
		
		
		
	}

	public void mainMenu() {

		System.out.println("===== 메뉴 ====");
		System.out.println("1. 원 ");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int m = sc.nextInt();
		
		switch(m) {
		
		case 1 : circleMenu();
		break;
		case 2 : rectangleMenu();
		break;
		case 9 : System.out.println("종료합니다.");
		break;
		
		}
		
		
	}

	public void circleMenu() {
		
		System.out.println("===== 원 메뉴 ====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int cm = sc.nextInt();

		switch(cm) {
		
		case 1 : calcCircum();
		break;
		case 2 : calcCircleArea();
		break;
		case 9 : mainMenu();
		break;
		
		default :
			System.out.println("잘못입력하셨습니다.");
			mainMenu();
			
			break;
		}
		
	}

	public void rectangleMenu() {

		
		System.out.println("===== 사각형 메뉴 ====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int rm = sc.nextInt();
		
		switch(rm) {
		
		case 1 : calcPerimeter();
		break;
		
		case 2 : calcRectArea();
		break;
		
		case 9 : mainMenu();
		break;
		
		default :
			System.out.println("잘못입력하셨습니다.");
			mainMenu();
			
			break;
		}
	}

	public void calcCircum() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int r  = sc.nextInt();
		
		System.out.println(p.draw(x,y) + cc.calcCircum(x, y, r));

		mainMenu();

	}

	public void calcCircleArea() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int r  = sc.nextInt();
	
		System.out.println(p.draw(x,y) + cc.calcArea(x, y, r));

		mainMenu();
		
	}

	public void calcPerimeter() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int h  = sc.nextInt();
		
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		System.out.println(p.draw(x,y) + rc.calcPerimeter(x, y, h, w));

		mainMenu();
		
	}

	public void calcRectArea() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int h  = sc.nextInt();
		
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		System.out.println(p.draw(x,y) + rc.calcArea(x, y, h, w));

		mainMenu();
		
	}

}
