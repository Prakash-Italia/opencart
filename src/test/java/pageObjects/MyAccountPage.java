package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);	
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement message;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement btnLogout;
	
	public boolean isMyAccountPageExist()
	
		{
			return (message.isDisplayed());
		}
	
	public void clickLogout() {
		
		btnLogout.click();
		
	}
		
	}

