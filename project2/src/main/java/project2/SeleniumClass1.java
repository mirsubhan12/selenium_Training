package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:/Users/User/git/training_repo/project2/driver/chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
	// you have to open mozilla and internet explorer 
	  
}
}
