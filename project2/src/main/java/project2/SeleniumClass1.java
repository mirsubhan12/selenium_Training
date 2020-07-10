package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumClass1 {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", 
//			"C:/Users/User/git/training_repo/project2/driver/chromedriver.exe");
//	WebDriver driver  = new ChromeDriver();
//	driver.get("https://www.facebook.com");
//System.setProperty("webdriver.edge.driver", 
//       	"C:/Users/User/Desktop/Java_Selenium_Training/MSEDGEDRIVER.EXE");
//	WebDriver driver = new EdgeDriver();
//	driver.get("https://twitter.com/login?lang=en");
//	Sel a1 = New Sel;
	Sel tstcase = new Sel();
	tstcase.wd();
	// firefox 
	
	// you have to open mozilla and internet explorer 
	  
}

public void test1(){
	/*
	 * 1 - Open http://newtours.demoaut.com/
	 * 2 - Click on Register link
	 * 
	 * 
	 */
}

}

class Sel{
	
	By registerLink = By.linkText("REGISTER");
	By firstName = By.name("firstName");
	
	
	 void wd(){
		System.setProperty("webdriver.chrome.driver", 
		"C:/Users/User/git/training_repo/project2/driver/chromedriver.exe");
			WebDriver driver  = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
//			By txt1 = By.name("q"); // ref of locator
//	
//			WebElement txtElement = driver.findElement(txt1); // Webelement finding
//			txtElement.sendKeys("Ali",Keys.ENTER);
			
			
			WebElement resgisteElement  = driver.findElement(registerLink);
			resgisteElement.click();
			
			
			WebElement firstNameElement  = driver.findElement(firstName);
			firstNameElement.sendKeys("firstaname");
			
			
			
			
			
			// name
			// id
			// links = tagname = a
		
	}
}