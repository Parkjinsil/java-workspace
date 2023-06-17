package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {

	boolean inputCheck = false;
	boolean check = false;
	
	public static void main(String[] args) {
		
		InputThreadTest2 test = new InputThreadTest2();
		
		Thread t = new Thread(new CountThread1(test));
		Thread t2 = new Thread(new InputThread1(test));
		
		t.start();
		t2.start();
		
	}
}

class CountThread1 implements Runnable{
	
	InputThreadTest2 test;
	
	CountThread1(InputThreadTest2 test){
		this.test = test;
	}
	
	@Override
	public void run() {
		
		for(int i=10; i>0; i--) {
			try {
				if(test.inputCheck) {
					break;
				}
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		if(!test.inputCheck) {
			System.out.println("입력시간이 초과되었습니다.");
			System.exit(0);
		}
		
		
	}
}

class InputThread1 implements Runnable{

	InputThreadTest2 test;
	
    InputThread1(InputThreadTest2 test){
		this.test = test;
	}
	
	@Override
	public void run() {
		
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
		System.out.println("입력하신 숫자는 "+input+"입니다.");
		
		test.inputCheck =true;
				
		
	}
	
}
