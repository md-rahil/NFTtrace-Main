package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCategory {
	
	public WebDriver driver;
	
	public CreateCategory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Create Category')]")
	private WebElement createCategoryinCertificate;
	

	public WebElement getCreateCategoryinCertificate()
	{
		return createCategoryinCertificate;
	}
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement categoryNameofCertificate;
	
	public WebElement getCategoryNameofCertificate()
	{
		return categoryNameofCertificate;
	}
	
	@FindBy(xpath="//input[@id='image']")
	private WebElement chooseFileinCreateCategory;
	
	public WebElement getChooseFileinCreateCategory()
	{
		return chooseFileinCreateCategory;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")
	private WebElement icon;
	
	public WebElement getIcon()
	{
		return icon;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/input[1]")
	private WebElement polygonRadioButton;
	
	public WebElement getPolygonRadioButton()
	{
		return polygonRadioButton;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/input[1]")
	private WebElement avalancheRadioButton;
	
	public WebElement getAvalancheRadioButton()
	{
		return avalancheRadioButton;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtonofcreateCategory;
	
	public WebElement getSubmitButtonofCreateCategory()
	{
		return submitButtonofcreateCategory;
	}
	
//	@FindBy(xpath="//tbody/tr[1]/td[3]/i[1]")
//	private WebElement editButtoninCertificateCategory;
//	
//	public WebElement getEditButtoninCertificateCategory()
//	{
//		return editButtoninCertificateCategory;
//	}
//	
//	
//	@FindBy(xpath="//tbody/tr[1]/td[3]/i[2]")
//	private WebElement deleteButtoninCertificateCategory;
//	
//	public WebElement getDeleteButtoninCertificateCategory()
//	{
//		return deleteButtoninCertificateCategory;
//	}
	
//	
//	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
//	private WebElement searchBarinCertificateCategory;
//	
//	public WebElement getSearchBarinCertificateCategory()
//	{
//		return searchBarinCertificateCategory;
//	}
}
