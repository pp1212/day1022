package com.sist.game;

public class CardGame02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CardDeck 객체 생성
		//생성자에 의해서 52개의 카드가 생성됨
		CardDeck deck = new CardDeck();
		
		//shuffle은 카드를 골고루 섞어줌
		deck.shuffle();
		
		//카드게임을 할 경기자를 2명 생성
		Player p1 = new Player();
		Player p2 = new Player();
		
		//원페어인지 판별하기 위한 isOnepair메소드 - Player클래스
		
		
		//카드 각각 7장씩 뽑기
		for(int i=1;i<=7;i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		
		//첫 번째 사람이 자신의 모든 카드 출력
		p1.showCards();
		
		//두 번째 사람도 자신의 모든 카드 출력
		p2.showCards();
		
		
		if(p1.isOnepair() != 0) {
			System.out.println("player1은 원페어입니다." + p1.isOnepair());
		}else {
			System.out.println("player1은 원페어가 아닙니다.");
		}
		
		if(p2.isOnepair() != 0) {
			System.out.println("player2은 원페어입니다." + p2.isOnepair());
		}else {
			System.out.println("player2은 원페어가 아닙니다.");
		}
		
		if (p1.isOnepair() > p2.isOnepair()) {
			System.out.println("player1이 이겼습니다.");
		} else {
			System.out.println("player2가 이겼습니다.");
		}
		
	}

}
