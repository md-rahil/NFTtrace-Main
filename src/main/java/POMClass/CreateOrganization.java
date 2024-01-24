package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {
	
	public WebDriver driver;
	
	public  CreateOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Create Organization')]")
	private WebElement createOrganization;
	
	public WebElement getCreateOrganization()
	{
		return createOrganization;
		
	}

	
	@FindBy(xpath="//input[@id='organizationName']")
	private WebElement organizationName;
	
	public WebElement getOrganizationName()
	{
		return organizationName;
	}
	
	@FindBy(xpath="//select[@id='type']")
	private WebElement selectIndustryType;
	
	public WebElement getSelectIndustryType()
	{
		return selectIndustryType;
	}
	
	@FindBy(xpath="//input[@id='GSTIN']")
	private WebElement GSTIN;
	
	public WebElement getGSTIN()
	{
		return GSTIN;
	}
	
	@FindBy(xpath="//input[@id='aadhaar']")
	private WebElement udyogAadhaar;
	
	public WebElement getUdyogAadhaar()
	{
		return udyogAadhaar;
	}
	
	
	@FindBy(xpath="//input[@id='pan']")
	private WebElement panTextField;
	
	public WebElement getPanTextField()
	{
		return panTextField;
	}
	
	
	@FindBy(xpath="//input[@id='AddressLine']")
	private WebElement addressLine1;
	
	public WebElement getAddressLine1()
	{
		return addressLine1;
	}
	
	
	@FindBy(xpath="//input[@id='AddressLine2']")
	private WebElement addressLine2;
	
	public WebElement getAddressLine2()
	{
		return addressLine2;
	}
	
	
	@FindBy(xpath="//select[@id='country']")
	private WebElement selectCountry;
	
	public WebElement getSelectCountry()
	{
		return selectCountry;
	}
	
	
	@FindBy(xpath="//select[@id='state']")
	private WebElement selectState;
	
	public WebElement getSelectState()
	{
		return selectState;
	}
	
	
	@FindBy(xpath="//select[@id='city']")
	private WebElement selectCity;
	
	public WebElement getSelectCity()
	{
		return selectCity;
	}
	
	
	@FindBy(xpath="//input[@id='zipcode']")
	private WebElement zipCode;
	
	public WebElement getZipCode()
	{
		return zipCode;
	}
	
	
	@FindBy(xpath="//input[@id='file']")
	private WebElement chooseFileofLogo;
	
	public WebElement getChooseFileofLogo()
	{
		return chooseFileofLogo;
	}
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement nextButtoninOrganization;
	
	public WebElement getNextButtoninOrganization()
	{
		return nextButtoninOrganization;
	}
	
	
	
	
	
}
