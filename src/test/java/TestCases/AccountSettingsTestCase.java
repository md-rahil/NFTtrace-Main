package TestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.ChangePasswordPage;
import POMClass.HomePage;
import POMClass.LoginPage;
import POMClass.MyAccountPage;
import POMClass.MyProfilePage;
import POMClass.OrganizationDetailsPage;
import POMClass.WalletDetails;
import Utilities.DataUtility;

public class AccountSettingsTestCase {
	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)
	
	public void AccountSettings_TC_001(String firstName, String lastName, String orgName, String address1, String address2,String selCountry,String selState,String selCity,String zipcode,String gstin,String currentPassword,String newPassword,String confirmPassword) throws Throwable
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
		
		hp.getAccountLink().click();
		Thread.sleep(3000);
		
		MyAccountPage map=new MyAccountPage(driver);
		map.getMyProfileLink().click();
		Thread.sleep(2000);
		
		
		MyProfilePage mpp=new MyProfilePage(driver);
		mpp.getFirstNameofMyProfile().clear();
		Thread.sleep(2000);
		
		mpp.getFirstNameofMyProfile().sendKeys(firstName);
		Thread.sleep(3000);
		
		mpp.getLastNameofMyProfile().clear();
		Thread.sleep(2000);
		
		mpp.getLastNameofMyProfile().sendKeys(lastName);
		Thread.sleep(3000);
		
		mpp.getUpdateinMyProfile().click();
		Thread.sleep(5000);
		
		hp.getAccountLink().click();
		Thread.sleep(2000);
		
		map.getOrganizationDetailsLink().click();
		Thread.sleep(2000);
		
		OrganizationDetailsPage odp=new OrganizationDetailsPage(driver);
		odp.getOrganizationName().clear();
		Thread.sleep(2000);
		
		odp.getOrganizationName().sendKeys(orgName);
		Thread.sleep(2000);
		
	odp.getAddressLine1().clear();
		Thread.sleep(2000);
		
		odp.getAddressLine1().sendKeys(address1);
		Thread.sleep(2000);
		
		odp.getAddressLine2().clear();
		Thread.sleep(2000);
		
		odp.getAddressLine2().sendKeys(address2);
		Thread.sleep(2000);
		
		WebElement country = odp.getCountryinOrganizationDetails();
		Select select=new Select(country);
		select.selectByVisibleText(selCountry);
		Thread.sleep(2000);
		
		WebElement state = odp.getStateinOrganizationDetails();
		Select sle=new Select(state);
		sle.selectByVisibleText(selState);
		Thread.sleep(2000);
		
		WebElement city = odp.getCityinOrganizationDetails();
		Select select1=new Select(city);
		select1.selectByVisibleText(selCity);
		Thread.sleep(2000);
		
		odp.getZipcode().clear();
		Thread.sleep(2000);
		
		odp.getZipcode().sendKeys(zipcode);
		Thread.sleep(2000);
		
		odp.getGSTIN().clear();
		Thread.sleep(2000);
		
		odp.getGSTIN().sendKeys(gstin);
		Thread.sleep(2000);
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", odp.getUpdateinOrganization());
		
		//odp.getUpdateinOrganization().click();
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].click();", hp.getAccountLink());
		
		//hp.getAccountLink().click();
		Thread.sleep(2000);
		
		map.getChangePasswordLink().click();
		Thread.sleep(2000);
		
		
		ChangePasswordPage cpp=new ChangePasswordPage(driver);
		cpp.getCurrentPassword().sendKeys(currentPassword);
		Thread.sleep(2000);
		
		cpp.getNewPasswordinChangePassword().sendKeys(newPassword);
		Thread.sleep(2000);
		
		cpp.getConfirmPasswordinChangePassword().sendKeys(confirmPassword);
		Thread.sleep(2000);
		
		cpp.getUpdateinChangePassword().click();
		Thread.sleep(5000);
		
		hp.getAccountLink().click();
		Thread.sleep(2000);
		
		map.getWalletDetailsLink().click();
		Thread.sleep(2000);
		
		WalletDetails wd=new WalletDetails(driver);
		wd.getCopyButtonofWalletAddress().click();
		Thread.sleep(3000);
		
		wd.getPrivateKey().click();
		Thread.sleep(3000);
		
	hp.getAccountLink().click();
	Thread.sleep(2000);
	
	map.getLogoutButton().click();
	Thread.sleep(3000);
		
		
	}
	
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"Education","Admin","SVCS","Vidhyanagar"," ","India","Karnataka","Bangalore Urban","562110","22AAAAA0000A1Z8","Admin@123","admin@123","admin@123"},
//			{"E-Commerce","Admin","Nishania","VANCOUVER","","Canada","Yukon","Whitehorse","560066","22AAAAA0000A1Z8","admin@123","admin@123","admin@123"}
//				};
//	}
	
}
