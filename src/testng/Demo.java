package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	
		// TODO Auto-generated method stub

	@Test
	public void Demo() {
    System.out.println("hello");
	
	}
   
	
	@Test(groups=("Smoke"))
	public void SecondTest() {
		System.out.println("Welcome");
	}

	@Test
	public void ThirdTest() {
		System.out.println("world");
	}

}
