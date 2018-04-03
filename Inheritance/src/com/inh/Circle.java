package com.inh;

public class Circle extends Shape {
	
	int radius;
	int area = 2;
	
	public int calculateArea() {
		System.out.println("Calculate Circle Area");
		return area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int calculateRadius() {
		return radius;
	}
	
	public int getArea() {
		return super.getArea();
	}
	
	public int getAreas() {
		return this.area;
	}
	
	

}
