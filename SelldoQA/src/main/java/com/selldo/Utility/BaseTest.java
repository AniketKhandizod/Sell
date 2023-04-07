package com.selldo.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public Properties prop ;
	@BeforeMethod(alwaysRun=true)
	public void browserConfig() throws FileNotFoundException, IOException {
		
	    prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"/config.properties"));
		WebDriverManager.chromedriver().setup();
		
		if(prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		}
	}
	@AfterMethod(alwaysRun=true)
	public void terminate() {
		driver.quit();
	}
	public String getScreenshot(String fileName,WebDriver driver) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File file =ts.getScreenshotAs(OutputType.FILE);
		File filee = new File (System.getProperty("user.dir")+"//reports//"+fileName+".png");
		FileUtils.copyFile(file, filee);
		return System.getProperty("user.dir")+"//reports//"+fileName+".png";
	}
}
