package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
//		cp.method1();
		cp.method2();
	}
	
	public void method1() {

            Scanner sc = new Scanner(System.in);
		
            System.out.print("문자 : ");
	    String st = sc.nextLine();
	    
	    char ch = st.charAt(0);
	    int a = ch;
	    
	    System.out.println("A unicode : "+a);
	    System.out.println("B unicode : "+(a+1));
		
	}
	
	public void method2() {
		
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("국어 : ");
	    int num1 = sc.nextInt();
	    
	    System.out.println("영어 : ");
	    int num2 = sc.nextInt();
	    
	    System.out.println("수학 : ");
	    int num3 = sc.nextInt();
	    
	    float aver = (num1 + num2 + num3)/3F;
	    
	    System.out.println("총점 : "+(num1 + num2 + num3));
	    System.out.printf("평균 : %.2f", aver);
	
		
	}
	
}
