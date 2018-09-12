package WebApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadObjects {


	public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream fip=new FileInputStream("C:\\Users\\Administrator.sepl042\\git\\Java2018\\src\\WebApp\\config.properties");
	prop.load(fip);
	
	System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.freecrm.com/register/");
	driver.findElement(By.xpath(prop.getProperty("firstname"))).sendKeys("anand");
	System.out.println(prop.getProperty("firstname"));
	
	}

}

