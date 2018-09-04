package WebApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.2:5555/SWC.Client/Login.aspx");
		File source=new File("E:\\Anand JAVA Workplace\\Logindetails.xlsx");
		FileInputStream fis= new FileInputStream(source);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();
		int columns=sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		for (int i=0;i<rows+1;i++)
		{
			for(int j=0;j<columns;j++)
			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
		
		}
		

	}

}
