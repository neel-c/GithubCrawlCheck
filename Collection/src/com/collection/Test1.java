package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

class A {
	
}

class B extends A {
	
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> array = new ArrayList<Integer>();
		
		int a[] = new int[10];

		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("PHP");
		names.add("SQL");
		names.add("Angular 2");

		List<String> first2Names = names.subList(0, 2);

		names.set(1, "JavaScript");

		names.add("NodeJS");
		System.out.println(names + " , " + first2Names); // this line throws
															// exception
	}

}
