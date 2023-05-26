package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;

public class Application {

	static Scanner sc = new Scanner(System.in);
	Employee viewEmployee = new Employee(); // 여기에선 굳이 사용안하고 풀었음
	EmployeeController employeeController = new EmployeeController();
	
	public static void main(String[] args) {
		
		Application a = new Application();
		
		for(int i=0;;i++) {
			int option = a.employeeMenu();
			
			if(option == 1) a.insertEmp();
			else if (option == 2) a.updateEmp();
			else if (option == 3) a.printEmp();
			else if (option == 9) System.out.println("프로그램을 종료합니다."); break;
		}
		
	}

	public int employeeMenu() {
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void insertEmp() {
		
		System.out.printf("사원 번호 : ");
		int empNo = sc.nextInt();
		
		System.out.printf("사원 이름 : ");
		String name = sc.next();
		
		System.out.printf("사원 성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.printf("전화 번호 : ");
		String phone = sc.next();
		
		employeeController.add(empNo, name, gender, phone);
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char answer = sc.next().charAt(0);
	
		if (answer == 'y') {
			System.out.printf("사원 부서 : ");
			String dept = sc.next();
			
			System.out.printf("사원 연봉 : ");
			int salary = sc.nextInt();
			
			System.out.printf("보너스 율 : ");
			double bonus = sc.nextDouble();
			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
		}
		
	}
	
	public void updateEmp() {
		for(int i=0;;i++) {
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화 번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.printf("메뉴 번호를 누르세요 : ");
			int menu1 = sc.nextInt();
			
			if (menu1 == 1) {
				System.out.printf("전화 번호 입력: ");
				employeeController.modify(sc.next());
				break;
			}
			else if (menu1 == 2) {
				System.out.printf("사원 연봉 입력: ");
				employeeController.modify(sc.nextInt());
				break;
			}
			else if (menu1 == 3) {
				System.out.printf("보너스 율 입력: ");
				employeeController.modify(sc.nextDouble());
				break;
			}
			else break;
		}
	    
	}
	
	public void printEmp() {
		System.out.println(employeeController.info());
	}
}



















