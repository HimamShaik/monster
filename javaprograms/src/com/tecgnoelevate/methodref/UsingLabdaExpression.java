package com.tecgnoelevate.methodref;

public class UsingLabdaExpression {
public static void main(String[] args) {
	DefaultInterface di=()->{  move();}; 
	di.hello();
}
public static void move() {
	System.out.println("hai back to home");
}
}
