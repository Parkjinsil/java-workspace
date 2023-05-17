package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice(); // 클래스 만든거?
		cp.method1();
//		cp.method2();
	}
	
	public void method1() {

            Scanner sc = new Scanner(System.in);
		
            System.out.print("문자 : ");
	    String st = sc.nextLine();
	    
	    char ch1 = st.charAt(0);
	    int a = (int) ch1;
	    
	    char ch2 = (char) (a+1);
	    int b = (int) ch2;
	    
	    
	    System.out.println(ch1+" unicode : "+a);
	    System.out.println(ch2+" unicode : "+b);
		
	}
	
	public void method2() {
		
	    Scanner sc = new Scanner(System.in);
		
	    System.out.print("국어 : ");
	    int num1 = sc.nextInt();
	    
	    System.out.print("영어 : ");
	    int num2 = sc.nextInt();
	    
	    System.out.print("수학 : ");
	    int num3 = sc.nextInt();
	    
	    float aver = (num1 + num2 + num3)/3F;
	    
	    System.out.println("총점 : "+(num1 + num2 + num3));
	    System.out.printf("평균 : %.2f", aver);
	
		
	}
	
}
