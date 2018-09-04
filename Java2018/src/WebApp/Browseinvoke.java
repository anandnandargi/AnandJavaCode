package WebApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browseinvoke {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/");
		driver.findElement(By.xpath("(//A[@href='#'])[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Anand");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Nandargi");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anand@aaa.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("09898989898");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Secto45, pune");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		WebElement states=(WebElement) driver.findElements(By.xpath("//select[@name='state']"));
		states.sendKeys("Alabama");
		
	}

}
