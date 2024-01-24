package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]")
	private WebElement myProfile;
	
	public WebElement getMyProfileLink()
	{
		return myProfile;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[2]")
	private WebElement organizationDetails;
	
	public WebElement getOrganizationDetailsLink()
	{
		return organizationDetails;
	}

	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[3]")
	private WebElement changePasswordLink;
	
	public WebElement getChangePasswordLink()
	{
		return changePasswordLink;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[4]")
	private WebElement walletDetails;
	
	public WebElement getWalletDetailsLink()
	{
		return walletDetails;
	}
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	private WebElement logoutButton;
	
	
	public WebElement getLogoutButton()
	{
		return logoutButton;
	}
	
}
