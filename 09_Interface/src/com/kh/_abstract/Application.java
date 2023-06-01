package com.kh._abstract;

import com.kh._abstract.step1.BasketBall;
import com.kh._abstract.step1.FootBall;
import com.kh._abstract.step1.Sports;
import com.kh._abstract.step2.BulgogiPizza;
import com.kh._abstract.step2.PineApplePizza;
import com.kh._abstract.step2.Pizza;
import com.kh._abstract.step2.PotatoPizza;

public class Application {

	public static void main(String[] args) {

//		Sports sport = new Sports(); <-- 객체 생성 불가!
		Sports[] sports = new Sports[2];
		sports[0] = new BasketBall(5);
		sports[1] = new FootBall(11);
		
		for(Sports s : sports) {
			s.rule();
		}
		
		System.out.println();
		
		Pizza[] pizza = {new BulgogiPizza(32900, "피자헛"),
				         new PotatoPizza(2799, "도미노피자"),
				         new PineApplePizza(23000, "피자알볼로")};
		
		for(Pizza p : pizza) {
			p.makePizza();
		}
		
	}

}
