package com.selldo.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableUtils {

	WebDriver driver;
	
	public ReusableUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement waitUntilVisiblity(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(we));
		return we;
	}
}
