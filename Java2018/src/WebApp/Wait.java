package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://bimdcr.com/bpamsclient2/Login.aspx");
	WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='txtLN']")));
	
	}

}
