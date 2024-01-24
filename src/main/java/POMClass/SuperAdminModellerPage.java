package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminModellerPage {
	
	
		public WebDriver driver;
		
		public  SuperAdminModellerPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(xpath="//button[contains(text(),'Create Form')]")
		private WebElement createForm;
		
		public WebElement getCreateForm()
		{
			return createForm;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]")
		private WebElement paragraphLink;
		
		public WebElement getParagraphLink()
		{
			return paragraphLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]")
		private WebElement textInputLink;
		
		public WebElement getTextInputLink()
		{
			return textInputLink;
		}
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]")
		private WebElement numberInputLink;
		
		public WebElement getNumberInputLink()
		{
			return numberInputLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]")
		private WebElement multiLineInputLink;
		
		public WebElement getMultiLineInputLink()
		{
			return multiLineInputLink;
		}
		
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]")
		private WebElement multipleChoiceLink;
		
		public WebElement getMultipleChoiceLink()
		{
			return multipleChoiceLink;
		}
		
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]")
		private WebElement checkBoxLink;
		
		public WebElement getCheckBoxLink()
		{
			return checkBoxLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]")
		private WebElement imageIconLink;
		
		public WebElement getImageIconLink()
		{
			return imageIconLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[8]")
		private WebElement dropdownLink;
		
		public WebElement getDropdownLink()
		{
			return dropdownLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[9]")
         private WebElement twoColumnRowLink;
		
		public WebElement getTwoColumnRowLink()
		{
			return twoColumnRowLink;
		}
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[10]")
		private WebElement threeColumnsRowLink;
		
		public WebElement getThreeColumnsRowLink()
		{
			return threeColumnsRowLink;
		}
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[11]")
		private WebElement fourColumnsRowLink;
		
		public WebElement getFourColumnsRowLink()
		{
			return fourColumnsRowLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[12]")
		private WebElement fileUploadLinkofModeller;
		
		public WebElement getFileUploadLinkofModeller()
		{
			return fileUploadLinkofModeller;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[13]")
		private WebElement signatureLink;
		
		
		public WebElement getSignatureLink()
		{
			return signatureLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[14]")
		private WebElement dateLink;
		
		public WebElement getDateLink()
		{
			return dateLink;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
		private WebElement createNewFormDropdown;
		
		public WebElement getCreateNewFormDropdown()
		{
		return createNewFormDropdown;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
		private WebElement backButtoninModeller;
		
		public WebElement getBackButtoninModdeller()
		{
			return backButtoninModeller;
		}
		
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")
		private WebElement previewButtoninModeller;
		
		public WebElement getPreviewButtoninModeller()
		{
			return previewButtoninModeller;
		}
		
		@FindBy(xpath="//span[contains(text(),'×')]")
		private WebElement cancelIconinPreview;
		
		public WebElement getCancelIconinPreview()
		{
			return cancelIconinPreview;
		
		
		}
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[3]")
		private WebElement saveButtoninModeller;
		
		public WebElement getSaveButtoninModeller()
		{
			return saveButtoninModeller;
		}
		
		
		@FindBy(xpath="//input[@id='name']")
		private WebElement formName;
		
		public WebElement getFormName()
		{
			return formName;
		}
		
		@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/select[1]")
		private WebElement formType;
		
		public WebElement getFormType()
		{
			return formType;
		}
		
		@FindBy(xpath="//button[contains(text(),'Submit')]")
		private WebElement submitinAddForm;
		
		public WebElement getSubmitinAddForm()
		
		{
			return submitinAddForm;
		}
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[4]")
		private WebElement deleteinModeller;
		
		public WebElement getDeleteinModeller()
		{
			return deleteinModeller;
		}
		
		@FindBy(xpath="//button[contains(text(),'DELETE')]")
		private WebElement deleteinDeleteForm;
		
		public WebElement getDeleteinDeleteForm()
		{
			return deleteinDeleteForm;
		}
		
		@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
         private WebElement searchBarinModeller;
		
		public WebElement getSearchBarinModeller()
		{
			return searchBarinModeller;
		}
		
		@FindBy(xpath="//tbody/tr[1]/td[3]/i[2]")
		private WebElement deleteButtoninModeller;
		
		public WebElement getDeleteButtoninModeller()
		{
			return deleteButtoninModeller;
		}
		
		
		@FindBy(xpath="//tbody/tr[1]/td[3]/i[1]")
		private WebElement editButtoninModeller;
		
		public WebElement getEditButtoninModeller()
		{
			return editButtoninModeller;
		}
		
		
}
