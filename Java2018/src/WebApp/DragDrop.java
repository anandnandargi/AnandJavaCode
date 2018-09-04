package WebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		System.out.println();
		Actions act = new Actions(driver);

		act.clickAndHold(driver.findElement(By.xpath("//span[text()='Draggable 1']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='mydropzone']"))).release().build().perform();

	}

}
