package com.SentaraPatientHold.automatedTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class encounterDate {
	
	WebDriver driver;
	
	@Before
	
	public void beforeHook () {
		
	System.setProperty("webdriver.chrome.driver", "D:\\AutomationProject\\jar_files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	
	
	}

	@When("user enter {string}")
	public void user_enter(String string) {

	}
	
	@Given("user has access to credentials")
	public void user_has_access_to_credentials() {
	
	}

	@When("user enter username")
	public void user_enter_username() {

	}

	@When("user enter password")
	public void user_enter_password() {

	}

	@When("user click login button")
	public void user_click_login_button() {

	}

	@Then("user is able to access tmds")
	public void user_is_able_to_access_tmds() {

	}

	@Then("user able to log out from tmds")
	public void user_able_to_log_out_from_tmds() {

	}
	
	@Then("user is unable to access tmds")
	public void user_is_unable_to_access_tmds() {

	}

	@Then("user is still in login page")
	public void user_is_still_in_login_page() {
	
	}
	

	
	@After
		public void closeBrowser() {
		
		driver.close();
		
	}
		
	
}
