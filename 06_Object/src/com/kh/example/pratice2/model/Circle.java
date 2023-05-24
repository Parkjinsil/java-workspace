package com.kh.example.pratice2.model;

public class Circle {

	public final static double PI = 3.14; 
	// 고정값 상수는 앞에 final붙이고 대문자로 표기
	// 여기저기 쓰일 수 있게 static 붙여주기
	public int radius = 1;
	
	public void incrementRadius() {
		radius++;
	}
}
