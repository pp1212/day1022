package com.sist.exam02;

import java.util.ArrayList;

class Animal{
	public void move() {
	}
}

class Lion extends Animal{
	public void move() {
		System.out.println("사자가 움직입니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}


public class Cage {
	//ArrayList<Tiger> list = new ArrayList<Tiger>();
	//이렇게 해 두면 리스트에는 tiger만 담을 수 있음
	
	ArrayList<Animal> list = new ArrayList<Animal>();
	//이렇게 해두면 Animal의 후손인 (Animal과 is a관계에 있는)Lion도 담을 수 있고 Tiger도 담을 수 있음

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cage cage = new Cage();
		cage.list.add(new Lion());
		cage.list.add(new Tiger());
		for(Animal animal:cage.list) {
			animal.move();
		}
	}

}
