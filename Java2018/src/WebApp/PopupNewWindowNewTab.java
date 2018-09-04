package WebApp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupNewWindowNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/practiceform/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		Set<String> popup=driver.getWindowHandles();
		Iterator<String> it= popup.iterator();
		
		String mainwindow=it.next();
		String newwindow=it.next();
		
		driver.switchTo().window(newwindow);
		driver.close();
		driver.switchTo().window(mainwindow);
		System.out.println(popup.size());
		
		
		
		
	}

}
