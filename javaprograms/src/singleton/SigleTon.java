package singleton;

public class SigleTon {

	public static SigleTon s;

	private SigleTon() {
		super();
	}

	public static SigleTon getInstance() {
		if (s == null) {
			s = new SigleTon();
		}
		return s;

	}

}
