package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POMClass.HomePage;
import POMClass.LoginPage;
import POMClass.ModellerCreateFormPage;

public class ModellerTestCase {
	
	@Test

	public void TC_Modeller() throws Throwable
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://dev-app.nfttrace.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("ecommerce@chaincodeconsulting.com");
		lp.getPasswordTextField().sendKeys("admin@123");
		lp.getLoginButton().click();

		HomePage hp=new HomePage(driver);
		
		hp.getModellerLink().click();
		Thread.sleep(3000);
		
		ModellerCreateFormPage mcp=new ModellerCreateFormPage(driver);
		mcp.getCreateFormLink().click();
		Thread.sleep(3000);
		
		mcp.getMultiLineInputElement().click();
		Thread.sleep(3000);
		
		mcp.getParagraphElement().click();
		Thread.sleep(3000);
		
		
		mcp.getNumberInputElement().click();
		Thread.sleep(3000);
		
		mcp.getTextInputElement().click();
		Thread.sleep(3000);
		
		mcp.getPreviewButton().click();
		Thread.sleep(3000);
		
		mcp.getCancelIconinPreview().click();
		Thread.sleep(3000);
		
		mcp.getSaveButton().click();
		Thread.sleep(3000);
		
		mcp.getFormNameTextField().sendKeys("Carrom");
		Thread.sleep(2000);
		
		mcp.getSubmitButtoninForm().click();
		Thread.sleep(3000);
		
		
		mcp.getCreateFormLink().click();
		Thread.sleep(3000);
		
		 mcp.getCreateNewFormDropdown().click();
		Thread.sleep(3000);
		
		mcp.getDropdownElement().click();
		Thread.sleep(3000);
		
		
		mcp.getDeleteButton().click();
		Thread.sleep(3000);
		
		mcp.getDeleteofDeleteButton().click();
		Thread.sleep(3000);
		
		mcp.getBaackButton().click();
		
}
	
	@Test(dependsOnMethods="TC_Modeller")
	
	public void TC002() throws Throwable
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://dev-app.nfttrace.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("ecommerce@chaincodeconsulting.com");
		lp.getPasswordTextField().sendKeys("admin@123");
		lp.getLoginButton().click();
		Thread.sleep(3000);
		
		HomePage hp=new HomePage(driver);
		ModellerCreateFormPage mcp=new ModellerCreateFormPage(driver);
		
		System.out.println("------testCase2----");
		hp.getModellerLink().click();
		Thread.sleep(3000);
		
		
		mcp.getCreateFormLink().click();
		Thread.sleep(3000);
		
		mcp.getTextInputElement().click();
		Thread.sleep(3000);
		
		mcp.getSaveButton().click();
		Thread.sleep(2000);
		
		mcp.getFormNameTextField().sendKeys("Tennis");
		Thread.sleep(2000);
		
		mcp.getSubmitButtoninForm().click();
		
		
	}
	
}