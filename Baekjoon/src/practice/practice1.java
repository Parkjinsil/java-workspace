package practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		for(int i=1;;i++) {
			if( n/4>=i && n/4<i+1) {
				for(int j=1; j<=i; j++) {
					System.out.print("long ");
			}
				System.out.println("int"); break;
			}
		
		}
	}

}