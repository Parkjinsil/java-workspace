package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

//	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

//		Snack s = new Snack();
		SnackController scr = new SnackController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.printf("종류 : ");
		String kind = sc.nextLine();
//		s.setKind(sc.nextLine());
		
		System.out.printf("이름 : ");
		String name = sc.nextLine();
//		s.setName(sc.nextLine());
		
		System.out.printf("맛 : ");
		String flavor = sc.nextLine();
//		s.setFlavor(sc.nextLine());
		
		System.out.printf("개수 : ");
		int numOf = sc.nextInt();
//		s.setNumOf(sc.nextInt());
		
		System.out.printf("가격 : ");
		int price = sc.nextInt();
//		s.setPrice(sc.nextInt());
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		scr.saveData(s);
		if(scr.saveData(s)) {
			System.out.println("저장 완료되었습니다.");
			System.out.println(scr.confirmData());
		}
		
//		System.out.println("저장 완료되었습니다."); 
//		System.out.println(scr.confirmData());
//		System.out.print(s);
		
	}

}
