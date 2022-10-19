package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterSignup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationProject\\jar_files\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
		
				driver.get("https://www.facebook.com/");
					driver.manage().window().maximize();
						driver.findElement(By.xpath(".//*[@id=\"u_0_0_3J\"]")).click();
						driver.findElement(By.xpath(".//*[@id=\"u_8_b_Kk\"]")).sendKeys("Robert");
					
						
	}
	
	

}
