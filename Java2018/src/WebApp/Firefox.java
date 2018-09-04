package WebApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\JAVA\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver(); 
		driver.get("https://www.google.com/");

	}

}
