package WebApp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNG



{
	@BeforeMethod
	public void browser()
	{
		System.out.println("Browser invoke");
	}
	
	@BeforeTest
	public void testpage()
	{
		System.out.println("This is page test");
	}   
}
