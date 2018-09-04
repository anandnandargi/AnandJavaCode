package WebApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownprog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://login.yahoo.com/account/create?src=fpctx&intl=in&lang=en-IN&done=https%3A%2F%2Fin.yahoo.com&specId=yidReg");
		
		WebElement monthlist=driver.findElement(By.xpath("//select[@name='mm']"));
		Select month= new Select(driver.findElement(By.xpath("//select[@name='mm']")));
		month.selectByIndex(6);*/
		
		driver.get("http://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement conuntry_drop=driver.findElement(By.xpath("//span[@id='select2-country-container']"));
		
		
		conuntry_drop.click();
		
	}

}
