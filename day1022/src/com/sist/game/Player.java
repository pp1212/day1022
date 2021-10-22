package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {

	//게임을 하는 경기자가 CardDeck으로부터 카드를 하나씩 가져와서 담을 리스트 만든다
	private ArrayList<Card> list = new ArrayList<Card>();
	
	//카드를 매개변수로 받아서 나의 list에 담는다
	public void getCard(Card card) {
		list.add(card);
	}
	
	//원페어인지 판별하여
	//누가 이겼는지 처리하려면 원페어인 숫자를 반환하려고 함
	//숫자가 2~10까지는 Integer.parInt() 하면 정수로 만들어 주는데 문제가 옶음
	//그런데 카드의 숫자가 "Jack","Queen","King","Ace" 이런것들은 Integer.parseInt를 못함
	//그래서 "2" key로 하고 2를 value로 하는 map을 만듬~
	//"Jack"이라는 key에는 11이라는 value를 담음
	public int isOnepair() {
		
		//카드의 숫자를 map의key로 함
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		//map을 만듬
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//2에 대한 value를 숫자 2로 함.그리고 1씩 증가
		int value = 2;
		
		for(int i=0;i<number.length;i++) {		//카드의 숫자 배열만큼 반복실행
			map.put(number[i], value++);		//map에 key는 카드의 숫자로 하고 value는 2부터 1씩 증가한 값으로 함
		}
		
		int n = 0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				
				//i번째 카드의 숫자와 j번째 숫자가 동일한지 판별
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) { 
					
					//동일한 카드의 숫자(아직 문자열입니다)에 해당하는 정수를 map으로부터 뽑아옴 
					n = map.get(list.get(i).getNumber());
					return n;
				}
			}
		}
		return n;
	}
	
	//나의 카드를 모두 출력
	public void showCards() {
		System.out.println(list);
	}
	
	
	
}
