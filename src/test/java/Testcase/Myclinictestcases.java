package Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.DashboardSidemenupage;
import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.Myclinicpage;

public class Myclinictestcases extends Myclinicpage{

	@Parameters("weburl")
	@BeforeMethod(groups = {"Smoke" , "Sanity" , "Regression", "Testing"})
	public void Launch(String weburl) throws IOException
	{
		browserlaunch();
        webURL(weburl);    
	}
	
	@AfterMethod(groups = {"Smoke" , "Sanity" , "Regression", })
	public void quit() throws IOException
	{
		driver.quit();   	
	}
	
   
	@Test(groups = {"Testing"})
	public void AddClinic() throws IOException, InterruptedException 
	{
		
		Homepage.clicklogin();
		LoginPage.userlogin("testlabuser@yopmail.com", "Art@1234");
		DashboardSidemenupage.clickMyclinic();
		deleteclinic("Rakib");
		addnewclinic();
		clinicnameandlogo("Rakib");
		clinicvalidation("asndkjnjkasnkjna");
		cliniclocation();
		clinicimage();
		workinghours();
		workinghours();
		addtreatments();
		facilities();
	}

	@Test
	public void editclinic() throws IOException 
	{
		DashboardSidemenupage.clickMyclinic();

	}
	
	@Test
	public void Deleteclinic() throws IOException 
	{
		DashboardSidemenupage.clickMyclinic();

	}
}
