package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.Controller.CircleController;
import com.kh.practice.Controller.RectangleController;
import com.kh.practice.model.Circle;

public class Application {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	static Application a = new Application();
	
	public static void main(String[] args) {
		
		a.mainMenu();
	}

	public void mainMenu() {
		boolean check = true;
		while(check) {
			System.out.println("===== 메뉴 =====\n"
					+ "1. 원\n"
					+ "2. 사각형\n"
					+ "9. 끝내기");
			System.out.printf("메뉴 번호 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : 
				a.circleMenu(); break;
			case 2 :
				a.rectangleMenu(); break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				check = false; break;
			}
			
		}
	}
	
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====\n"
				+ "1. 원 둘레\n"
				+ "2. 원 넓이\n"
				+ "9. 메인으로");
		System.out.printf("메뉴 번호 : ");
		int menu1 = sc.nextInt();
		switch(menu1) {
		case 1: a.calcCircum(); break;
		case 2: a.calcCircleArea(); break;
		case 9:  break;
		}
		
	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====\n"
				+ "1. 사각형 둘레\n"
				+ "2. 사각형 넓이\n"
				+ "9. 메인으로");
		System.out.printf("메뉴 번호 : ");
		int menu2 = sc.nextInt();
		switch(menu2) {
		case 1 : a.calcPerimeter(); break;
		case 2 : a.calcRectArea(); break;
		case 9 : break;
		}
	}
	
	public void calcCircum() {
		System.out.printf("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.printf("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.printf("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.printf("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.printf("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.printf("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.printf("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.printf("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.printf("높이 : ");
		int height = sc.nextInt();
		
		System.out.printf("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.printf("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.printf("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.printf("높이 : ");
		int height = sc.nextInt();
		
		System.out.printf("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
