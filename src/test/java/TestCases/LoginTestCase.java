package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMClass.LoginPage;
import Utilities.DataUtility;


public class LoginTestCase {
	
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)

	public void TC_Login(String email,String password) throws Throwable
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev-app.nfttrace.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(email);
		Thread.sleep(1000);
		lp.getPasswordTextField().sendKeys(password);
		Thread.sleep(2000);
		lp.getLoginButton().click();
		Thread.sleep(3000);
		driver.close();
	}
	
//	@DataProvider(name="data")
//	public Object[][] data1()
//	{
//		return new Object[][]
//				{
//			{"mangala@gmail.com","Mangala@123"},
//			{"ecommerce@chaincodeconsulting.com","admin@123"},
//			{"superadmin@chaincodeconsulting.com","admin@123"},
//			{"jeeva@gmail.com","jeeva@123"}
//				
//				};

	//}
	
	
	

	
}