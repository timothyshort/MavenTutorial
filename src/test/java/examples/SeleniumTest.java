package examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SeleniumTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://sdettraining.com/");
	  String pageTitle = driver.getTitle();
	  Assert.assertTrue(pageTitle.contains("SDET Training"));
	  if (pageTitle.contains("SDET Training")) {
		  System.out.println("TEST PASSED: PAGE TITLE AS EXPECTED");
	  }
	  else {
		  System.out.println("TEST FAILED: PAGE TITLE NOT AS EXPECTED");
	  }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Running Selenium Test");
	  System.setProperty("webdriver.chrome.driver", "C:/Users/owner/Desktop/SDET-June2017/JARs/chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
