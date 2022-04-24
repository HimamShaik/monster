package com.tecgnoelevate.methodref;

public interface NewInterface {
  void run();
  public static void hello() {
	  System.out.println("hai this is himam");
  }
  default void hai() {
	 System.out.println();
  }
}
