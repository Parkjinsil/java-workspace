package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {

		// 클래스 변수(static 붙인거)는 인스턴스 생성 없이 호출 가능! (한 곳에서 바꿔도 다른 곳 다 공유)
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		System.out.println();
		
//		Card.number; // 얘는 바로 쓸 수 없고 객체생성 해야지 쓸 수 있음
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 3;
		
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("첫번째 카드는 "+c1.kind+" "+c1.number+" 이며, 크기는 "+c1.width+" X "+c1.height+"입니다.");
		System.out.println("첫번째 카드는 "+c2.kind+" "+c2.number+" 이며, 크기는 "+c2.width+" X "+c2.height+"입니다.");
    }

}
