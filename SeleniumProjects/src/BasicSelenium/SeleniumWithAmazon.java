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
		driver.get("https://www.amazon.com/");     //open web page
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));    //go to sign in page
		signin.click();
		
		WebElement username = driver.findElement(By.id("ap_email"));  //enter the email
		username.sendKeys("mailtesting876@gmail.com");
		
		WebElement continuebutton = driver.findElement(By.id("continue"));  //press continue
		continuebutton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));    // enter password
		password.sendKeys("test@1234");
		
		WebElement Signin = driver.findElement(By.id("signInSubmit"));     //signing in
		Signin.click();
		
		WebElement allmenu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/a/i"));
		allmenu.click();
		
		WebElement seeall = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]"));
		seeall.click();
		
		WebElement womensfashion = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/ul[1]/li[5]/a/div"));
		womensfashion.click();
		
		WebElement handbag = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[12]/li[7]/a"));
		handbag.click();
		
		//select material
		
		WebElement canvasmaterial = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div/div/div/div[6]/ul[2]/li[1]/span/a/span"));
		canvasmaterial.click();
		
		//view item
		
		WebElement viewitem = driver.findElement(By.linkText("Michael Kors Women's Jet Set Item Crossbody Bag"));
		viewitem.click();
		
		// put to add to cart
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		WebElement proccedtocart = driver.findElement(By.id("proceed-to-checkout-action"));
		proccedtocart.click();
		
		
	
	}

}
