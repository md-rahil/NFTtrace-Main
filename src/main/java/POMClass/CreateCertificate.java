package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCertificate {
	
	public WebDriver driver;
	
	public CreateCertificate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement searchBarofCertificate;
	
	public WebElement getSearchBarofCertificate()
	{
		return searchBarofCertificate;
	}
	
	
	@FindBy(xpath="//p[text()=' Certificates']")
	private WebElement searchedCategory;
	
	public WebElement getSearchedCategory()
	{
		return searchedCategory;
	}
	@FindBy(xpath="//button[contains(text(),'Create Certificate')]")
	private WebElement createCertificate;
	
	public WebElement getCreateCertificate()
	{
		return createCertificate;
	}

	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement singleCertificate;
	
	public WebElement getSingleCertificate()
	{
		return singleCertificate;
	}
	
	
	@FindBy(xpath="//select[@id='user']")
	private WebElement selectRecipient;
	
	public WebElement getSelectRecipient()
	{
		return selectRecipient;
	}
	
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement certificateName;
	
	public WebElement getCertificateName()
	{
		return certificateName;
	}
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement descriptionInCertificate;
	
	public WebElement getDescriptioninCertificate()
	{
		return descriptionInCertificate;
	}
	
	
	@FindBy(xpath="//input[@id='image']")
	private WebElement chooseFileofCertificate;
	
	public WebElement getChooseFileofCertificate()
	{
		return chooseFileofCertificate;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/select[1]")
	private WebElement selectFormofCertificate;
	
	
	public WebElement getSelectFormofCertificate()
	{
		return selectFormofCertificate;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement nextofCreateCertificate;
	
	public WebElement getNextofCreateCertificate()
	{
		return nextofCreateCertificate;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	private WebElement placeholderLabel;
	
	public WebElement getPalceHolderLabel()
	{
		return placeholderLabel;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")
	private WebElement numberInputplaceHolderLabel;
	
	public WebElement getnumberInputPlaceholderLabel()
	{
		return numberInputplaceHolderLabel;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/textarea[1]")
	private WebElement multiplaceHolderLabel;
	
	public WebElement getMultiPlaceholderLabel()
	{
		return multiplaceHolderLabel;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	//
	private WebElement submitofCreateCertificate;
	
	public WebElement getSubmitofCreateCertificate()
	{
		return submitofCreateCertificate;
	}
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelButton;
	
	public WebElement getCancelButton()
	{
		return cancelButton;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement searchBartoViewCertificate;
	
	public WebElement getSearchBartoViewCertificate()
	{
		return searchBartoViewCertificate;
	}
	
	@FindBy(xpath="//div[@class='gy-5 row'and@xpath='1']")
	private WebElement searchedElementtoView;
	
	public WebElement getSearchedElementtoView()
	{
		return searchedElementtoView;
	}
	
	@FindBy(xpath="//button[contains(text(),'Renew')]")
	private WebElement renewCertificate;
	
	public WebElement getRenewCertificate()
	{
		return renewCertificate;
	}
	
	@FindBy(xpath="//textarea[@id='reasonForUpdate']")
	private WebElement reasonforRenewal;
	
	public WebElement getReasonforRenewal()
	{
		return reasonforRenewal;
	}
	
	
	@FindBy(xpath="//input[@id='image']")
	private WebElement chooseFileinRenewal;
	
	public WebElement getChooseFileinRenewal()
	{
		return chooseFileinRenewal;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/select[1]")
	private WebElement selectForminRenewal;
	
	public WebElement getSelectForminRenewal()
	{
		return selectForminRenewal;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Download')]")
	private WebElement downloadCertificate;
	
	public WebElement getDownloadCertificate()
	{
		return downloadCertificate;
	}
	
	
	
	
}
