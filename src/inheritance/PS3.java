package inheritance;

public class PS3 extends PS4 {

	int a;// class variable

	public PS3(int a) {// instance variable

		super(a);
		this.a = a;

	}

	public int increment() {
		a = a + 1;
		return a;
	}

	public int decrement() {
		a = a - 1;
		return a;
	}

}
