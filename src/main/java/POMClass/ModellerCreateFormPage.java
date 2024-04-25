package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModellerCreateFormPage {
	
	public WebDriver driver;
	
	public ModellerCreateFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[contains(text(),'Create Form')]")
	private WebElement createFormLink;
	
	public WebElement getCreateFormLink()
	{
		return createFormLink;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]")
	private WebElement textInputElement;
	
	public WebElement getTextInputElement()
	{
		return textInputElement;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]")
	private WebElement paragraphElement;
	
	public WebElement getParagraphElement()
	{
		return paragraphElement;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]")
	private WebElement numberInputElement;
	
	public WebElement getNumberInputElement()
	{
		return numberInputElement;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]")
	private WebElement multiLineInputElement;
	
	public WebElement getMultiLineInputElement()
	{
		return multiLineInputElement;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[3]")
	private WebElement saveButton;
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement formNameTextField;
	
	public WebElement getFormNameTextField()
	{
		return formNameTextField;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtoninForm;
	
	public WebElement getSubmitButtoninForm()
	{
		return submitButtoninForm;
	}
	
	@FindBy(xpath="//label[contains(text(),'Back')]")
	private WebElement backButton;
	
	public WebElement getBaackButton()
	{
		return backButton;
	}
	
	@FindBy(xpath="//label[contains(text(),'Preview')]")
	private WebElement previewButton;
	
	public WebElement getPreviewButton()
	{
		return previewButton;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement canceliconinPreview;
	
	public WebElement getCancelIconinPreview()
	{
		return canceliconinPreview;
	}
	
	@FindBy(xpath="//label[contains(text(),'Delete')]")
	private WebElement deleteButton;
	
	public WebElement getDeleteButton()
	{
		return deleteButton;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'DELETE')]")
	private WebElement deleteofDeleteButton;
	
	public WebElement getDeleteofDeleteButton()
	{
		return deleteofDeleteButton;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	private WebElement createNewFormDropdown;
	
	public WebElement getCreateNewFormDropdown()
	{
		return createNewFormDropdown;
	}
	
	@FindBy(xpath="//button[text()='Carrom']")
	private WebElement dropdownElement;
	
	public WebElement getDropdownElement()
	{
		return dropdownElement;
	}
}
