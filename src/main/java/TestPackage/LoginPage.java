package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	//WebElement username = driver.findElement(By.xpath("//input[@id='userEmail']"));
	//PageFactory concept
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement loginbutton;
	
	
	//ActionMethods
	
	
	public void enviornment() {
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	}
	
	public void loginactions(String email,String pass ) {
		
		username.sendKeys(email);
		password.sendKeys(pass);
		loginbutton.click();
	}
	
}
