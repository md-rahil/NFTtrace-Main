package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.CreateDocumentPage;
import POMClass.HomePage;
import POMClass.LoginPage;
import Utilities.DataUtility;

public class NFTDocumentsTestCase {
	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)

	public void TC_NFTDocuments(String createcategory,String recipientName,String categoryName,String documentName,String description,String file) throws Throwable
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
		hp.getNFTDocumentLink().click();
        Thread.sleep(3000);		

		hp.getDocumentCategoriesLink().click();
		Thread.sleep(3000);
		
		hp.getCreateCategoryinDocument().click();
		Thread.sleep(3000);
		
		hp.getCategoryNameTextField().sendKeys(createcategory);
		Thread.sleep(3000);
		
		hp.getSubmitButtoninCreateCategory().click();
		Thread.sleep(3000);
		
		hp.getDocumentsLink().click();
		Thread.sleep(3000);
		
		CreateDocumentPage cdp=new CreateDocumentPage(driver);
		cdp.getCreateDocument().click();
		Thread.sleep(3000);
		
		WebElement recipient = cdp.getSelectRecipient();
		Select select=new Select(recipient);
		select.selectByVisibleText(recipientName);
		Thread.sleep(3000);
		
		WebElement category = cdp.getSelectCategory();
		Select sel=new Select(category);
		sel.selectByVisibleText(categoryName);
		Thread.sleep(3000);
		
		cdp.getDocumentName().sendKeys(documentName);
		Thread.sleep(3000);
		
		cdp.getDescriptionOfDocument().sendKeys(description);
		Thread.sleep(3000);
		
		cdp.getChooseFileinDocument().sendKeys(file);
		Thread.sleep(3000);
		
		cdp.getSubmitButtoninDocument().click();

}
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"Carrom","Abhi Ram","Chess","Prajju","Good Performer","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Document.png"},
//				{"Book","Abhi Ram","Relay","Jeeva","Ver good","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Categories.png"}
//				};
//				//C:\Users\CCL-Mangala\Downloads
//	
//	
//	}
}