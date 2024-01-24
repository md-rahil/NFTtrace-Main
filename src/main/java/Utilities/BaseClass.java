package Utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMClass.HomePage;
import POMClass.LoginPage;
import POMClass.MyAccountPage;

public class BaseClass {
	public static WebDriver driver;
	
	public DataUtility du=new DataUtility();
	
	@BeforeClass
	public void launchingBrowser() throws Throwable
	{
		System.out.println("-------Launhing browser---------");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		String Browser = du.dataFromPropertiesFile("browser");
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver(options);
		}
		
		else if(Browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(Browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else
		{
			driver=new ChromeDriver();
		}
		
		String URL = du.dataFromPropertiesFile("url");
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod
	public void loginToApplication() throws Throwable
	{
		System.out.println("------Login to the Application--------");
		LoginPage lg=new LoginPage(driver);
		
		String Email = du.dataFromPropertiesFile("email");
		lg.getEmailTextField().sendKeys(Email);
		
		String Password = du.dataFromPropertiesFile("password");
		lg.getPasswordTextField().sendKeys(Password);
		
		lg.getLoginButton().click();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void logoutFromApplication() throws Throwable
	{
		System.out.println("----------LogOut from the Application-------------");
		HomePage hp=new HomePage(driver);
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", hp.getAccountLink());
		
		//hp.getAccountLink().click();
		Thread.sleep(5000);
		
		MyAccountPage my=new MyAccountPage(driver);
		my.getLogoutButton().click();
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void quitBrowser()
	{
		System.out.println("----------Quit the Browser----------");
		driver.quit();
	}
	

}
