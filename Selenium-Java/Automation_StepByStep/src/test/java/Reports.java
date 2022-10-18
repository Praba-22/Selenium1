import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports {
	static ExtentTest  te;

	public static void main(String[] args) {
	 
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("extent.html");
		
		ExtentReports ER = new ExtentReports();
		ER.attachReporter(htmlreport);
		
		 te = ER.createTest("Chrome","verify browser");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		te.info("Browser Opened");
		//ExtentTest test = ER.createTest("CiniMitra LoginPage","Valiadate the Login Functionlity");
		te = ER.createTest("Prabha","Valiadate the Login Functionlity");
		driver.get("https://cinimitra.azurewebsites.net/");
		te.pass("CiniMtra page Opened");
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		te.pass("Login button clicked");
		
		WebElement usrnme=driver.findElement(By.xpath("(//input[@id='UserName'])[1]"));
		usrnme.sendKeys("Kannan@gmail.com");
		te.pass("Username Entered Succesfully");
		
		WebElement pswd = driver.findElement(By.xpath("(//input[@id='Password'])[1]"));
		pswd.sendKeys("Kum@12345");
		te.pass("Password Enetred Successfully");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		te.pass("Login Successfully");
		
		driver.close();
		driver.quit();
		te.info("Test Completed");
		
		ER.flush();
		
		
		
		
		
		
		
	}

}
