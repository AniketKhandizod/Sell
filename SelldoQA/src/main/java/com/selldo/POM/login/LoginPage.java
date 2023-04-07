package com.selldo.POM.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.userManagement.SelectClient;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {	
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.CSS,using="#user_email")
	private WebElement ids;
	@FindBy(how=How.CSS,using="#user_password")
	private WebElement password;
	@FindBy(how=How.XPATH,using="//*[text()='Sign in']")
	private WebElement signIn ;
	
	public SelectClient login(String userid , String passwd) {	
		ids.click();
		ids.sendKeys(userid);
		password.click();
		password.sendKeys(passwd);
		
		signIn.click();
		
		return new SelectClient(driver);
		
	}
}
