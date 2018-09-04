package SimpleJavaProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeMozilaa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\JAVA\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://itcmchef.stores2.shoptimize.in/#");
		Thread.sleep(70000);
		driver.findElement(By.xpath("//a[@xpath='1']")).click();
	}

}
