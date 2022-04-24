package singleton;

public class ObjectOfSigleton {
	public static void main(String[] args) {

		SigleTon s1 = SigleTon.getInstance();
		SigleTon s2 = SigleTon.getInstance();

		if (s1 == s2) {
			System.out.println("both are having same instance");
		} else {
			System.out.println("both are not same");
		}
	}
}