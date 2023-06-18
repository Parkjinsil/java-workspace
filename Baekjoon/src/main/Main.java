package main;

import java.net.InetAddress;
import java.net.UnknownHostException;
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
    	try {
			InetAddress ip = InetAddress.getByName("google.com");
			System.out.println("getHostName(): " + ip.getHostName()); //호트스 이름 반환
			System.out.println("getHostAddress():" + ip.getHostAddress()); // 호트스의 IP 주소 반환
			System.out.println();
			
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName(): " + ip.getHostName());
			System.out.println("getHostAddress(): " + ip.getHostAddress());
			System.out.println();
			
			InetAddress[] ipArr = InetAddress.getAllByName("naver.com");
			
			for(int i=0; i<ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i].getHostAddress());				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
    	
    }
    
}
