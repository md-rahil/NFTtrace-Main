package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalletDetails {
	
public WebDriver driver;
	
	public WalletDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement walletAddress;

	public WebElement getWalletAddress()
	{
		return walletAddress;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	private WebElement privateKey;
	
	public WebElement getPrivateKey()
	{
		return privateKey;
	}
	
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement copyButtonofWalletAddress;
	
	public WebElement getCopyButtonofWalletAddress() {
		return copyButtonofWalletAddress;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
	private WebElement eyeiconofPrivateKey;
	
	public WebElement getEyeiconofPrivateKey()
	{
		return eyeiconofPrivateKey;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]")
	private WebElement copyButtonofPrivateKey;
	
	public WebElement getCopyButtonofPrivateKey()
	{
		return copyButtonofPrivateKey;
	}
	
	
	
	
	
	
}
