package testpkg;

import org.testng.annotations.Test;

public class sample1 {

	@Test(groups= {"Smoke"})
	public void demo() {
		System.out.println("hello");
	}
}
