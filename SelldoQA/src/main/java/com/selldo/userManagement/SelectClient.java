package com.selldo.userManagement;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class SelectClient extends ReusableUtils {

	WebDriver driver;
	
	public SelectClient(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(how=How.ID,using="s2id_input-search-field")
	private WebElement ClickOnSearchBar;
	@FindBy(how=How.ID,using="search_clients")
	private WebElement EnterClientName;
	@FindBy(how=How.ID,using="search_clients")
	private WebElement ClickOnSearch;
	@FindBy(how=How.XPATH,using="//div[@class='select2-result-label']")
	private List<WebElement> Suggation;
	
	
	public void selectClient(String ClientName) {
		ClickOnSearchBar.click();
		waitUntilVisiblity(EnterClientName).sendKeys(ClientName);
		//EnterClientName.sendKeys(Keys.ENTER);
		Suggation.get(0).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickOnSearch.click();		
	}
	
}
