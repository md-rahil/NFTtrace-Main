package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	////for recipient 
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[2]/div[1]")
private WebElement recipient;
	
	public WebElement getRecipient()
	{
		return recipient;
	}
	
	@FindBy(xpath="//button[contains(text(),'Create Recipient')]")
	private WebElement createRecipient;
	
	public WebElement getCreateRecipient()
	{
		return createRecipient;
	}
	
	///for my AccountLink 
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[2]/button[1]/div[1]/div[1]")
	private WebElement myAccount;
	
	public WebElement getAccountLink()
	{
		return myAccount;
		
	}
	
	
	////for NFTDigital Certificate
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[2]/div[1]/span[1]")
	private WebElement nftDigitalCertificateLink;
	
	public WebElement getNFTDigitalCertificate() {
		return nftDigitalCertificateLink;
	}

	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]/span[1]")
	private WebElement certificateLink;
	
	public WebElement getCertificateLink()
	{
		return certificateLink;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement searchBar;
	
	public WebElement getSearchBar()
	{
		return searchBar;
	}
	
	
	@FindBy(xpath="//h5[@title='Automation']")
	private WebElement createdCategoryLink;
	
	public WebElement getCreatedCategoryLink()
	{
		return createdCategoryLink;
	}
	
	
	
	//for Nft digital certificate category
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[2]/span[1]")
	private WebElement certificateCategories;
	
	public WebElement getCertificateCategoriesLink()
	{
		return certificateCategories;
	}
	
	
	
	///for NFT Documents
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[2]/div[1]/span[1]")
	private WebElement nftDocumentLink;
	
	public WebElement getNFTDocumentLink()
	{
		return nftDocumentLink;
	}
	
	///for NFTDocuments under Documents
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[2]/span[1]")
	private WebElement documentsLink;
	
	public WebElement getDocumentsLink()
	{
		return documentsLink;
	}
	
	
	//// for NFT Categories under Documents
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[2]/span[1]")
private WebElement documentCategoriesLink;
	
	public WebElement getDocumentCategoriesLink()
	{
		return documentCategoriesLink;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Create Category')]")
	private WebElement createCategoryinDocument;
	
	public WebElement getCreateCategoryinDocument()
	{
		return createCategoryinDocument;
	}
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement categoryNameTextField;
	
	public WebElement getCategoryNameTextField()
	{
		return categoryNameTextField;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtoninCreateCategory;
	
	public WebElement getSubmitButtoninCreateCategory()
	{
		return submitButtoninCreateCategory;
	}
	
	
	///for Modeller 
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[2]/div[1]/span[1]")
	private WebElement modellerLink;
	
	public WebElement getModellerLink()
	{
		return modellerLink;
	}
}
