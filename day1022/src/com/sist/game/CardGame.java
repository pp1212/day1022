package com.sist.game;

public class CardGame {

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
		
		//첫 번째 사람이 카드를 하나 뽑아옵니다
		p1.getCard(deck.deal());
		
		//두 번째 사람도 카드를 하나 뽑아옵니다
		p2.getCard(deck.deal());
		
		//첫 번째 사람이 자신의 모든 카드 출력
		p1.showCards();
		
		//두 번째 사람도 자신의 모든 카드 출력
		p2.showCards();
		
	}

}
