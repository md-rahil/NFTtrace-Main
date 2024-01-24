package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminPlannerPage {
	public WebDriver driver;
	
	public SuperAdminPlannerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Create Category')]")
	private WebElement createCategoryinPlanner;
	
	public WebElement getCreateCategoryPlanner()
	{
		return createCategoryinPlanner;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement categoryNameinPlanner;
	
	public WebElement getCategoryNameinPlanner()
	{
		return categoryNameinPlanner;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtoninPlanner;
	
	public WebElement getSubmitButtoninPlanner()
	{
		return submitButtoninPlanner;
	}

	
	@FindBy(xpath="//tbody/tr[1]/td[4]/i[1]")
	private WebElement editIconinPlanner;
	
	public WebElement getEditIconinPlanner()
	{
		return editIconinPlanner;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/i[2]")
	private WebElement deleteIconinPlanner;
	
	public WebElement getDeleteIconinPlanner()
	{
		return deleteIconinPlanner;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitofDeleteCategory;
	
	public WebElement getSubmitofDeleteCategory()
	{
		return submitofDeleteCategory;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/i[3]")
	private WebElement dropdowntoCreateEvent;
	
	public WebElement getDropdowntoCreateEvent()
	{
		return dropdowntoCreateEvent;
	}
	
	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/p[1]/div[1]/button[1]")
	private WebElement createEventButton;
	
	public WebElement getCreateEventButton() {
		return createEventButton;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement categoryEventName;
	
	public WebElement getCategoryEventName()
	{
		return categoryEventName;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtoninCreateEvent;
	
	public WebElement getSubmitButtoninCreateEvent()
	{
		return submitButtoninCreateEvent;
	}
	
	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/i[1]")
	private WebElement editIconinEvent;
	
	public WebElement getEditIconinEvent()
	{
		return editIconinEvent;
	}
	
	@FindBy(xpath="//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/i[2]")
	private WebElement deleteIconinEvent;
	
	public WebElement getDeleteIconinEvent()
	{
		return deleteIconinEvent;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitinDeleteEvent;
	
	public WebElement getSubmitinDeleteEvent()
	{
		return submitinDeleteEvent;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement searchBarinPlanner;
	
	public WebElement getSearchBarinPlanner()
	{
		return searchBarinPlanner;
	}
	
	
	
}
