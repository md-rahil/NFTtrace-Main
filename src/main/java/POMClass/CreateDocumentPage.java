package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDocumentPage {
	
	public WebDriver driver;
	
	public CreateDocumentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Create Document')]")
	private WebElement createDocument;
	
	public WebElement getCreateDocument()
	{
		return createDocument;
	}
	
	
	@FindBy(xpath="//select[@id='user']")
	private WebElement selectRecipient;
	
	public WebElement getSelectRecipient()
	{
		return selectRecipient;
	}
	
	
	@FindBy(xpath="//select[@id='category']")
	private WebElement selectCategory;
	
	public WebElement getSelectCategory()
	{
		return selectCategory;
	}
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement documentName;
	
	public WebElement getDocumentName()
	{
		return documentName;
	}
	
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement descriptionofDocument;
	
	public WebElement getDescriptionOfDocument()
	{
		return descriptionofDocument;
	}
	
	
	@FindBy(xpath="//input[@id='image']")
	private WebElement chooseFileinDocument;
	
	public WebElement getChooseFileinDocument()
	{
		return chooseFileinDocument;
	}

	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtoninDocument;
	
	public WebElement getSubmitButtoninDocument()
	{
		return submitButtoninDocument;
	}
	
	
}
