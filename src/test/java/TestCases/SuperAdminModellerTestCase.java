package TestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.LoginPage;
import POMClass.SuperAdminHomePage;
import POMClass.SuperAdminModellerPage;
import Utilities.DataUtility;

public class SuperAdminModellerTestCase {

	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)
	
	public void CreateForm_TC_001(String formName,String formType) throws Throwable
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://dev-app.nfttrace.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("superadmin@chaincodeconsulting.com");
		lp.getPasswordTextField().sendKeys("admin@123");
		lp.getLoginButton().click();
		
		
		SuperAdminHomePage shp=new SuperAdminHomePage(driver);
		shp.getModellerLink().click();
		Thread.sleep(2000);
		
		SuperAdminModellerPage smp=new SuperAdminModellerPage(driver);
		smp.getCreateForm().click();
		
		smp.getParagraphLink().click();
		Thread.sleep(2000);
		
		smp.getMultiLineInputLink().click();
		Thread.sleep(2000);
		
		smp.getTextInputLink().click();
		Thread.sleep(2000);
		
		smp.getCheckBoxLink().click();
		Thread.sleep(2000);
		
		smp.getDropdownLink().click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click();", smp.getFourColumnsRowLink());
	//	smp.getFourColumnsRowLink().click();
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].click();",smp.getImageIconLink());
		Thread.sleep(2000);
		
		
		jse.executeScript("arguments[0].click();", smp.getPreviewButtoninModeller());
		//smp.getPreviewButtoninModeller().click();
		Thread.sleep(2000);
		
		smp.getCancelIconinPreview().click();
		Thread.sleep(2000);
		
		smp.getSaveButtoninModeller().click();
		Thread.sleep(2000);
		
		smp.getFormName().sendKeys(formName);
		Thread.sleep(2000);
		
		WebElement form = smp.getFormType();
		Select select=new Select(form);
		select.selectByVisibleText(formType);
		Thread.sleep(2000);
		
		smp.getSubmitinAddForm().click();
		Thread.sleep(3000);
		
		smp.getSearchBarinModeller().sendKeys(formName);
		Thread.sleep(2000);
		
		smp.getEditButtoninModeller().click();
		Thread.sleep(2000);
		
		smp.getDeleteinModeller().click();
		Thread.sleep(2000);
		
		smp.getDeleteinDeleteForm().click();
		Thread.sleep(2000);
		
		smp.getBackButtoninModdeller().click();
		
		
	}
	
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"Digital Form","NFT form"},
//			{"Analog Form","NFT form"}
//				};
//	}
}
