package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithDaraz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.lk/");     //open web page
		
		WebElement signin = driver.findElement(By.linkText("LOGIN"));    //go to sign in page
		signin.click();
		
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input"));  //enter the email
		username.sendKeys("mailtesting876@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input"));    // enter password
		password.sendKeys("test@1234");
		
		WebElement Signin = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button"));     //signing in
		Signin.click();
		
		WebElement searchbar = driver.findElement(By.id("q"));
		searchbar.sendKeys("womens' handbag"+Keys.ENTER);
		
		WebElement blackcolor = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div[7]/div[2]/div/div[1]/label[1]/span[1]/input"));
		blackcolor.click();
		
		
	
	}

}
