package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("mailtesting876@gmail.com");
		
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("test@1234");
		
		WebElement Signin = driver.findElement(By.id("signInSubmit"));
		Signin.click();
		
		
		
		
		
		
		
		
	}

}
