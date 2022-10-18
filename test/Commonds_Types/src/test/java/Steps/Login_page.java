package Steps;



import javax.swing.text.Element;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.ScrollAction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Base.Base_Class;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class Login_page extends Base_Class {
	 
	public ExtentHtmlReporter htmlreporter;
//    public ExtentReports extent;
//    public ExtentTest test;
	
	@Before
	public void SetExtent() {
	        htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/TEST/report5.html"); 
	        htmlreporter.config().setDocumentTitle("Cini Mitra");
	        htmlreporter.config().setReportName("Open the browser");
	        htmlreporter.config().setTheme(Theme.DARK);
	        
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlreporter);
	        extent.setSystemInfo("Hostname", "localhost");
	        extent.setSystemInfo("OS", "Windows10");
	        extent.setSystemInfo("Tester Name ", "Prabakaran");
	        extent.setSystemInfo("Position", "Software Test Engineer");
	        extent.setSystemInfo("Browser", "Chrome");
	        
	    }
	
  @After
  public void closeExtent() {
  	extent.flush();
  }
    
@Test
	@Given("Access_the_ browser")
	public void access_the_browser() {
		browser();
		testcreation("Accessssssss");
		
	}

@Test
	@When("Open_the Page")
	public void open_the_page() {
		
	testcreation("Open the Page");
	}
@Test
	@Then("Page should open")
	public void page_should_open() {
		String Expected_URL = ("https://cinimitra.azurewebsites.net/");
		String Actual_url = driver.getCurrentUrl();
		// System.out.println("Current url is"+ Actual_url);
		if (Actual_url.contentEquals(Expected_URL)) {
			System.out.println("Condition passed");
		} else {
			System.out.println("Condition failed");
		}
		
		testcreation("Page should open");
	}

// -----------------------------------------------------------------------------------------------------------

@Test
	@Given("Click_Login_Button")
	public void click_login_button() {
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		testcreation("Login");
	}
@Test
	@Given("Enter_UserName")
	public void enter_user_name() {
	
		WebElement scrl = driver.findElement(By.xpath("//input[@id='UserName'])[1]"));
		scrl.sendKeys("Kannan@gmail.com");
		
		 testcreation("Username Eneterd Successfully");
	}
@Test
	@Given("Enter_Password")
	public void enter_password() {
		driver.findElement(By.xpath("//input[@id='Password'])[1]")).sendKeys("Kum@12345");
		 testcreation("Password Eneterd Successfully");

	}
@Test
	@When("Click_Login")
	public void click_login() {
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		testcreation("Submit Button Clicked");
 
	}
@Test
	@Then("User_Shouldbe_Login")
	public void user_shouldbe_login() {
		String S = "https://cinimitra.azurewebsites.net/Dashboard/Welcome";
		String A = driver.getCurrentUrl();
		// System.out.println(A);

		if (A.contains(S)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
		testcreation("User Logined Successfully");
		
}
@Test
	@Then("click Welcome button")
	public void click_welcome_button() {
	   driver.findElement(By.xpath("//a[text()='Project Profile']")).click();
	   testcreation("click Welcome button");
	}
}
	















