package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRecipientPage {
	
	public WebDriver driver;
	
	public CreateRecipientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Single Recipient')]")
	private WebElement singleRecipientLink;
	
	public WebElement getSingleRecipientLink()
	{
		return singleRecipientLink;
	}
	
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstnameTextField;
	
	public WebElement getFirstnameTextField()
	{
		return firstnameTextField; 
	}
	
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastnameTextField;
	
	public WebElement getLastnameTextField()
	{
		return lastnameTextField;
	}

	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTextField;
	
	public WebElement getEmailTextField()
	{
		return emailTextField;	
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")
	private WebElement phoneNumberTextField;
	
	public WebElement getPhoneNumberTextField()
	{
		return phoneNumberTextField;
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTextField;
	
	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}
	
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	private WebElement confirmPasswordTextField;
	
	public WebElement getConfirmPasswordTextField()
	{
		return confirmPasswordTextField;
	}
	
	@FindBy(xpath="//input[@id='file']")
	private WebElement chooseFileField;
	
	public WebElement getChooseFileField()
	{
		return chooseFileField;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButton;
	
	public WebElement getSubmitButton()
	{
		return submitButton;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/input[2]")
	private WebElement generateWalletAddress;
	
	public WebElement getGenerateWalletAddress()
	{
		return generateWalletAddress;
	}
	
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/i[2]")
	private WebElement deleteButtoninRecipient;
	
	public WebElement getDeleteButtoninRecipient()
	{
		return deleteButtoninRecipient;
	}
	
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/i[1]")
	private WebElement editButtoninRecipient;
	
	public WebElement getEditButtoninRecipient()
	{
		return editButtoninRecipient;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtonofDelete;
	
	public WebElement getSubmitButtonofDelete()
	{
		return submitButtonofDelete;
	}
	
//	
//	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
//	private WebElement searchBarinRecipient;
//	
//	public WebElement getSearchBarinRecipient()
//	{
//		return searchBarinRecipient;
//	}
//	
}
