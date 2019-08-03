package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EveningTry {
@Test
public void Evening() {
	System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
				driver.findElement(By.id("email")).sendKeys("ekrchowdhu@sbcglobal.net");
				driver.findElement(By.name("pass")).sendKeys("nabil2003");
				driver.findElement(By.name("login")).click();
	
}
}