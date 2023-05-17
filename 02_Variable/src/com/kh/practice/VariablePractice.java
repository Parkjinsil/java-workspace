package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름

	public static void main(String[] args) {
		 
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차 곱, 나누기한 몫을 출력하세요.
		//(메서드 만들고 클래스에서 메서드 호출해서 풀기)
		VariablePractice vp = new VariablePractice();
//		vp.method1();
//		vp.method2();
		vp.method3();
//		vp.method4();
	}
	
	public void method1() {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+ (num1 + num2));
		System.out.println("빼기 결과 : "+ (num1 - num2));
		System.out.println("곱하기 결과 : "+ (num1 * num2));
		System.out.println("나누기 몫 결과 : "+ (num1 / num2));

/*		System.out.printf("더하기 결과 : %d\n", num1+num2);
		System.out.printf("빼기 결과 : %d\n", num1-num2);
		System.out.printf("곱하기 결과 : %d\n", num1*num2);
		System.out.printf("나누기 몫 결과 : %d", num1/num2);
		
		*/
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 10000;
		int b = 7000;
		System.out.print("성인 수 :");
		int num3= sc.nextInt();
		
		System.out.print("청소년 수 :");
		int num4= sc.nextInt();
		
		System.out.println("성인 "+num3+"명 : "+a * num3+"원");
		System.out.println("청소년 "+num4+"명 : "+b * num4+"원");
		System.out.println("총 금액 : "+(a* num3 + b* num4)+"원");
		
	}
	
	public void method3() {
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		int d = x;
		x=y;
		y=z;
		z=d;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
				
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요.  : ");
		String st = sc.nextLine();
		
		char fir1 = st.charAt(0);
		int len = st.length();
		char fir2 = st.charAt(len-1);
		
		
		System.out.println("첫 번째 문자 : "+fir1);
		System.out.println("마지막 문자 : "+fir2);
	}
}









