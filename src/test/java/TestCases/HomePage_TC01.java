package TestCases;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import POMClass.ChangePasswordPage;
import POMClass.CreateCategory;
import POMClass.CreateCertificate;
import POMClass.CreateDocumentPage;
import POMClass.CreateRecipientPage;
import POMClass.HomePage;
import POMClass.ModellerCreateFormPage;
import POMClass.MyAccountPage;
import POMClass.MyProfilePage;
import POMClass.OrganizationDetailsPage;

import Utilities.BaseClass;

public class HomePage_TC01 extends BaseClass{
	@Test
	public void TC_001() throws Throwable
	{
System.out.println("------Welcome to HomePage---------");

HomePage hp=new HomePage(driver);
CreateRecipientPage crp=new CreateRecipientPage(driver);
Thread.sleep(3000);

System.out.println("-------Creating a Recipient------------");
hp.getCreateRecipient().click();
Thread.sleep(3000);

crp.getSingleRecipientLink().click();
Thread.sleep(3000);

crp.getFirstnameTextField().sendKeys("Jeeva");
Thread.sleep(2000);

crp.getLastnameTextField().sendKeys("M");
Thread.sleep(2000);

crp.getEmailTextField().sendKeys("mangala.m+1@chaincodeconsulting.com");
Thread.sleep(2000);

crp.getPhoneNumberTextField().sendKeys("7654567809");
Thread.sleep(2000);

crp.getGenerateWalletAddress().click();
Thread.sleep(2000);

crp.getPasswordTextField().sendKeys("Mangala@123");
Thread.sleep(2000);

crp.getConfirmPasswordTextField().sendKeys("Mangala@123");
Thread.sleep(2000);

 crp.getChooseFileField().sendKeys("C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png");
Thread.sleep(2000);

 crp.getSubmitButton().click();
 
 Thread.sleep(8000);
 
 System.out.println("-------------------Modeller module creating form--------------");
 
		ModellerCreateFormPage mcp=new ModellerCreateFormPage(driver);
		
		hp.getModellerLink().click();
		Thread.sleep(2000);
		
		mcp.getCreateFormLink().click();
		Thread.sleep(2000);
 
		mcp.getTextInputElement().click();
	Thread.sleep(2000);
		
		mcp.getNumberInputElement().click();
		Thread.sleep(2000);
		
		mcp.getSaveButton().click();
		Thread.sleep(2000);
		
		mcp.getFormNameTextField().sendKeys("AutoTest");
		Thread.sleep(2000);
		
		mcp.getSubmitButtoninForm().click();
		
		Thread.sleep(5000);
		
		
		System.out.println("----------NFT Documents----------");
		
		hp.getNFTDocumentLink().click();
		Thread.sleep(2000);
		
		hp.getDocumentCategoriesLink().click();
		Thread.sleep(2000);
		
		hp.getCreateCategoryinDocument().click();
		Thread.sleep(2000);
		
		hp.getCategoryNameTextField().sendKeys("Hockey");
		Thread.sleep(2000);
		
		hp.getSubmitButtoninCreateCategory().click();
		
		hp.getDocumentsLink().click();
		Thread.sleep(5000);
		
		
		
	System.out.println("-------Creating NFT Document---------");	
		CreateDocumentPage cdp=new CreateDocumentPage(driver);
		cdp.getCreateDocument().click();
		Thread.sleep(2000);
		WebElement recipient = cdp.getSelectRecipient();
		Select select=new Select(recipient);
		select.selectByIndex(1);
		
		WebElement category = cdp.getSelectCategory();
		Select select1=new Select(category);
		select1.selectByIndex(1);
		Thread.sleep(2000);
		
		cdp.getDocumentName().sendKeys("TestDoc");
		Thread.sleep(2000);
		
		cdp.getDescriptionOfDocument().sendKeys("Performing good");
		Thread.sleep(2000);
		
		cdp.getChooseFileinDocument().sendKeys("C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png");
		Thread.sleep(2000);
		
		cdp.getSubmitButtoninDocument().click();
		Thread.sleep(15000);
		
		
		///for NfTCertificate Category
	
		hp.getNFTDigitalCertificate().click();
		Thread.sleep(2000);
		
		hp.getCertificateCategoriesLink().click();
		Thread.sleep(2000);
		
		CreateCategory cc=new CreateCategory(driver);
		cc.getCreateCategoryinCertificate().click();
		Thread.sleep(2000);
		
		
		cc.getCategoryNameofCertificate().sendKeys("Automation");
		Thread.sleep(2000);
		
		cc.getChooseFileinCreateCategory().sendKeys("C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png");
		Thread.sleep(2000);
		
		cc.getAvalancheRadioButton().click();
		Thread.sleep(2000);
		
		cc.getSubmitButtonofCreateCategory().click();
		Thread.sleep(10000);
		
		hp.getCertificateLink().click();
		Thread.sleep(2000);
		
		hp.getSearchBar().sendKeys("Automation");
		Thread.sleep(2000);
		
		hp.getCreatedCategoryLink().click();
		Thread.sleep(3000);
		
		CreateCertificate crc=new CreateCertificate(driver);
		crc.getCreateCertificate().click();
		Thread.sleep(2000);
		
		crc.getSingleCertificate().click();
		Thread.sleep(2000);
		
		WebElement recipientname = crc.getSelectRecipient();
		
	Select sel=new Select(recipientname);
	sel.selectByVisibleText("Jeeva M");
	Thread.sleep(2000);
	
	crc.getCertificateName().sendKeys("NFTCertificate");
	Thread.sleep(2000);
		
	crc.getDescriptioninCertificate().sendKeys("Well Performed ");
	Thread.sleep(2000);
	
	crc.getChooseFileofCertificate().sendKeys("C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png");
	Thread.sleep(2000);
	
	WebElement certificate = crc.getSelectFormofCertificate();
		Select sele=new Select(certificate);
		sele.selectByVisibleText("AutoTest");
		Thread.sleep(2000);
		
		crc.getNextofCreateCertificate().click();
		Thread.sleep(3000);
		
		crc.getPalceHolderLabel().sendKeys("1");
		Thread.sleep(2000);
		
		crc.getSubmitofCreateCertificate().click();
		Thread.sleep(25000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", hp.getAccountLink());
		
		//hp.getAccountLink().click();
		Thread.sleep(3000);
		
		MyAccountPage my=new MyAccountPage(driver);
		my.getMyProfileLink().click();
		Thread.sleep(3000);
		
		
		MyProfilePage mpp=new MyProfilePage(driver);
		mpp.getFirstNameofMyProfile().clear();
		Thread.sleep(3000);
		
		mpp.getFirstNameofMyProfile().sendKeys("E-Commerce");
		Thread.sleep(3000);
		
		mpp.getUpdateinMyProfile().click();
		Thread.sleep(5000);
		
		
		jse.executeScript("arguments[0].click();", hp.getAccountLink());
		Thread.sleep(3000);
		
		my.getOrganizationDetailsLink().click();
		Thread.sleep(3000);
		
		
		OrganizationDetailsPage odp=new OrganizationDetailsPage(driver);
		odp.getAddressLine2().clear();
		Thread.sleep(2000);
		
		
		odp.getAddressLine2().clear();
		Thread.sleep(2000);
		
		
		odp.getAddressLine2().sendKeys("Bangalore");
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].click();",odp.getUpdateinOrganization() );
		//odp.getUpdateinOrganization().click();
		Thread.sleep(5000);
		
		jse.executeScript("arguments[0].click();", hp.getAccountLink());
		Thread.sleep(3000);
		
		my.getChangePasswordLink().click();
		Thread.sleep(3000);
		
		
		ChangePasswordPage cpp=new ChangePasswordPage(driver);
		cpp.getCurrentPassword().sendKeys("admin@123");
		Thread.sleep(3000);
		
		cpp.getNewPasswordinChangePassword().sendKeys("admin@123");
		Thread.sleep(3000);
		
		cpp.getConfirmPasswordinChangePassword().sendKeys("admin@123");
		Thread.sleep(3000);
		
		cpp.getUpdateinChangePassword().click();
		Thread.sleep(5000);
		
		jse.executeScript("arguments[0].click();", hp.getAccountLink());
		Thread.sleep(3000);
		
		
		my.getWalletDetailsLink().click();
		Thread.sleep(3000);
		
		
		
		
		
	}
}
