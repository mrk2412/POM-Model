package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import pages.HomePage;
import pages.LoginPage;
@Test
public class Login_TC1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		
		HomePage home = new HomePage(driver);		
		LoginPage login = new LoginPage(driver);	
		
		home.clickLogin();
		
		login.enterUsername("mahesh_24");
		login.enterPassword("Pass@123");
		
         driver.quit();
         System.out.println("Test Completed");
	}
   
}