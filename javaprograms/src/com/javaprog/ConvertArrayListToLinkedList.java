package com.javaprog;

import java.util.LinkedList;

public class ConvertArrayListToLinkedList {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("stirng");
		al.add("union");
		al.add("row");
		al.add("roo");
//		System.out.println(al);
//       Collections.sort(al);
//       System.out.println(al);
//		
//       TreeSet ts=new TreeSet(al);
//       System.out.println(ts);
		al.forEach(hi -> System.out.println(hi));
	}

}
