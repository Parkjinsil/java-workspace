package com.kh.step4;

import com.kh.step4.model.Car;

public class Application {

	public static void main(String[] args) {

		/*
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		*/
		Car c1 = new Car("white", "auto", 4);
		Car c2 = new Car("Black", "manual");
		
		System.out.println(c1); // 참조변수라서 주소값 출력돼야하지만 객체는 자동으로 c1.toString()출력됨 
		System.out.println(c2);
	}
	
	/*
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드를 매개변수의 자료형과 개수, 순서가 다르게 작성되어야 함
	 * 오버로딩(Overloading)은 기존에 없던 새로운 메서드를 정의하는 것이고, 
	 * 오버라이딩(Overriding)은 상속 받은 메서드의 내용만 변경 하는 것이다.
	 */
	
	void test() {}
//	void test() {} 이건 안됨
	void test(int a) {}
	void test(int a, String s) {}
	void test(String s, int a) {}
	void test(int a, int b) {}
//	void test(int c, int d) {} // 오버로딩 안된거 (매개변수의 자료형의 개수와 순서가 다르게 작성되어야 함)
    
	void test(String s) {}
}
