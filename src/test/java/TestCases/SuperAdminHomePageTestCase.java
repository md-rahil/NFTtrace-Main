package TestCases;

import org.testng.annotations.Test;

import POMClass.CreateProject;
import POMClass.SuperAdminHomePage;
import POMClass.SuperAdminPlannerPage;
import Utilities.SuperBaseClass;

public class SuperAdminHomePageTestCase extends SuperBaseClass{
	
	@Test
	
	public void SuperAdmin_TC_001() throws Throwable
	{
	
	SuperAdminHomePage shp=new SuperAdminHomePage(driver);
	
	CreateProject cp=new CreateProject(driver);
	
	
	shp.getProjectLink().click();
	Thread.sleep(3000);
	
	cp.getCreateProject().click();
	Thread.sleep(3000);
	
	cp.getProjectName().sendKeys("Praeob");
	Thread.sleep(2000);
	
	cp.getProjectDescription().sendKeys("jgfdsfghj");
	Thread.sleep(2000);
	
	cp.getPublicFramework().click();
	Thread.sleep(2000);
	
	cp.getPublicPolygonButton().click();
	Thread.sleep(2000);
	
	cp.getSubmitButtonofProject().click();
	Thread.sleep(3000);
	
	
	shp.getPlannerLink().click();
	Thread.sleep(2000);
	
	SuperAdminPlannerPage spp=new SuperAdminPlannerPage(driver);
	spp.getCreateCategoryPlanner().click();
	Thread.sleep(2000);
	
	
	spp.getCategoryNameinPlanner().sendKeys("B-Cool");
	Thread.sleep(2000);
	
	
	spp.getSubmitButtoninPlanner().click();
	Thread.sleep(4000);
	
	spp.getDeleteIconinPlanner().click();
	Thread.sleep(2000);
	
	spp.getSubmitofDeleteCategory().click();
			

	}
}
