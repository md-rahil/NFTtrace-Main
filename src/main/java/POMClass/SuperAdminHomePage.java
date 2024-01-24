package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminHomePage {
	public WebDriver driver;
	
	public SuperAdminHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[2]/div[1]/span[1]")
    private WebElement projectLink;
	
	public WebElement getProjectLink()
	{
		return projectLink;
	}
	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[2]/div[1]/span[1]")
	private WebElement organizationLink;
	
	public WebElement getOrganizationLink()
	{
		return organizationLink;
	}
	
	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[2]/div[1]/span[1]")
	private WebElement modellerLink;
	
	public WebElement getModellerLink()
	{
		return modellerLink;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[2]/div[1]")
	private WebElement plannerLink;
	
	public WebElement getPlannerLink()
	{
		return plannerLink;
	}
}
