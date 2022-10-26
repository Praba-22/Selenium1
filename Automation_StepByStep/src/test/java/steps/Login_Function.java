package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base_class;
import io.cucumber.java.en.*;

public class Login_Function extends Base_class{


	@Given("Verify the Login Page Opened")
	public void verify_the_login_page_opened() {
	 
		create_test("Login Page", "Verify Login Page Opened");
		System.out.println("Verifying Login Page");
		String Exp_page ="https://cinimitra.azurewebsites.net/Home/Login";
		String Actual_page=driver.getCurrentUrl();
		if (Actual_page.contentEquals(Exp_page)) {
			tes.pass("Page Verified");
		}

		else {
			tes.fail("Expect page is not Verified");
		}
	}


	@Given("Enter the <{string} and {string}")
	public void enter_the_and(String string, String string2) {
		
	create_test("Enter Username and Password", "Verify the User Credentials");
	
	WebElement Username=driver.findElement(By.xpath("(//input[@id='UserName'])[1]"));
	Username.sendKeys(string);
		
	WebElement Password = driver.findElement(By.xpath("(//input[@id='Password'])[1]"));
	Password.sendKeys(string2);
	tes.pass("Username and Password Entered Successfully");

	}

	@Given("Click Login button")
	public void click_login_button() {
		
		create_test("Click Login Button", "Verify Login Button is Clickable");
		WebElement log= driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		log.submit();
        String temp= driver.getPageSource();
		if (temp.contains("Kannan Krishna")) {
			tes.pass("Login Successfull");
		}
		else {
			tes.fail("Login Failed");
		}
	}

	@Then("Verify the Login button is Clicked")
	public void verify_the_login_button_is_clicked() {
		
		create_test("Login Functionality", "Verify Login Functionality");
		String Exp_page = "https://cinimitra.azurewebsites.net/Dashboard/Welcome";
		String Act_page = driver.getCurrentUrl();
		if (Act_page.contentEquals(Exp_page)) {
			tes.pass("Navigated to Exp Page");
		}
		else {
			tes.fail("Page did not opened");
		}
		
		Report_flush();
	}



}
