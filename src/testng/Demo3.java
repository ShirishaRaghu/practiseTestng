package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Demo3 {

	@Test(timeOut=4000)
	public void Hello(){
		System.out.println("How u");

	}

	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Parameters({"URL"})
	@Test
	public void World(String urlname){
		System.out.println("Bigger");
        System.out.println(urlname);
	}

	
	
	
}
