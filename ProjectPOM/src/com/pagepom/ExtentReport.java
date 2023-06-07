package com.pagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;

//import com.aventstack.extentreports.ExtentReports;

public class ExtentReport {
	WebDriver driver;
	ExtentReports extentReporter;
	long startTime;
	long endTime;
	@BeforeSuite
	private void LaunchBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Guru\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();

	}
	
	@Test
	private void openGoogle() {
		driver.get("https://www.google.com/");
		}
	@Test
	private void openBing() {
		driver.get("https://www.bing.com/");
		}
	@Test
	private void openYahoo() {
		driver.get("https://www.yahoo.com/");
		}
	@AfterSuite
	private void CloseBrowser() {
		extentReporter= new ExtentReports();
		 driver.quit();
		 
		endTime=System.currentTimeMillis();
		long Totaltime=endTime-startTime;
		System.out.println("Total time taken "+Totaltime);

	}
}
