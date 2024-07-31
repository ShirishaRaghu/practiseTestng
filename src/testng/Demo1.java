package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test(groups=("Smoke"))
	public void Loan() {
		System.out.println("Good");
	}
	
	@BeforeTest
	public void Execute() {
		System.out.println("I will execute first");
	}
	
	@Test(enabled=false)
	public void Tax() {
		System.out.println("Good service tax");
	}
	
	@Parameters({"URL" , "apiKEY/Username"})
	@Test
	public void Home(String urlname, String key) {
		System.out.println("Home loan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	
}
