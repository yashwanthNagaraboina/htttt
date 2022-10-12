package app;

import org.testng.annotations.Test;

public class s1 {
	@Test
	public void Class() {
		System.out.println("inside app.s1");
	}
	@Test(groups= {"Smoke"})
	public void Class2() {
		System.out.println("inside app.s2");
	}

}
