package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public WebDriver driver;
	
public SignUpPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='firstName']")
private WebElement firstNameinSignup;

public WebElement getFirstNameinSignup()
{
	return firstNameinSignup;
}


@FindBy(xpath="//input[@id='lastName']")
private WebElement lastNameinSignup;

public WebElement getLastNameinSignup()
{
	return lastNameinSignup;
}


@FindBy(xpath="//body/div[@id='__next']/div[@id='page-top']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/input[1]")
private WebElement emailinSignUp;

public WebElement getEmailinSignUp()
{
	return emailinSignUp;
}


@FindBy(xpath="//body/div[@id='__next']/div[@id='page-top']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/button[1]/label[1]")
private WebElement verifyofEmail;

public WebElement getVerifyofEmail()
{
	return verifyofEmail;
}


@FindBy(xpath="//body/div[@id='__next']/div[@id='page-top']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/input[1]")
private WebElement phonenuminSignUp;

public WebElement getPhonenuminSignUp()
{
	return phonenuminSignUp;
}


@FindBy(xpath="//body/div[@id='__next']/div[@id='page-top']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/button[1]/label[1]")
private WebElement verifyofPhonenum;

public WebElement getVerifyofPhonenum()
{
	return verifyofPhonenum;
}


@FindBy(xpath="//body/div[@id='__next']/div[@id='page-top']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/input[1]")
private WebElement organizationName;

public WebElement getOrganizationName()
{
	return organizationName;
}


@FindBy(xpath="//select[@id='industry']")
private WebElement selectIndustryType;

public WebElement getSelectIndustryType()
{
	return selectIndustryType;
}




}
