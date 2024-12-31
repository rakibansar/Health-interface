package Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.DashboardSidemenupage;
import PageObject.Homepage;
import PageObject.LoginPage;
import healthinterface.doctorweb.ReadXLSdata;



public class Logintestcase extends LoginPage {
	
	@Parameters("weburl")
	@BeforeMethod(groups = {"Smoke" , "Sanity" , "Regression", "Testing"})
	public void Launch(String weburl) throws IOException
	{
		browserlaunch();
        webURL(weburl); 
        

	}
	
	@AfterMethod(groups = {"Smoke" , "Sanity" , "Regression", "Testing"})
	public void quit() throws IOException
	{
		driver.quit();   	
	}
	
	@Test(groups = {"Smoke" , "Sanity" , "Regression",  } , dataProviderClass = ReadXLSdata.class,   dataProvider = "crendata")
	public static void login (String useremail,  String enterpassw , String m) throws IOException, InterruptedException 
	{   
		log.info("=======Start Login verification======");
        Homepage.clicklogin();
        userlogin(useremail, enterpassw);
        Thread.sleep(5000);
        DashboardSidemenupage.drdetailsverify();
        log.info("Verification Done Username = "+useremail+" Password = "+enterpassw);
        checkerror();
	}
	
//	@DataProvider(name = "logdata")
//	public Object[][] createData1() {
//	 return new Object[][] {
//	   { "Rakibansar@yoopmail.com", "Art@1234" },
//	   { "hiemr@yoopmail.com", "rrt@1234"},
//	   { "raki@yoopmail.com", "rqrt@1234"},
//
//	 };
	
	
	
	@Test(groups = {"Sanity" , "Regression"})
	public static void Forgotpassword ()
	{		
		log.info("=======Start Forgotpassword======");
        Homepage.clicklogin();
        clickforgotpassword();
	}
	
	@Test(groups = {"Sanity" , "Regression"})
	public static void Registernow ()
	{
		log.info("=======Start Registernow======");
        Homepage.clicklogin();
        clickregisternow();
	}
	
	@Test(groups = {"Regression"})
	public static void ContactUs ()
	{
		log.info("=======Start ContactUs======");
        Homepage.clicklogin();
        clickcontactUs();
	}
	
	
	
}
	

	
	
	