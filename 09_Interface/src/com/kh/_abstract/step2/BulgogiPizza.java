package com.kh._abstract.step2;

public class BulgogiPizza extends Pizza{

	public BulgogiPizza() {
	}

	public BulgogiPizza(int price, String storeName) {
		super(price, storeName);
		
	}

	@Override
	public void topping() {
		System.out.println("Bulgogi Topping...");
	}
	
}
