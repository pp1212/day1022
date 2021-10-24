package com.sist.homework02;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeNumber {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public PrimeNumber() {
		super();
		// TODO Auto-generated constructor stub
		for(int i=2;i<=100;i++) {
			list.add(i);
		}
	}
	
	public void removeNumber(int a) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i) != a) {
				if(list.get(i) % a == 0) {
					list.remove(i);
				}
			}	
		}
	}
	
	public void printIterator() {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber p1 = new PrimeNumber();
		
		p1.removeNumber(2);
		p1.removeNumber(3);
		p1.removeNumber(5);
		p1.removeNumber(7);

		p1.printIterator();
		
	}

}
