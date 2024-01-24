package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	

	public WebDriver driver;
	
	public ChangePasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='currentPassword']")
	private WebElement currentPassword;
	
	public WebElement getCurrentPassword()
	{
		return currentPassword;
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement newPasswordinChangePassword;
	
	public WebElement getNewPasswordinChangePassword()
	{
		return newPasswordinChangePassword;
	}
	
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	private WebElement confirmPasswordinChangePassword;
	
	public WebElement getConfirmPasswordinChangePassword()
	{
		return confirmPasswordinChangePassword;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	private WebElement updateinChangePassword;
	
	
	public WebElement getUpdateinChangePassword()
	{
		return updateinChangePassword;
	}

	
	
}
