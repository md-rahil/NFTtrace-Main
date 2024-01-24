package TestCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.LoginPage;
import POMClass.SuperAdminHomePage;
import POMClass.SuperAdminPlannerPage;
import Utilities.DataUtility;

public class SuperAdminPlannerTestCase {
	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)
	
	public void planner_TC_001(String categoryName,String eventName) throws Throwable
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
		SuperAdminPlannerPage spp=new SuperAdminPlannerPage(driver);
		
		shp.getPlannerLink().click();
		Thread.sleep(2000);
		
		spp.getCreateCategoryPlanner().click();
		Thread.sleep(2000);
		
		spp.getCategoryNameinPlanner().sendKeys(categoryName);
		Thread.sleep(2000);
		
		spp.getSubmitButtoninPlanner().click();
		Thread.sleep(2000);
		
		spp.getDropdowntoCreateEvent().click();
		Thread.sleep(2000);
		
		spp.getCreateEventButton().click();
		Thread.sleep(2000);
		
		spp.getCategoryEventName().sendKeys(eventName);
		Thread.sleep(2000);
		
		spp.getSubmitButtoninCreateEvent().click();
		Thread.sleep(3000);
		
		spp.getSearchBarinPlanner().sendKeys(categoryName);
		Thread.sleep(2000);
		
		spp.getDeleteIconinEvent().click();
		Thread.sleep(3000);
		
		spp.getSubmitinDeleteEvent().click();
		Thread.sleep(2000);
		
		
		spp.getDeleteIconinPlanner().click();
		Thread.sleep(3000);
		
		spp.getSubmitofDeleteCategory().click();
		
		
		
		
		
		
	}
//	
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"Food","South Indian"},
//			{"Game","Cricket"}
//				};
//				
//	}

}
