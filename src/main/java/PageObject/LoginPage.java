/**
 * 
 */
package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import healthinterface.doctorweb.base;

/**
 *  
 *  
 */
public class LoginPage extends base 
{
	public static void userlogin(String useremail, String enterpassw ) 
	{
		waitelement(enterusernameoremail);
	WebElement Enterusernameoremail =  driver.findElement(By.xpath(enterusernameoremail));
	Enterusernameoremail.sendKeys(useremail);
	log.info(useremail);

	    waitelement(enterpassword);
	WebElement Enterpassword =  driver.findElement(By.xpath(enterpassword));
	Enterpassword.sendKeys(enterpassw);
	log.info(enterpassw);

	
        waitelement(loginverify);
	WebElement Loginverify =  driver.findElement(By.xpath(loginverify));
	Loginverify.click();	
	log.info("Enterd Username = " +useremail + "Password = "+ enterpassw);

	 
    }
	
	public static void clickforgotpassword() 
	{
          waitelement(forgotpassword);
		WebElement Forgotpassword =  driver.findElement(By.xpath(forgotpassword));
		clickButton(Forgotpassword);	
	}
	public static void clickregisternow() 
	{
          waitelement(registernow);
		WebElement Registernow =  driver.findElement(By.xpath(registernow));
		clickButton(Registernow);	
	}
	
	public static void clickcontactUs() 
	{
          waitelement(contactUs);
		WebElement ContactUs =  driver.findElement(By.xpath(contactUs));
		clickButton(ContactUs);	
	}
	
}