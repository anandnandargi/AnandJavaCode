package WebApp;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class TestNGDemo {
	public WebDriver driver;
	public String baseurl ="https://www.freecrm.com/register/";

	@BeforeTest
	public void f() {

		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);*/
	}
	@Test
	
	public void regisration()
	{
		driver.get("https://www.freecrm.com/register/");
		WebElement sel=driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
		Select edition= new Select(driver.findElement(By.xpath("//select[@id='payment_plan_id']")));
		
		sel.sendKeys("Free Edition");
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Anand");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Nandargi");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anandnandargi@gmail.com");
		driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("anandnandargi@gmail.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("anandnandargi");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anand1987");
		driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("anand1987");
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[@name='submitButton']")).click();
		
	/*	edition.selectByVisibleText("Free Edition");*/
	}
	}


