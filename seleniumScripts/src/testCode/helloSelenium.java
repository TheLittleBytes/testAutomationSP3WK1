package testCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProject\\jar_files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

	}

}
