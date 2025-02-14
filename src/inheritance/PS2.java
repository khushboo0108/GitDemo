package inheritance;

import org.testng.annotations.Test;

public class PS2 extends PS1 {

	@Test
	public void testRun() {
		PS3 ps3 = new PS3(3);// parameterized constructor
		doThis();
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		System.out.println(ps3.multiplyByThree());
	}

}
