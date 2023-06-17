package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
//		System.out.print("단어 입력 : ");
//	    String word = sc.nextLine();
//	    
//	    char[] arr = word.toCharArray();
////	    System.out.println(Arrays.toString(arr));
//	    
//	    for(int i=word.length()-1; i>=0; i--) {
//	    	System.out.println(arr[i]);
	    	
	    	Main m = new Main();
	    	m.method2();
//	    }
		
	}

    public void method1() {
		
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
	
//	문제) 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성
//	입력예) 11 25 3 9 15 6 8 7 12 0
//	출력예) 25 9 6 7
    public void method2() {
    	
    	int[] arr = new int[100];
    	int count =0;
    	
    	for(int i=0; i<=100; i++) {
    		
    		count++;
    		
    		System.out.print("정수 입력 : ");
    		arr[i]=sc.nextInt();
    		
    		if(arr[i]==0) {
    			break;
    		}
    		
    	}
    	
    	for(int i=1; i<count-1; i+=2) {
    		System.out.print(arr[i]+" ");
    	}
    	
    }
    
}
