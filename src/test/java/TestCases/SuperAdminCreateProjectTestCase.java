package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.CreateProject;
import POMClass.LoginPage;
import Utilities.DataUtility;

public class SuperAdminCreateProjectTestCase {
	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)

	public void CreateProject_TC_001(String projectName,String projectDescription,String NFTname,String NFTimage,String NFTevent,String NFTdescription,String formName,String eventName,String text) throws Throwable
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
		
		CreateProject cp=new CreateProject(driver);
		cp.getCreateProject().click();
		Thread.sleep(2000);
		
		
		cp.getProjectName().sendKeys(projectName);
		Thread.sleep(2000);
		
		
		cp.getProjectDescription().sendKeys(projectDescription);
		Thread.sleep(2000);
		
		cp.getPublicFramework().click();
		Thread.sleep(2000);
		
		cp.getPublicAvalancheButton().click();
		Thread.sleep(2000);
		
		cp.getSubmitButtonofProject().click();
		Thread.sleep(3000);
		
		cp.getNFTName().sendKeys(NFTname);
		Thread.sleep(2000);
		
		cp.getChooseNFTImage().sendKeys(NFTimage);
		Thread.sleep(2000);
		
		WebElement eventCategory = cp.getSelectEventCategory();
		Select select=new Select(eventCategory);
		select.selectByVisibleText(NFTevent);
		Thread.sleep(2000);
		
		cp.getAddParticipantsButton().click();
		Thread.sleep(2000);
		
		cp.getTestEOrganization().click();
		Thread.sleep(2000);
		
		cp.getSubmitofOrganization().click();
		Thread.sleep(2000);
		
		cp.getDescriptionofNFT().sendKeys(NFTdescription);
		Thread.sleep(2000);
		
//		cp.getIOTdataCheckbox().click();
//		Thread.sleep(2000);
//		
		
		WebElement form = cp.getSelectForm();
		Select sle=new Select(form);
		sle.selectByVisibleText(formName);
		Thread.sleep(2000);
		
		WebElement event = cp.getSelectEvent();
		Select sle1=new Select(event);
		sle1.selectByVisibleText(eventName);
		Thread.sleep(2000);
		
		cp.getAddVisibilityofData().click();
		Thread.sleep(2000);
		
		cp.getDataVisibilityCheckbox().click();
		Thread.sleep(2000);
		
		cp.getSubmitofDataVisibility().click();
		cp.getPlaceholderTextLabel().sendKeys(text);
		Thread.sleep(2000);
		
		cp.getSubmitButtoninNFT().click();
		
		
	}
	
	
//	@DataProvider(name="data")
//	
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"ProProject2","New Project","New NFT","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Document.png","PANNEl","NFT","Test12s","pvc","1"}
//			
//				};
//	
//	}
}
