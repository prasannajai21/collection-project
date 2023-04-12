package org.collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(90);
		al.add(10);
		al.add(10);
		al.add(40);
		al.add(50);
		System.out.println("values of array is :" + al);
		System.out.println("size of array is :" + al.size());

	}

}
