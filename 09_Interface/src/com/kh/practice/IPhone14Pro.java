package com.kh.practice;

public class IPhone14Pro extends SmartPhone implements Pen{

	String name = "iPhone 14 Pro";
	String brand = "애플";
	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "4800만 화소 카메라";
	}


	public void printInformation() {
		super.printInformation(name, brand);
		System.out.println("펜 탑재 여부 : "+pen());
	}

	@Override
	public boolean pen() {
		return false;
	}
}
