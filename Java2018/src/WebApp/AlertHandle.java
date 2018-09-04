package WebApp;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.209:5555/SWC.Client/Login.aspx");
		driver.findElement(By.xpath("//input[@name='txtLN']")).sendKeys("anandna");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='txtPW']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame(1);
		/*	WebElement casetype=driver.findElement(By.xpath("//select[@name='ddlCaseType']"));*/
		Select notice= new Select(driver.findElement(By.xpath("//option[text()='New']")));
		notice.selectByVisibleText("New");
		/*casetype.sendKeys("New");*/
		
	}

}
