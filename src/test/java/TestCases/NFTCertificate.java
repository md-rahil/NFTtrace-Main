package TestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.CreateCategory;
import POMClass.CreateCertificate;
import POMClass.HomePage;
import POMClass.LoginPage;
import Utilities.DataUtility;

public class NFTCertificate {

	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)

	
	public void TC_NFTCertificate(String categoryName, String choosefileofcreateCategory,String searchBarData, String recipientName,String certificateName,String description, String choosefileofCertificate, String selectForm,String placeholderName, String numberPlaceholder,String multiPlaceholderName) throws Throwable
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
		hp.getNFTDigitalCertificate().click();
		Thread.sleep(3000);
		
		hp.getCertificateCategoriesLink().click();
		Thread.sleep(3000);
		
		
		CreateCategory cc=new CreateCategory(driver);
		cc.getCreateCategoryinCertificate().click();
		Thread.sleep(3000);
		
		cc.getCategoryNameofCertificate().sendKeys(categoryName);
		Thread.sleep(3000);
		
		
		cc.getChooseFileinCreateCategory().sendKeys(choosefileofcreateCategory);
		Thread.sleep(3000);
		
		cc.getAvalancheRadioButton().click();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", cc.getSubmitButtonofCreateCategory());
		
		//cc.getSubmitButtonofCreateCategory().click();
		Thread.sleep(9000);
		
		jse.executeScript("arguments[0].click();", hp.getCertificateLink());
		//hp.getCertificateLink().click();
		Thread.sleep(2000);
		
		CreateCertificate crc=new CreateCertificate(driver);
		
		crc.getSearchBarofCertificate().sendKeys(searchBarData);
		Thread.sleep(2000);
		
		
		crc.getSearchedCategory().click();
		Thread.sleep(3000);
		
		crc.getCreateCertificate().click();
		Thread.sleep(5000);
		
		crc.getSingleCertificate().click();
		Thread.sleep(2000);
		
		
		WebElement recipient = crc.getSelectRecipient();
		Select select=new Select(recipient);
		select.selectByVisibleText(recipientName);
		Thread.sleep(3000);
		
		crc.getCertificateName().sendKeys(certificateName);
		Thread.sleep(3000);
		
		crc.getDescriptioninCertificate().sendKeys(description);
		Thread.sleep(3000);
		
		crc.getChooseFileofCertificate().sendKeys(choosefileofCertificate);
		Thread.sleep(3000);
		
		WebElement form = crc.getSelectFormofCertificate();
	    Select sel=new Select(form);
	    sel.selectByVisibleText(selectForm);
	   Thread.sleep(3000);
	   
	   crc.getNextofCreateCertificate().click();
	   Thread.sleep(3000);
	   
	   
	   crc.getPalceHolderLabel().sendKeys(placeholderName);
	   Thread.sleep(2000);
	   
//	   crc.getnumberInputPlaceholderLabel().sendKeys(numberPlaceholder);
//	   Thread.sleep(2000);
//	   
//	   crc.getMultiPlaceholderLabel().sendKeys(multiPlaceholderName);
//	   Thread.sleep(2000);
//	   
   crc.getSubmitofCreateCertificate().click();
   Thread.sleep(3000);
	   driver.close();	
	   
	}
}
//
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"AutoTesting", "C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Document.png","AutoTesting","Abhi Ram","ProgressCard","Good","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Categories.png", "Test@123","Jeeva", "1","vbnmnbv" },
//			{"Automation1","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Document.png","Automation1","Mangala M","Hockey certificate","1st price","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Categories.png","AutoTesting","Prajju","2","iuytdfg"}	};
//				}
//
//}
