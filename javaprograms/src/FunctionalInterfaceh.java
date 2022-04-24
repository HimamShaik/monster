@FunctionalInterface
interface FunctionalInterfaceh {

	public void himam();

	public static void howl() {
		System.out.println("static methods");
	}

	public static void howleh() {
		System.out.println("this is second static method");
	}

	default void defau() {

		System.out.println("this is default method");
	}

	default void eff() {
		System.out.println("this is 2nd def method");
	}
}
