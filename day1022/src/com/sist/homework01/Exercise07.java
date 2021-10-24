package com.sist.homework01;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(2.5);
		list.add(6.3);
		
		
		//1
		for (int i=0; i<list.size(); i++) {
			double d = list.get(i);
			System.out.println(d);
		}
		
		//2
		for (double d : list) {
			System.out.println(d);
		}
		
		//3
		Iterator<Double> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

