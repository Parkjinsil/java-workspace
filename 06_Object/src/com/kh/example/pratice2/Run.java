package com.kh.example.pratice2;

import com.kh.example.pratice2.model.Circle;

public class Run {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.incrementRadius();
		c.incrementRadius();
		
		// 원의 둘레
		System.out.println("원의 둘레 : "+2*Circle.PI*c.radius);
		
		// 원의 넓이
		System.out.println("원의 넓이 : "+c.radius*c.radius*Circle.PI);
		
	}

}
