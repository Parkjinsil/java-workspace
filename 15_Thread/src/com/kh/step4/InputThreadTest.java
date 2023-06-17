package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {
		
		InputThread it = new InputThread();
		CountThread ct = new CountThread();
		
		Thread tit = new Thread(it,"InputThread");
		Thread tct = new Thread(ct,"CountThread");
		
		tit.start();
		tct.start();
		
	}

}
