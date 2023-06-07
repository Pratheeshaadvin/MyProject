package com.pomproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pagepom.LoginPage;

public class MainClass {
	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\POM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.demo.guru99.com/V4/");
		Thread.sleep(3000);
		LoginPage.email(driver).sendKeys("mngr495231");
		LoginPage.password(driver).sendKeys("judYpAn");
		LoginPage.Login(driver).click();
		
		
		

	}
}
