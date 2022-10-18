package Steps;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 
import Base.Base_Class;
import io.cucumber.java.en.Given;

public class CAF_LocationDetails extends Base_Class{

	
 
    
    @Test
	@Given("Enter the State")
	public void enter_the_state() {
	 driver.findElement(By.xpath("//option[text()='Karnataka']")).click();   
	 testcreation("State Entered");
	}
    
    @Test
	@Given("Enter the City")
	public void enter_the_city() {
	  driver.findElement(By.xpath("//option[text()='Tumkur']")).click();
	  testcreation("City Entered");
	}
    
    @Test
	@Given("Enter the Ward")
	public void enter_the_ward() {
	 driver.findElement(By.xpath("//option[text()='Attur']")).click();
	 testcreation("Ward Entered");
	}
    
    @Test
	@Given("Enter the ULB")
	public void enter_the_ulb() {
	 driver.findElement(By.xpath("//option[text()='Lokapur']")).click();
	 testcreation("ULB Entered");
	}
    
    @Test
	@Given("Enter the Location Type")
	public void enter_the_location_type() {
	List< WebElement> d = driver.findElements(By.xpath("//option[text()='Mountains and valleys']"));
	d.get(5);
	testcreation("Location Type Entered");
	//System.out.println(d);
	//System.out.println(d.size());
	 
	}

    @Test
	@Given("Enter the District")
	public void enter_the_district() {
	  driver.findElement(By.xpath("//option[text()='Belgaum']")).click();
	  testcreation("District Entered");
	}

    @Test
	@Given("Enter the Pincode")
	public void enter_the_pincode() {
	  driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("123456");
	  testcreation("Pincode Entered");
	}

    @Test
	@Given("Enter the Taluk")
	public void enter_the_taluk() {
	   driver.findElement(By.xpath("// option[text()='Chintamani']")).click();  
	   testcreation("Taluk Entered");
	}

    @Test
	@Given("Enter the Location")
	public void enter_the_location() {
	 driver.findElement(By.xpath("// input[@id='Location']")).sendKeys("Bangalore"); 
	 testcreation("Location Entered");
	System.out.println("Success");
	}
 

	
 
}
