package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
@Test
public void Logintest() {
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.techfios.com");
//	
//	driver.findElement(By.id("email")).sendKeys("ekrchowdhu@sbcglobal.net");
//	driver.findElement(By.id("pass")).sendKeys("nabil2003");
//	 driver.findElement(By.className("search")).sendKeys("Techfios");
//	 
}
}