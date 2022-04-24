package com.tecgnoelevate.methodref;

public class InterafecStaticDefaultMetRef  implements NewInterface {
	
public static void main(String[] args) {
	InterafecStaticDefaultMetRef ifs=new InterafecStaticDefaultMetRef();
	ifs.hai();
	NewInterface.hello();
	ifs.run();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("hai go to movie");
}
}
