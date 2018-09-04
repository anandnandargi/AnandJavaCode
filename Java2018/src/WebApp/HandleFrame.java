package WebApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	/*	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("99999999999");*/
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for (int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9878789875");
			driver.findElement(By.xpath("//a[@title='Close']")).click();
			driver.switchTo().defaultContent();
		}
	}

}
