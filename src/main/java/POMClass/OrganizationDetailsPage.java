package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationDetailsPage {
	
	public WebDriver driver;
	
	public OrganizationDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='organizationName']")
	
	////input[@id='organizationName']
	private WebElement organizationName;
	
	public WebElement getOrganizationName()
	{
		return organizationName;
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
		return  addressLine2;
	}
	
	@FindBy(xpath="//select[@id='country']")
	private WebElement countryinOrganizationDetails;
	
	public WebElement getCountryinOrganizationDetails()
	{
		return countryinOrganizationDetails;
	}
	
	
	@FindBy(xpath="//select[@id='state']")
	private WebElement stateinOrganizationDetails;
	
	public WebElement getStateinOrganizationDetails()
	{
		return stateinOrganizationDetails;
	}
	
	
	@FindBy(xpath="//select[@id='city']")
	private WebElement cityinOrganizationDetails;
	
	public WebElement getCityinOrganizationDetails()
	{
		return cityinOrganizationDetails;
	}
	
	
	@FindBy(xpath="//input[@id='zipcode']")
	private WebElement zipcode;
	
	public WebElement getZipcode()
	{
		return zipcode;
	}
	
	
	@FindBy(xpath="//input[@id='GSTIN']")
	private WebElement GSTIN;
	
	public WebElement getGSTIN() {
		return GSTIN;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	private WebElement updateinOrganizatioDetails;
	
	public WebElement getUpdateinOrganization()
	{
		return updateinOrganizatioDetails;
	}
	
	
	
	
}
