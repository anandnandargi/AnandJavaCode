package WebApp;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String name="Torrent Power Ltd.";
		List<WebElement> cmplist=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
			List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		for(int i=0;i<cmplist.size();i++)
		{
			if(cmplist.get(i).getText().equals(name))
			{
				System.out.println(cmplist.get(i).getText()+"---------"+currentprice.get(i).getText());
			}
			/*String names=cmplist.get(i).getText();
		System.out.println(names);*/
		}
		
		
	
	}
	

}
