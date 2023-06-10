package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"짜장면", "허니콤보", "떡볶이", "초밥"};
		
	    System.out.print("사용자 입력 : ");
	    String food = sc.nextLine();
	    
	    boolean result = false;
	    for(int i=0; i<arr.length; i++) {
	    	if(arr[i].equals(food)) {
	    		result = true;
	    		break;
	    	}
	    }
	    if(result) System.out.println("배달 가능");
	    else System.out.println("배달 불가능");
	}

}
