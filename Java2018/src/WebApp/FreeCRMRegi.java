package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMRegi {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
	}

}
