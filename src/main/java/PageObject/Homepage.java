package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import healthinterface.doctorweb.base;

public class Homepage extends base {
	
	
	
//	Home Page click object 
	public static void clicklogin()
	{  
		waitelement(login);
	WebElement Login =  driver.findElement(By.xpath(login));
	clickButton(Login);	
	log.info( " Login page ");
	}
	public static void clicksiguup()
	{  
		waitelement(signup);
	WebElement Signup =  driver.findElement(By.xpath(signup));
	clickButton(Signup);	
	log.info( " Sign Up page ");

	}
	public static void clickPricing()
	{  
		waitelement(pricing);
	WebElement Pricing =  driver.findElement(By.xpath(pricing));
	clickButton(Pricing);	
	log.info( " Pricing page ");

	}
	public static void clickBlogs()
	{  
		waitelement(blogs);
	WebElement Blogs =  driver.findElement(By.xpath(blogs));
	clickButton(Blogs);	
	log.info( " Blogs page ");

	}
	public static void clickHIemr()
	{  
		waitelement(HIemr);
	WebElement HIEMR =  driver.findElement(By.xpath(HIemr));
	clickButton(HIEMR);	
	}
	public static void clickgettheHIapp()
	{  
		waitelement(gettheHIapp);
	WebElement GettheHIapp =  driver.findElement(By.xpath(gettheHIapp));
	clickButton(GettheHIapp);	
	}
	
}
	


