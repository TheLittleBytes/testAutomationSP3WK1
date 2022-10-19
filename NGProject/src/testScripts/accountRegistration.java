package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class accountRegistration {

	WebDriver driver;
	
	@BeforeTest
	
		public void setupAccount() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProject\\jar_files\\chromedriver.exe");
			
			driver = new ChromeDriver();
	
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://login.yahoo.com/account/create?.lang=en-PH&.intl=ph&.src=yhelp");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("Before Test");
	}
	
	
	@BeforeMethod
	
		public void beforeMethod() {
			System.out.println("Before Method");
	}
	
	
	@Test(priority = 1)
	
		public void testOne() {
			System.out.println("Test One");
	}
	
	@Test(priority = 2)
	
		public void testTwo() {
			System.out.println("Test Two");
	}

	

	@Test(enabled = false)

		public void testThree() {
			System.out.println("Test Three");
	}

	@AfterMethod
	
		public void afterMethod() {
			System.out.println("After Method");
		}
	
	
	@AfterTest
		
		public void closeapplication() {
			driver.quit();
			System.out.println("close window");
	}
	
	
	
}
