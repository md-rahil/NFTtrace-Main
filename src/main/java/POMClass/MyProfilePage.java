package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	public WebDriver driver;
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstNameofMyProfile;
	
	public WebElement getFirstNameofMyProfile()
	{
		return firstNameofMyProfile;
	}
	
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastNameofMyProfile;
	
	public WebElement getLastNameofMyProfile()
	{
		return lastNameofMyProfile;
	}
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailofMyProfile;
	
	public WebElement getEmailofMyProfile()
	{
		return emailofMyProfile;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/input[1]")
	private WebElement phonenumofMyProfile;
	
	public WebElement getPhonenumofMyProfile()
	{
		return phonenumofMyProfile;
	}
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
private WebElement updateinMyProfile;
	
	public WebElement getUpdateinMyProfile()
	{
		return updateinMyProfile;
	}
	
	
	
	
}
