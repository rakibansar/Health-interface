package PageObject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import healthinterface.doctorweb.base;

public class Myclinicpage extends base{
	
	
	
	public static void addnewclinic()
	{
		waitelement(addnewclinicbutton);
	WebElement Addnewclinicbutton =  driver.findElement(By.xpath(addnewclinicbutton));
	clickButton(Addnewclinicbutton);	
	}
	
	public static void clicksave()
	{
		waitelement(savebutton);
	WebElement Savebutton =  driver.findElement(By.xpath(savebutton));
	clickButton(Savebutton);	
	}
	
	public static void clinicnameandlogo(String enterclinicname) throws InterruptedException
	{
		waitelement(clinicname);
		WebElement Clinicname =  driver.findElement(By.xpath(clinicname));
		type(Clinicname, enterclinicname);
		
		clicksave();
		checkerror();

	}
	
	public static void clinicvalidation(String enterlicensenumber) throws InterruptedException
	{
		waitelement(cliniclicensenumber);
		WebElement Cliniclicensenumber =  driver.findElement(By.xpath(cliniclicensenumber));
		Cliniclicensenumber.sendKeys(enterlicensenumber);
		
		waitelement(cliniclicenseexpireydate);
		WebElement Cliniclicenseexpireydate =  driver.findElement(By.xpath(cliniclicenseexpireydate));
		clickButton(Cliniclicenseexpireydate);
		
		waitelement(selectcalenderdate);
		WebElement Selectcalenderdate =  driver.findElement(By.xpath(selectcalenderdate));
		clickButton(Selectcalenderdate);
		clickButton(Selectcalenderdate);

		clicksave();
		checkerror();


	}
	
	public static void cliniclocation() throws InterruptedException
	{
		waitelement(clinicstreetaddress1);
		WebElement Clinicstreetaddress1 =  driver.findElement(By.xpath(clinicstreetaddress1));
		Clinicstreetaddress1.sendKeys("Address1");
		
		waitelement(clinicstreetaddress2);
		WebElement Clinicstreetaddress2 =  driver.findElement(By.xpath(clinicstreetaddress2));
		Clinicstreetaddress2.sendKeys("Address2");
		Thread.sleep(3000);

		waitelement(selectcountrydropdown);
		WebElement Selectcountrydropdown =  driver.findElement(By.xpath(selectcountrydropdown));
		clickButton(Selectcountrydropdown);

		
		waitelement(inputboxsearch);
		WebElement Inputboxsearch =  driver.findElement(By.xpath(inputboxsearch));
		Inputboxsearch.sendKeys("india");
		waitelement(selectcountry);
		WebElement Selectcountry =  driver.findElement(By.xpath(selectcountry));
		clickButton(Selectcountry);
		
		Thread.sleep(3000);

		waitelement(selectstatedropdown);
		WebElement Selectstatedropdown =  driver.findElement(By.xpath(selectstatedropdown));
		clickButton(Selectstatedropdown);

		waitelement(inputboxsearch);
		WebElement Inputstateboxsearch =  driver.findElement(By.xpath(inputboxsearch));
		Inputstateboxsearch.sendKeys("rajasthan");
		waitelement(selectstate);
		WebElement Selectstate =  driver.findElement(By.xpath(selectstate));
		clickButton(Selectstate);
		
		waitelement(selectcitydropdown);
		WebElement Selectcitydropdown =  driver.findElement(By.xpath(selectcitydropdown));
		clickButton(Selectcitydropdown);
		waitelement(selectcity);
		WebElement Selectcity =  driver.findElement(By.xpath(selectcity));
		clickButton(Selectcity);
		
		waitelement(enterpincode);
		WebElement Enterpincode =  driver.findElement(By.xpath(enterpincode));
		Enterpincode.sendKeys("341505");		
		
		waitelement(selectlocation);
		WebElement Selectlocation =  driver.findElement(By.xpath(selectlocation));
		clickButton(Selectlocation);
		waitelement(setlocation);
		WebElement Setlocation =  driver.findElement(By.xpath(setlocation));
		clickButton(Setlocation);
		
		clicksave();
		checkerror();


	}
	
	public static void clinicimage() throws InterruptedException
	{
		Thread.sleep(2000);

		clicksave();
		checkerror();


	}

	public static void workinghours() throws InterruptedException
	{
		Thread.sleep(2000);

		waitelement(daysmon);
		WebElement Daysmon =  driver.findElement(By.xpath(daysmon));
		clickButton(Daysmon);

		WebElement Daystue =  driver.findElement(By.xpath(daystue));
		clickButton(Daystue);

		
		waitelement(sessionfrom);
		WebElement Sessionfrom =  driver.findElement(By.xpath(sessionfrom));
		clickButton(Sessionfrom);

		waitelement(sessionfromtime);
		WebElement Sessionfromtime =  driver.findElement(By.xpath(sessionfromtime));
		clickButton(Sessionfromtime);

		
		waitelement(sessionto);
		WebElement Sessionto =  driver.findElement(By.xpath(sessionto));
		clickButton(Sessionto);
		waitelement(sessiontotime);
		WebElement Sessiontotime =  driver.findElement(By.xpath(sessiontotime));
		clickButton(Sessiontotime);

		clicksave();
		checkerror();

	}
	
	
	public static void addtreatments() throws InterruptedException
	{
		waitelement(treatment);
		WebElement Treatment =  driver.findElement(By.xpath(treatment));
		Treatment.sendKeys("new");
		waitelement(treatmentlist);
		WebElement Treatmentlist =  driver.findElement(By.xpath(treatmentlist));
		clickButton(Treatmentlist);
		
		clicksave();
		checkerror();


	}
	
	public static void facilities() throws InterruptedException
	{
		waitelement(selectfacilitydropdown);
		WebElement Selectfacilitydropdown =  driver.findElement(By.xpath(selectfacilitydropdown));
		clickButton(Selectfacilitydropdown);
		waitelement(selectfacility);
		WebElement Selectfacility =  driver.findElement(By.xpath(selectfacility));
		clickButton(Selectfacility);
		
		waitelement(imgclick);
		WebElement Imgclick =  driver.findElement(By.xpath(imgclick));
		clickButton(Imgclick);
		clicksave();
		checkerror();

	}
	

	
	public static void deleteclinic(String existclinicname) throws InterruptedException   
	{
		try {
			for (int i = 1; i <= 10; i++) {
				String dynamicpath = clinicpath + i + "]";
				
				waitelement(dynamicpath);
				WebElement clinic = driver.findElement(By.xpath(dynamicpath));
				String Clinic = clinic.getText();
			if (Clinic.equals(existclinicname)) 
			{
				String dynamicdeletepath = deleteclinic + i + "]";

				waitelement(dynamicdeletepath);
				WebElement deleteclinic = driver.findElement(By.xpath(dynamicdeletepath));
				clickButton(deleteclinic);
				System.out.println("deleted");
				i=11;
				checkerror();
				driver.navigate().refresh();
				Thread.sleep(2000);
			
			} else 
			{}
				
		}} catch (Exception e) {
			System.out.println("No clinic found");

		}
	}
	
	
	
	
	
	
}
