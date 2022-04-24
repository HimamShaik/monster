package com.javaprog;

public interface my {
 void hai();
}
class a implements my{

	@Override
	public void hai() {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
	}
	public static void main(String[] args) {
		a a1=new a();
		a1.hai();
	}
}
