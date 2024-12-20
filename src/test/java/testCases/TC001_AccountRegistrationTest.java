package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass
{

	@Test(groups={"Regression","Master"})
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		Thread.sleep(3000);
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeAlphaNumeric()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		String pwd=randomeAlphaNumeric();
		regpage.setPassword(pwd);
		regpage.setConfirmPassword(pwd);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		Thread.sleep(3000);
		
		String msg=regpage.getConfirmationMsg();
		Assert.assertEquals(msg, "Your Account Has Been Created!");
	
	}
	
}
