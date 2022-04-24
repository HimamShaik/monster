package com.tecgnoelevate.methodref;

public class NormalInterfaceimplementation  implements DefaultInterface{

	@Override
	public void hello() {
       System.out.println("hai welcome to the office");		
	}
	public static void main(String[] args) {
		NormalInterfaceimplementation ni=new NormalInterfaceimplementation();
		ni.hello();
	}

}
