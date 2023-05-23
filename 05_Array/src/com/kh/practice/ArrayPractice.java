package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayPractice ap = new ArrayPractice();
//		ap.method1();
//		ap.method2();
//		ap.method3();
		ap.method4();
//		ap.method5();
		
	}
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * */
	public void method1() {
		
		String[] fruit = new String[] {"사과","바나나","포도","딸기","체리"};
		System.out.println(fruit[4]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		
		System.out.print("정수 : ");
		int index = sc.nextInt();
		int[] arr = new int[index];
		int j=0;
		int sum=0;
		
		for(int i=0; i<arr.length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			j = sc.nextInt();
			arr[i]=j;
			sum +=j;
		}
		System.out.println(Arrays.toString(arr));
	    System.out.println(j);
		
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		
		String[] menu = {"치킨","피자","마라탕","햄버거"};
		
		System.out.print("메뉴 : ");
		String a = sc.nextLine();
		
		for(int i=0; i<menu.length;) {
			if(menu[i].equals(a)) {
				System.out.println("배달 가능"); break;
			}
			else {
				if (i==menu.length-1) {
					System.out.println("배달 불가능"); break;
				}
				else i++;
			}
		}
		
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		int[] number = new int[13];
		System.out.print("주민등록번호 : ");
		String a = sc.nextLine();
		
		for (int i=0; i<13; i++) {
			number[i]= a.charAt(i);
		}
		
		int[] copy = number.clone();
		for(int j=8; j<13; j++) {
//			copy[j]= "*";
		}
			
		for(int k : copy) {
			System.out.print(k);
		}
		
		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();
		char[] array = new char [word.length()];
		
		for(int i=0; i<word.length(); i++) {
		    array[i] = word.charAt(i);
			}
		for(int j=word.length()-1; j>=0; j--) {
			System.out.print(array[j]);
		}
		
	}
	
}
