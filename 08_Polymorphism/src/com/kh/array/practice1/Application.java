package com.kh.array.practice1;

import java.util.Arrays;

import com.kh.array.practice1.model.Student;

public class Application {

	public static void main(String[] args) {
		
		// 객체 배열
		Student[] stuArr = new Student[5];
		
		stuArr[0] = new Student ("김길동", "자바", 100);
		stuArr[1] = new Student ("박길동", "디비", 100);
		stuArr[2] = new Student ("이길동", "화면", 100);
		stuArr[3] = new Student ("정길동", "서버", 100);
		stuArr[4] = new Student ("홍길동", "디비", 100);
		
		System.out.println(stuArr);
		System.out.println(Arrays.toString(stuArr));
		
		System.out.println();
		
		//for문으로 하나씩 하나씩
		
		for(Student student : stuArr) { //향상된 for문
			System.out.println(student);
		}
	}

}
