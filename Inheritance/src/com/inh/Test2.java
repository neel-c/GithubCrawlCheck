package com.inh;

class A {
	
	public static int i=1;
	
	public void print() {
		System.out.println("A");
	}
}

class B extends A {
	
	public static int i=2;
	
	public void print() {
		System.out.println("B");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		
		System.out.println(a.i);
		System.out.println(b.i);

	}

}
