package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("window-size=1400x800");
		options.addArguments("headless");
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://bimdcr.com/BPAMSClient2/");
		driver.findElement(By.xpath("//input[@id='txtLN']")).sendKeys("mcgmdummy");
		System.out.println("Test :"+driver.getTitle());
		driver.close();
		


	}

}
