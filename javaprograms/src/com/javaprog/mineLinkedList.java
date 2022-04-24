package com.javaprog;

import java.util.Iterator;

public class mineLinkedList {
	private Object[] myArray;
	private int pos;
	public  mineLinkedList(int size) {
		
		this.myArray =  new Object[size];
	}
	public int size() {
		return this.myArray.length;
	}
	public void addele(Object obj) {
		if(this.pos>=myArray.length) {
			grow();
		}
		this.myArray[pos]=obj;
		pos++;
	}
	 public Object grow() {
		 Object[] temp=this.myArray;
		 this.myArray=new Object[this.myArray.length*2];
		 for(int i=0;i<temp.length;i++) {
			 this.myArray[i]=temp[i];
		 }
		 return null;
	 }
	 public void getAllEle() {
		 for(Object hi:myArray) {
			 System.out.println(hi);
		 }
	 }

}
