package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.CreateRecipientPage;
import POMClass.HomePage;
import POMClass.LoginPage;
import Utilities.DataUtility;
import Utilities.ExcelUtility;


public class AddRecipientTestCase {
	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)

	public void TC_Login(String firstName,String lastName,String email,String phnum,String password,String conpassword,String file) throws Throwable
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
		CreateRecipientPage crp=new CreateRecipientPage(driver);
		Thread.sleep(3000);

		System.out.println("-------Creating a Recipient------------");
		hp.getCreateRecipient().click();
		Thread.sleep(3000);

		crp.getSingleRecipientLink().click();
		Thread.sleep(3000);

		crp.getFirstnameTextField().sendKeys(firstName);
		Thread.sleep(2000);

		crp.getLastnameTextField().sendKeys(lastName);
		Thread.sleep(2000);

		crp.getEmailTextField().sendKeys(email);
		Thread.sleep(2000);

		crp.getPhoneNumberTextField().sendKeys(phnum);
		Thread.sleep(2000);

		crp.getGenerateWalletAddress().click();
		Thread.sleep(2000);

		crp.getPasswordTextField().sendKeys(password);
		Thread.sleep(2000);

		crp.getConfirmPasswordTextField().sendKeys(conpassword);
		Thread.sleep(2000);

		 crp.getChooseFileField().sendKeys(file);
		Thread.sleep(2000);

		 crp.getSubmitButton().click();
		 Thread.sleep(5000);	
		 
//		 crp.getDeleteButtoninRecipient().click();
//		 Thread.sleep(2000);
//		 
//		 crp.getSubmitButtonofDelete().click();
//	
	}
	
	
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"Prajju","M","mangala.m+2@gmail.com","7654356786","Mangala@123","Mangala@123","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png"},
//			{"123456","M","mangala.m+4@gmail.com","7654356747","Mangala173","Mangala@173","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png"},
//			{"Yashu","M","mangala.m+3gmail.com","7654356hn7","Yashu@123","Yashu@123","C:\\Users\\CCL-Mangala\\Downloads\\NFTrace-Recipients (phone number).png"}
//				};
//				}


//	
//@DataProvider(name="Recipient")
//public String[][] getData() throws Throwable
//{
//	String path="C:\\Users\\CCL-Mangala\\Documents\\RecipientData.xlsx";
//	
//	ExcelUtility excel=new ExcelUtility(path);
//	
//	int totalrows=excel.getRowCount("Sheet1");
//	int totalcols=excel.getCellCount("Sheet1", 1);
//	
//	
//	String recipientdata[][]=new String[totalrows][totalcols];
//	
//	
//			for(int i=1;i<=totalrows;i++)
//			{
//				for(int j=0;j<totalcols;j++)
//				{
//					recipientdata[i-1][j]=excel.getCellData("Sheet1", i, j);
//				}
//			}
//	
//	
//
//return recipientdata;
	
	
	
}

