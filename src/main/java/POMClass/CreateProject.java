package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProject {

	public WebDriver driver;
	
	public CreateProject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	private WebElement createProject;
	
	public WebElement getCreateProject() {
		return createProject;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	private WebElement projectName;
	
	public WebElement getProjectName()
	{
		return projectName;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/textarea[1]")
	private WebElement projectDescription;
	
	public WebElement getProjectDescription()
	{
		return projectDescription;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/input[1]")
	private WebElement privateFramework;
	
	public WebElement getPrivateFramework()
	{
		return privateFramework;
	}
	
	@FindBy(xpath="//input[@id='exampleRadios1']")
	private WebElement  privatehyperledgerFabricButton;
	
	public WebElement getPrivateHyperledgerFabricButton()
	{
		return  privatehyperledgerFabricButton;
	}
	
	@FindBy(xpath="")
	private WebElement privatepolygonEdgeButton;
	
	public WebElement getPrivatePolygonEdgeButton()
	{
		return privatepolygonEdgeButton;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/input[1]")
	private WebElement publicFramework;
	
	public WebElement getPublicFramework()
	{
		return publicFramework;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/input[1]")
	private WebElement publicPolygonButton;
	
	public WebElement getPublicPolygonButton()
	{
		return publicPolygonButton;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[2]/input[1]")
	private WebElement publicAlgorandButton;
	
	public WebElement getPublicAlgorandButton()
	{
		return publicAlgorandButton;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[3]/input[1]")
	private WebElement publicAvalancheButton;
	
	public WebElement getPublicAvalancheButton()
	{
		return publicAvalancheButton;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtonofProject;
	
	public WebElement getSubmitButtonofProject()
	{
		return submitButtonofProject;
	}

	
	@FindBy(xpath="//tbody/tr[1]/td[5]/i[1]")
	private WebElement editinProjectPage;
	
	public WebElement getEditProjectPage()
	{
		return editinProjectPage;
	}
	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/i[2]")
	private WebElement addiconNewNFTinProjectPage;
	
	public WebElement getAddiconNewNFTinProjectPage()
	{
		return addiconNewNFTinProjectPage;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	private WebElement NFTname;
	
	public WebElement getNFTName()
	{
		return NFTname;
	}
	
	
	@FindBy(xpath="//input[@id='file_upload']")
	private WebElement chooseNFTimage;
	
	public WebElement getChooseNFTImage()
	{
		return chooseNFTimage;
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/select[1]")
	private WebElement selectEventCategory;
	
	public WebElement getSelectEventCategory()
	{
		return selectEventCategory;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'+ Add')]")
	private WebElement addParticipantsButton;
	
	public WebElement getAddParticipantsButton()
	{
		return addParticipantsButton;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement globalSeedDistributorsOrganization;
	
	public WebElement getGlobalSeedDistributorsOrganization()
	{
		return globalSeedDistributorsOrganization;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement seedsNutritionLifeOrganization;
	
	public WebElement getSeedsNutritionLifeOrganization()
	{
		return seedsNutritionLifeOrganization;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")
	private WebElement Nishania1Organization;
	
	public WebElement getNishania1Organization()
	{
		return Nishania1Organization;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")
	private WebElement TestEOrganization;
	
	public WebElement getTestEOrganization()
	{
		return TestEOrganization;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitofOrganization;
	
	public WebElement getSubmitofOrganization()
	{
		return submitofOrganization;
	}
	
	
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[7]/div[2]/textarea[1]")
	private WebElement descriptionofNFT;
	
	public WebElement getDescriptionofNFT()
	{
		return descriptionofNFT;
	}
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement IOTdataCheckbox;
	
	public WebElement getIOTdataCheckbox()
	{
		return IOTdataCheckbox;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	private WebElement apiUrlofIOTdata;
	
	public WebElement getApiUrlofIOTdata()
	{
		return apiUrlofIOTdata;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/select[1]")
	private WebElement selectForm;
	
	public WebElement getSelectForm()
	{
		return selectForm;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/select[1]")
	private WebElement selectEvent;
	
	public WebElement getSelectEvent() {
		return selectEvent;
	}
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]")
	private WebElement addVisibilityofData;
	
	public WebElement getAddVisibilityofData()
	{
		return addVisibilityofData;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement dataVisibilityCheckbox;
	
	public WebElement getDataVisibilityCheckbox()
	{
		return dataVisibilityCheckbox;
	}
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	private WebElement submitofDataVisibiity;
	
	public WebElement getSubmitofDataVisibility()
	{
		return submitofDataVisibiity;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancelButtoninNFT;
	
	public WebElement getCancelButtoninNFT()
	{
		return cancelButtoninNFT;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submitButtoninNFT;
	
	public WebElement getSubmitButtoninNFT()
	{
		return submitButtoninNFT;
		
	}
	
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")
	private WebElement placeholderTextLabel;
	
	public WebElement getPlaceholderTextLabel()
	{
		return placeholderTextLabel;
	}
	
	
	
	
	
}
