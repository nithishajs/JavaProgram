package com.Abstraction;

abstract class Hiding {
	
	abstract void show();
	
	void display() {
		int num = 10;
		System.out.println("The Number is:"+num);
	}
	
}

 class Showing extends Hiding {
	

	@Override
	void show() {
		
		String name = "Nithish";
		System.out.println("The Name is:"+name);
		
	}
}




public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Showing s1 = new Showing();
		s1.show();
		s1.display();

	}

}
