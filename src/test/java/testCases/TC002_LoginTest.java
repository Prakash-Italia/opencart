package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass
{
	
	@Test(groups={"Sanity","Master"})
	public void verify_login() throws InterruptedException
	{
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	Thread.sleep(3000);
	
	LoginPage lp=new LoginPage(driver);
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	lp.clickLogin();
	Thread.sleep(3000);
	
	MyAccountPage pg = new MyAccountPage(driver);
	Boolean targetpage=pg.isMyAccountPageExist();
	Assert.assertTrue(targetpage);
	pg.clickLogout();
	
	}
}
