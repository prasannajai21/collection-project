package org.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		
		Set<Integer> s = new LinkedHashSet<>();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(60);
		s.add(80);
		s.add(60);
		s.add(50);
		System.out.println("Removed =" + s);

	}

}
