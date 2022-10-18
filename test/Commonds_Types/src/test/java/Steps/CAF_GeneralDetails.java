package Steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 
import Base.Base_Class;
import io.cucumber.java.en.*;

public class CAF_GeneralDetails extends Base_Class{

	 
    @Test
	@Given("Enter the Name Of Producer")
	public void enter_the_name_of_producer() {
		WebElement a = driver.findElement(By.id("ApplicantName"));
		a.sendKeys("Azar");
		testcreation("ApplicantName Entered");
	}
    @Test
	@Given("Enter Mobile No")
	public void enter_mobile_no() {
		WebElement b = driver.findElement(By.id("ApplicantMoblNum"));
		b.sendKeys("+91 7080605040");
		testcreation("ApplicantMoblNum Entered");
	}
    @Test
	@Given("Enter Email")
	public void enter_email() {
		WebElement c = driver.findElement(By.id("ApplicantEmail"));
		c.sendKeys("azarlaf@gmail.com");
		testcreation("ApplicantEmail Entered");
	}
    @Test
	@Given("Enter Date Of Birth")
	public void enter_date_of_birth() {
		WebElement d = driver.findElement(By.id("ApplicantDOB"));
		d.sendKeys("01/06/1999");
		testcreation("ApplicantDOB Entered");
	}
    @Test
	@Given("Enter Leading Artist Name")
	public void enter_leading_artist_name() {
		WebElement e = driver.findElement(By.id("LeadingArtists"));
		e.sendKeys("SR,JP,AN,PP");
		testcreation("LeadingArtists Names Entered");
	}
    @Test
	@Given("Enter Name Of The Project")
	public void enter_name_of_the_project() {
		WebElement f = driver.findElement(By.id("ProjectId"));
		f.isDisplayed();
		testcreation("ProjectId Entered");
	}
}
