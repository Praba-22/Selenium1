package steps;
import org.openqa.selenium.By;
import base.Base_class;
import io.cucumber.java.en.*;

public class Login_PreCondition extends Base_class {


	@Given("Access the Browser")
	public void access_the_browser() {
		report();
		create_test("Open the Browser", "Verifying the Browser is Accessable");
		browser();
		tes.pass("success");
	}
	
	@When("Navigate to the CiniMitra Page")
	public void navigate_to_the_cini_mitra_page() {
		create_test("Open the CiniMitra Page","Verifying the Navigation to the Expected Page");
		String Actual_page = driver.getCurrentUrl(); 
		String Expect_Page ="https://cinimitra.azurewebsites.net/";


		if (Actual_page.contains(Expect_Page)) {
			tes.pass("CiniMitra Page Opened ");
		}
		else {
			tes.fail("Page not Opened");
		} 
	}
	

	@When("Click Login Button")
	public void click_login_button() {
		create_test("Click the Login Button","Verifying the Login button is Clickable");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		tes.pass("Login Button Clicked");
	}
	

	@Then("Vevcrify the Login Butt on Clicked")
	public void vevcrify_the_login_butt_on_clicked() {
		create_test("Verify Login button Functionality", "Verifying the Page Navigate to Next Page");
		String check = driver.getCurrentUrl();
		String verify = "https://cinimitra.azurewebsites.net/Home/Login";

		if (check.contentEquals(verify)) {
			tes.pass("Login Success");
		}
		else {
			tes.fail("Login Failed");
		}
		

	}
}
