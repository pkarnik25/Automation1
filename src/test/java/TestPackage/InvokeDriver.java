package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriverManager.chromedriver().setup(); 
		 WebDriver driver = new ChromeDriver();
		 
		
		
		
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enviornment();
		loginpage.loginactions("testaccount25@gmail.com", "Password@123");
		
		
		
	}

}
