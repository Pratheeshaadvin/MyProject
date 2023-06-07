package com.pagepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));

	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']"));

	}
	public static WebElement Login(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='submit']"));

	}
}
