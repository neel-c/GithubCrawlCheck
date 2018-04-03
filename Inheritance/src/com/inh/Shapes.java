package com.inh;

public class Shapes {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.calculateArea();
		shape.setArea(10);
		shape.S();
		System.out.println(shape.area);
		System.out.println(shape.getArea());
		System.out.println(shape.getAreas());

	}

}
