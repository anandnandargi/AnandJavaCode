package WebApp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/upload/");
		
/*		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);*/
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
		
		
		Runtime.getRuntime().exec("E:\\Anand JAVA Workplace\\Fileupload1.exe");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
	}

}
