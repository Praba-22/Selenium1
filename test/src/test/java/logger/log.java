package logger;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class log {

	 public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	        Logger logger = Logger.getLogger("log4jexample");     
	        
	    
	        DOMConfigurator.configure("C:\\Users\\pradeep.a\\eclipse-workspace\\Mitra\\log4j.xml");
	           // PropertyConfigurator.configure("log4j.properties");
	        
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        
	        logger.info("Browser Opened Succesfully");
	        
	        driver.get("http://cinimitra.azurewebsites.net/Home/Login");
	        logger.info("Cini Mitra Site Opened successfullly");
	        
	        driver.manage().window().maximize();
	        logger.info("Window is maximized");
	        
	        WebElement Login=driver.findElement(By.xpath("//a[text()='LOGIN']"));
	        Login.click();
	        logger.info("Login button clicked successfully");
	        
	        
	        WebElement Username = driver.findElement(By.xpath("(//input[@id='UserName'])[1]"));
	        Username.
	        logger.info("Username entered succssfully");
	        
	        WebElement Password = driver.findElement(By.xpath("(//input[@id='Password'])[1]"));
	        Password.sendKeys(args)
	     }

}
