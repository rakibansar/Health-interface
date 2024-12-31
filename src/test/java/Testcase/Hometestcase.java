package Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PageObject.Homepage;

public class Hometestcase extends Homepage {
	
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
	
	public static void consultation() throws IOException
	{   
		
	}
}