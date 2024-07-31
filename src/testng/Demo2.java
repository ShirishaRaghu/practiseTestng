package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {

	@BeforeClass
	public void Befclass() {
		System.out.println("Before executing any methods in the class");
	}
	
	@AfterTest
	public void Executelast(){
		System.out.println("I will execute last");

	}

	
	@Test
	public void WebloginCarLoan(){
		System.out.println("weblogincar");

	}
	
	
	@AfterSuite
	public void afsuite()
    {
		System.out.println("I am the no 1 from last");
	}
	
	@Test
	public void MobileloginCarLoan(){
		System.out.println("mobilelogincar");

	}
	
	@BeforeMethod
	public void Bsuite()
	{
	System.out.println("I will execute before every method in Demo2 class");	
	}
	
	@AfterClass
	public void Afclass() {
		System.out.println("After executing every methods in the class");
	}
	
	@Test
	public void MobilesigninCarLoan(){
		System.out.println("mobile SIGIN");
		Assert.assertTrue(false);

	}
	
	@BeforeTest
	public void MobileCarLoan(){
		System.out.println("mobile SIGIN car");
		

	}
	
	@AfterMethod
	public void Afmethod()
	{
	System.out.println("I will execute after every method in Demo2 class");	
	}
	

	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username , String password){
		System.out.println("mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);

	}

	@Test(dependsOnMethods=("WebloginCarLoan"))
	public void LoginAPIcarLoan(){
		System.out.println("loginAPIcar");

	}

	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination username , password - good credit history
		//2nd combination username , password - no credit history
		//3rd combination frauderent crdit history
		Object[][] data = new Object[3][2];
		
		//1st combination
		data[0][0]= "firstusername";
	    data[0][1]= "password";
	
	    //2nd combination
	    data[1][0]="secondusername";
	    data[1][1]="password";
	    
	    //3rd combination
	    data[2][0]="thirdusername";
	    data[2][1]="password";
	    return data;
	
	}

}
