package com.selldo.UserManagment;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.selldo.POM.login.LoginPage;
import com.selldo.Utility.BaseTest;
import com.selldo.userManagement.SelectClient;

public class UserManagment extends BaseTest {
	
	private SelectClient selectClient ;
	
	@Test
	public void manageUser() {
		LoginPage A = new LoginPage(driver);
		selectClient= A.login(prop.getProperty("id"), prop.getProperty("pswd"));
		selectClient.selectClient("AniketBuisnessNameMain");
		
	}
	@Test
	public void M1() {
		Assert.assertTrue(true);
	}
	@Test
	public void M12(){
		Assert.assertTrue(true);

	}
	@Test
	public void M13() {
		Assert.assertTrue(true);

	}
	@Test
	public void M122() {
		Assert.assertTrue(true);

	}
	@Test
	public void M153() {
		Assert.assertTrue(true);

	}
	@Test
	public void M124(){
		Assert.assertTrue(true);

	}
	@Test
	public void M143() {
		Assert.assertTrue(true);

	}
	@Test
	public void M1252() {
		Assert.assertTrue(true);

	}
	@Test
	public void M155() {
		Assert.assertTrue(true);

	}
}

