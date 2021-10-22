package com.sist.exam01;


class Animal{
	
}

class Lion extends Animal{
	
}

class Tiger extends Animal{
	
}


public class Cage {

	private Object animal;	//지금은 1마리 넣을 수 있음
	public Object getAnimal() {
		return animal;
	}
	public void setAnimal(Object animal) {
		this.animal = animal;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cage cage = new Cage();
		cage.setAnimal(new Lion());
		//Lion lion = cage.getAnimal();	
		//cage는 Object타입
		//Lion과 Object는 상속관계에 있지만
		//자식의 참조변수가 부모객체를 참조할 수 없음
		
		//참조하게 하려면 자식클래스형으로 변환 후 참조 가능
		//Lion lion = (Lion)cage.getAnimal();
		
		//Tiger tiger = (Tiger)cage.getAnimal();
		//cage에 lion을 넣고 꺼내올 때는 tiger로 변환 => 컴파일 오류는 발생X
		//실행 시에 오류 발생
		/*
		 Exception in thread "main" java.lang.ClassCastException: class com.sist.exam01.Lion cannot be cast to class com.sist.exam01.Tiger (com.sist.exam01.Lion and com.sist.exam01.Tiger are in unnamed module of loader 'app')
		at com.sist.exam01.Cage.main(Cage.java:42)
		 */
		
		
		
		
	}

}
