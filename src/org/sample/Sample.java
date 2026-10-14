package org.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<>();

		m.put(10, "java");
		m.put(20, "python");
		m.put(30, "selenium");
		m.put(40, ".net");
		m.put(50, "js");
		m.put(10, "c");
		m.put(100, "c#");
		m.put(60, "selenium");

		System.out.println(m);
		
		Set<Entry<Integer, String>> y = m.entrySet();
		System.out.println(y);
		
		System.out.println("\nEnhanced for loop:");
		for (Entry<Integer, String> ent : y) {
			System.out.println(ent);
		}
		
		System.out.println("\nEnhanced for loop:");
		for (Entry<Integer, String> ent : y) {
			System.out.println("keys:"+ent.getKey());
			System.out.println("values:"+ent.getValue());
		}
	

	}

}
