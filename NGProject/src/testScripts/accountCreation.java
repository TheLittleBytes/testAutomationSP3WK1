package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class accountCreation {

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


@Test(priority = 5)

public void testOne() {
	System.out.println("Test One");

	Assert.assertEquals("Test", "Test");

}

@Test(priority = 1)

	public void testFive() {
		
//	boolean actual = ps.getsignup().isEnabled();
	System.out.println("Test One");

		

}

@Parameters ({"firstName", "lastName", "userName", "password"})
@Test(enabled = false)

	public void testTwo(String firstName, String lastName, String userName, String password) {
		System.out.println("Test Two");
		Reporter.log("Testing if logs about a test method is visible");
		Assert.assertTrue(true);
}


@Test(priority = 4)

public void testFour() {
	System.out.println("Test Three");

	String expectedURL = "https://login.yahoo.com/account/create?.lang=en-PH&.intl=ph&.src=yhelp";
	String actualURL = driver.getCurrentUrl();
	
	Assert.assertEquals(expectedURL, actualURL);
}


@Test(enabled = false)

	public void testThree() {
		System.out.println("Test Three");

		String expectedURL = "https://login.yahoo.com/account/create?.lang=en-PH&.intl=ph&.src=yhelp";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedURL, actualURL);
}

@AfterMethod

	public void afterMethod() {
		System.out.println("After Method");
	}


@AfterTest
	
	public void closeapplication() {
		
		driver.close();
		System.out.println("close window");
}



}

