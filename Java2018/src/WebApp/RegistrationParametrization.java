package WebApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationParametrization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Anand JAVA Workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Properties prop= new Properties();
		FileInputStream regload=new FileInputStream("C:\\Users\\Administrator.sepl042\\git\\Java2018\\src\\WebApp\\login.properties");
		prop.load(regload);
		driver.get(prop.getProperty("Url"));
		
		FileInputStream fis=new FileInputStream("E:\\Anand JAVA Workplace\\login.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet2");
		XSSFCell celldata;
		DataFormatter format= new DataFormatter();
		/*Select sel=driver.findElements(By.xpath("//input[@value='yes']")).i*/
		
		
		
		for(int i=1;i<sh.getLastRowNum()+1;i++)
		{
			
			celldata=sh.getRow(i).getCell(0);
			String phone=format.formatCellValue(celldata);
			celldata.setCellType(celldata.CELL_TYPE_STRING);
			
	
			driver.findElement(By.xpath(prop.getProperty("Firstname"))).sendKeys(celldata.getStringCellValue());
			celldata=sh.getRow(i).getCell(1);

			driver.findElement(By.xpath(prop.getProperty("Lastname"))).sendKeys(celldata.getStringCellValue());
			celldata=sh.getRow(i).getCell(2);

			driver.findElement(By.xpath(prop.getProperty("E-mail"))).sendKeys(celldata.getStringCellValue());
			celldata=sh.getRow(i).getCell(3);

			driver.findElement(By.xpath(prop.getProperty("Phone"))).sendKeys(format.formatCellValue(celldata));
			celldata=sh.getRow(i).getCell(4);

			driver.findElement(By.xpath(prop.getProperty("Address"))).sendKeys(celldata.getStringCellValue());
			celldata=sh.getRow(i).getCell(5);

			driver.findElement(By.xpath(prop.getProperty("City"))).sendKeys(celldata.getStringCellValue());
			celldata=sh.getRow(i).getCell(6);

			driver.findElement(By.xpath(prop.getProperty("State"))).sendKeys(celldata.getStringCellValue());
			celldata=sh.getRow(i).getCell(7);

			driver.findElement(By.xpath(prop.getProperty("Zip"))).sendKeys(format.formatCellValue(celldata));
			celldata=sh.getRow(i).getCell(8);

			driver.findElement(By.xpath(prop.getProperty("Website"))).sendKeys(celldata.getStringCellValue());
			/*celldata=sh.getRow(i).getCell(9);*/

			driver.findElement(By.xpath(prop.getProperty("HaveHost"))).click();
			/*celldata=sh.getRow(i).getCell(10);
			
			driver.findElement(By.xpath(prop.getProperty("Url"))).sendKeys(celldata.getStringCellValue());*/
			celldata=sh.getRow(i).getCell(10);

			driver.findElement(By.xpath(prop.getProperty("ProjectDesc"))).sendKeys(celldata.getStringCellValue());
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		
	}

}
