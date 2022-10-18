package Steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base_Class;
import io.cucumber.java.en.*;


public class Get_Submited_project extends Base_Class {
 
@Test
	@Given("click and Enter the movie name")
	public void click_and_enter_the_movie_name() {
		WebElement Search = driver.findElement(By.xpath("(//input[@type='search'])[1]"));
		Search.sendKeys("Edge of Tommorow");
		testcreation("Movie name Eneterd Successfully");
	}
@Test
	@When("click the submited project")
	public void click_the_submited_project() {
		driver.findElement(By.name("Edge of Tommorow)[1]")).click();
		System.out.println("Movie Name Entered");
		testcreation("Selected Submited Project");
	}
@Test
	@Then("page should navigate CAF page")
	public void page_should_navigate_caf_page() {
		String Exp_Navigate = ("https://cinimitra.azurewebsites.net/ProducerCAF/DashBoardCAF?ProdHouseID=255");
		String Act_Navigate = driver.getCurrentUrl();

		if (Act_Navigate.contains(Exp_Navigate)) {
			System.out.println("Navigated to CAF page");
		} else {
			System.out.println("Failed to Navigate");
		}
		testcreation("User Navigated to CAF page Successfully");
	}
@Test
	@And("click Apply button")
	public void click_apply_button() {
		driver.findElement(By.xpath("//a[text()='Apply ']")).click();
		System.out.println("Apply Button Clicked");
		testcreation("Apply Button Clicked");
	}	
	
}
