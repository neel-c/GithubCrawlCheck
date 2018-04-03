package com.inh;

class Base {
	int a = 0;
	
	void getBase() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	int a = 2;
	int b = 1;
	
	void getDerived() {
		System.out.println("Derived");
	}
	
	void getBase() {
		System.out.println("Base from Derived");
	}
}

public class Test {

	/*public static void main(String[] args) {
		Base b = new Derived();
		Derived d = new Derived();
		System.out.println(b.a);
		System.out.println(d.a);
		b.getBase();
		d.getBase();

	}*/
	
	public static void main(String[] args) {
	    final Beta a = new Gama();
	    a.number = "its a string";
	    ((Alpha) a).number = 13;
	    ((Gama) a).number = 42;

	    System.out.println(a.number);
	    System.out.println(((Alpha) a).number);
	    System.out.println(((Gama) a).number);
	}

}

class Alpha {
    public Number number;
}

class Beta extends Alpha {
    public String number;
}

class Gama extends Beta {
    public int number;
}
