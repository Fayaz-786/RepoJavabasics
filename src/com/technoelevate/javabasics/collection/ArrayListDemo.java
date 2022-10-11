package com.technoelevate.javabasics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println("for loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Iterator");
		Iterator<Integer> itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("For each");
		for (Integer i : arrayList) {
			System.out.println(i);
		}
		System.out.println("List Iterator");
		ListIterator<Integer> li = arrayList.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("list iterator backward");
		ListIterator<Integer> li1 = arrayList.listIterator(arrayList.size());
		
		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
		
	}

}
