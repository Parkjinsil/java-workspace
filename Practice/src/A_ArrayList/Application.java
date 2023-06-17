package A_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

import A_ArrayList.controller.MemberController;
import A_ArrayList.model.Member;

public class Application {

	Scanner sc = new Scanner(System.in);
    MemberController mc = new MemberController();
    
	public static void main(String[] args) {

		Application a = new Application();
		a.mainMenu();
		
	}

	public void mainMenu() {
		
		System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
		System.out.println("현재 등록된 회원수는 "+mc.count+"명입니다.");
		if(mc.count<3) {
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
		    System.out.print("메뉴 번호 : ");
		    int select = sc.nextInt();
		    switch(select) {
		    case 1: insertMember();
		    		mainMenu();
		    	break;
		    case 2: updateMember();
		    		mainMenu();
		    	break;
		    case 3: printAll();
		    		mainMenu();
		    	break;
		    case 9: break;
		    default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		        mainMenu();
		    }
		    
		} else {
			System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
		    switch(select) {
		    case 2: updateMember();
		    		mainMenu();
		    	break;
		    case 3: printAll();
		    		mainMenu();
		    	break;
		    case 9: break;
		    default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		        mainMenu();
		    }
		}
		
	}
	
	public void insertMember() {
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		if(mc.checkId(id)==-1) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.print("나이 : ");
			int age = sc.nextInt();
			Member m = new Member(id, name, password, email, gender, age);
			mc.insertMember(m);
			mainMenu();
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();
		}
		
	}
	
	public void updateMember() {
		
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		
		if(mc.checkId(id)!=-1) {
			System.out.print("수정할 이름 : ");
			String name = sc.next();
			System.out.print("수정할 비밀번호 : ");
			String password = sc.next();
			System.out.print("수정할 이메일 : ");
			String email = sc.next();
			mc.updateMember(id, name, password, email);
		} else System.out.println("회원 정보가 없습니다.");
		
	}
	
	public void printAll() {
		
		
		for(Member member : mc.printAll()) {
			if(member!=null) {
				System.out.println(member);
			}
		}
		
	}
	
}


























