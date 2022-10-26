package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	public static WebDriver driver;
	public static ExtentHtmlReporter reports;
	public static ExtentReports extrep;
	public static ExtentTest tes;

	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cinimitra.azurewebsites.net/");
	}

	public static void report() {
		reports = new ExtentHtmlReporter("extent.html");

		extrep = new ExtentReports();
		extrep.attachReporter(reports);
	}

	public static void create_test(String Test_name ,String Verify_functionality ) {
		tes = extrep.createTest(Test_name, Verify_functionality );
	}

	public static void Report_flush() {
		extrep.flush();
	}



}
