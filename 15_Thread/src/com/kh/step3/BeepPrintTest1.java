package com.kh.step3;

import java.awt.Toolkit;

import com.kh.step2.ComeThread;
import com.kh.step2.GoThread;

public class BeepPrintTest1 {

	public static void main(String[] args) {

		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			tool.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		

	}

}
