package WebApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		boolean bval=driver.findElement(By.xpath("//input[@value='red']")).isDisplayed();
		System.out.println(bval);
		driver.findElement(By.xpath("//input[@value='green']")).click();
		
		/*List<WebElement> checkbox= driver.findElements(By.xpath("//input[@name='color']"));
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}*/
		
	}

}
