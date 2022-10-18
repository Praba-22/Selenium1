package Base;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static ExtentReports extent;
	public static WebDriver driver;
	public static ExtentTest test;
	
//	public void Log(String content) {
//		 Logger lg = Logger.getLogger("Steps_Definition");
//		 DOMConfigurator.configure("D:\\Commonds_Types\\Test_Output\\log4j.xml");
//         lg.info(content);
//	}
	
	public void browser() {
		 //System.setProperty("webdriver.chrome.driver","/Commonds_Types/drivers/chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://cinimitra.azurewebsites.net/");
	}
	  
	public static void testcreation(String Report_Creation) {
		
		 test=extent.createTest(Report_Creation);
	}
}
	 
	
	




	
