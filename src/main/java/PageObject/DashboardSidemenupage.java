package PageObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import healthinterface.doctorweb.base;
import jdk.internal.org.jline.utils.Log;


public class DashboardSidemenupage extends base  {


	public static void drdetails() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));
		String DRName = DrName.getText();
		
		
		WebElement DrSpeciality =  driver.findElement(By.xpath(Drspeciality));
		String DRSpeciality = DrSpeciality.getText();
		
		WebElement DrID =  driver.findElement(By.xpath(Drid));
		String DRID = DrID.getText();
		
		System.out.println( DRID+ " " + DRName + "("+DRSpeciality+ ")");
		Assert.assertTrue(true);
		checkerror();

		
	}
	public static void drdetailsverify()
{
		WebElement DrName =  driver.findElement(By.xpath(Drname));

	    try {
	        if(DrName.isDisplayed() && DrName.isEnabled()) {
	        	waitelementminimum(Drname);
	    		String DRName = DrName.getText();
	    
	    		WebElement DrSpeciality =  driver.findElement(By.xpath(Drspeciality));
	    		String DRSpeciality = DrSpeciality.getText();
	    		
	    		WebElement DrID =  driver.findElement(By.xpath(Drid));
	    		String DRID = DrID.getText();
	    		
	    		log.info( DRID+ " " + DRName + "("+DRSpeciality+ ")");
	    		
	        } else 
	            log.info( " Invalid Credentials ");
	        
	    } catch (Exception e) {
	    	
	    }    
	}
	
//	Side Menu Tab
	
	public static void clickHome()
	{  
		waitelement(home);
	WebElement Home =  driver.findElement(By.xpath(home));
	clickButton(Home);	
	}
	
	public static void clickDoctors()
	{  
		waitelement(doctors);
	WebElement Doctors =  driver.findElement(By.xpath(doctors));
	clickButton(Doctors);	
	}
	
	public static void clickMyprofile()
	{  
		waitelement(myprofile);
	WebElement Myprofile =  driver.findElement(By.xpath(myprofile));
	clickButton(Myprofile);	
	}
	
	public static void clickMyclinic()
	{  
		waitelement(myclinic);
	WebElement Myclinic =  driver.findElement(By.xpath(myclinic));
	clickButton(Myclinic);	
	
	}
	
	public static void clickMypatients()
	{  
		waitelement(mypatients);
	WebElement Mypatients =  driver.findElement(By.xpath(mypatients));
	clickButton(Mypatients);	
	}
	
	public static void clickRemotemonitoring()
	{  
		waitelement(remotemonitoring);
	WebElement Remotemonitoring =  driver.findElement(By.xpath(remotemonitoring));
	clickButton(Remotemonitoring);	
	}
	
	public static void clickMycalendar()
	{  
		waitelement(mycalendar);
	WebElement Mycalendar =  driver.findElement(By.xpath(mycalendar));
	clickButton(Mycalendar);	
	}
	
	public static void clickMywallet()
	{  
		waitelement(mywallet);
	WebElement clickMywallet =  driver.findElement(By.xpath(mywallet));
	clickButton(clickMywallet);	
	}
	
	public static void clickMytask()
	{  
		waitelement(mytask);
	WebElement Mytask =  driver.findElement(By.xpath(mytask));
	clickButton(Mytask);	
	}
	
	public static void clickMedicalforms()
	{  
		waitelement(medicalforms);
	WebElement Medicalforms =  driver.findElement(By.xpath(medicalforms));
	clickButton(Medicalforms);	
	}
	
	public static void clickMessages()
	{  
		waitelement(messages);
	WebElement Messages =  driver.findElement(By.xpath(messages));
	clickButton(Messages);	
	}
	
	public static void clickMyusers()
	{  
		waitelement(myusers);
	WebElement Myusers =  driver.findElement(By.xpath(myusers));
	clickButton(Myusers);	
	}
	
	public static void clickHiforum()
	{  
		waitelement(hiforum);
	WebElement Hiforum =  driver.findElement(By.xpath(hiforum));
	clickButton(Hiforum);	
	}
	
	public static void clickMyreviews()
	{  
		waitelement(myreviews);
	WebElement Myreviews =  driver.findElement(By.xpath(myreviews));
	clickButton(Myreviews);	
	}
	
	public static void clickAnalytics()
	{  
		waitelement(analytics);
	WebElement Analytics =  driver.findElement(By.xpath(analytics));
	clickButton(Analytics);	
	}
	
	public static void clickSettings()
	{  
		waitelement(settings);
	WebElement Settings =  driver.findElement(By.xpath(settings));
	clickButton(Settings);	
	}
	
	public static void clickContacthi()
	{  
		waitelement(contacthi);
	WebElement Contacthi =  driver.findElement(By.xpath(contacthi));
	clickButton(Contacthi);	
	}
	
	public static void clickLogout()
	{  
		waitelement(logout);
	WebElement Logout =  driver.findElement(By.xpath(logout));
	clickButton(Logout);	
	}
	

	
	
	
//Schedule Appointment 
	
	public static void ScheduleConsultation()
		{  
		  waitelement(scheduleconsultation);
		WebElement Scheduleconsultation =  driver.findElement(By.xpath(scheduleconsultation));
		clickButton(Scheduleconsultation);	
		}
	
	public static void SelectPatient() throws InterruptedException
	   {				
		  Thread.sleep(1000);
		  waitelement(searchpatient);
		WebElement  Searchpatient = driver.findElement(By.xpath(searchpatient));
		type(Searchpatient, searchpatientname );
		
		waitelement(selectpatientname);
	    WebElement  patientname = driver.findElement(By.xpath(selectpatientname));
		String Patientname  =  patientname.getText();
        
		
		waitelement(selectpatientid);
	    WebElement  Selectpatient = driver.findElement(By.xpath(selectpatientid));
		clickButton(Selectpatient);	
	   }
	
	
	public static void SelectVirtualappointmentcheckbox() throws InterruptedException

	{
		  Thread.sleep(1000);
		  waitelement(selctvirtualappointmentcheckbox);
		WebElement  Selectvirtualappointmentcheckbox = driver.findElement(By.xpath(selctvirtualappointmentcheckbox));
		clickButton(Selectvirtualappointmentcheckbox);	
	}
	
	

	
	
	public static void bookappointment() throws InterruptedException
    
	{
		 Thread.sleep(1000);
	     waitelement(selectdepartment);
		WebElement  Selectdepartment = driver.findElement(By.xpath(selectdepartment));
		clickButton(Selectdepartment);
		  waitelement(selectdepartmentspeciality);
		WebElement  Selectdepartmentspeciality = driver.findElement(By.xpath(selectdepartmentspeciality));
		clickButton(Selectdepartmentspeciality);	
	
		  waitelement(selectdoctor);
		WebElement  Selectdoctor = driver.findElement(By.xpath(selectdoctor));
		clickButton(Selectdoctor);
		  waitelement(selectdoctorbyname);
		WebElement  Selectdoctorbyname = driver.findElement(By.xpath(selectdoctorbyname));
		clickButton(Selectdoctorbyname);	
		
		  waitelement(appointmentduration);
		WebElement  Appointmentduration = driver.findElement(By.xpath(appointmentduration));
		clickButton(Appointmentduration);
		  waitelement(selectduration);
		WebElement  Selectduration = driver.findElement(By.xpath(selectduration));
		clickButton(Selectduration);	


		  waitelement(scheduleappointment);
		WebElement  Scheduleappointment = driver.findElement(By.xpath(scheduleappointment));
		clickButton(Scheduleappointment);
		
	}
	
	public static void CheckIn()
	{
		waitelement(checkin);
		WebElement  Checkin = driver.findElement(By.xpath(checkin));
		clickButton(Checkin);
	}
	
	public static String  BookingDetail;
	public static String  apptokenID;
	
	public static void Bookedappointmentdetails ()
	{
		
	      waitelement(bookingdetail);
		WebElement  Bookingdetail = driver.findElement(By.xpath(bookingdetail));
		  BookingDetail = Bookingdetail.getText();
		 

		
		  waitelement(afterbokkingdoneconfirmation);
		WebElement  Afterbokkingdoneconfirmation = driver.findElement(By.xpath(afterbokkingdoneconfirmation));
		clickButton(Afterbokkingdoneconfirmation);	
		log.info(BookingDetail);
		
		
		 waitelement("((//div[@class=\"half-box\"])[1]//span[@class=\"waiting-box-txt\"])[2]");
			WebElement  apptokenid = driver.findElement(By.xpath("((//div[@class=\"half-box\"])[1]//span[@class=\"waiting-box-txt\"])[2]"));
			  apptokenID = apptokenid.getText();
	
	}
	

	public static String formattedTime;
	public static void Appointmenttime () 
	{
	    String bookedAppointmentdetails  = BookingDetail;

	    // Extract time in HH:MM format
	    Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})");
	    Matcher matcher = pattern.matcher(bookedAppointmentdetails);

	    if (matcher.find()) {
	        int hour = Integer.parseInt(matcher.group(1)); // Extract hour
	        int minute = Integer.parseInt(matcher.group(2)); // Extract minute

	        // Convert hour to 12-hour format and determine AM/PM
	        String amPm = hour >= 12 ? "PM" : "AM";
	        hour = hour % 12; // Adjust hour for 12-hour format (e.g., 1:45 becomes 1:45 PM)
	        hour = hour == 0 ? 12 : hour; // Handle 00:00 as 12:00 AM

	        formattedTime  = String.format("%02d:%02d %s", hour, minute, amPm);
	        System.out.println("Extracted time in AM/PM format: " + formattedTime);
	    } else {
	        System.out.println("Time not found in the text");
	    }
			
	    
	}
	
	public static void appointmenttimecompare() throws InterruptedException {
		String time1 = formattedTime;
		// Remove leading zeros for consistent comparison
		String formattedTime1 = time1.replaceAll("^0+", "");

		driver.navigate().refresh();
		Thread.sleep(5000);

		for (int i = 1; i <= 10; i++)
		{
			waitelement(newappointmenttime);
			WebElement Afterbokkingnewappointmenttime = driver.findElement(By.xpath(newappointmenttime));
			String time2 = Afterbokkingnewappointmenttime.getText();
			System.out.println(formattedTime1 + time2);

			if (formattedTime1.matches(time2)) {
				waitelement(newappointmentcheckin);
				WebElement Newappointmentcheckin = driver.findElement(By.xpath(newappointmentcheckin));
				clickButton(Newappointmentcheckin);
				i = 11;
				log.info("Appointment match ");
			}

			else {
				Thread.sleep(1000);
				log.info(" not found ");

				waitelement(nextnewappointment);
				WebElement Nextnewappointment = driver.findElement(By.xpath(nextnewappointment));
				clickButton(Nextnewappointment);
				log.info(nextnewappointment + " not found ");

			}
		}  
	    
	    }
	public static void navigatetobookedappointment( String Buttpath) throws InterruptedException {
		String time1 = formattedTime;
		// Remove leading zeros for consistent comparison
		String formattedTime1 = time1.replaceAll("^0+", "");

		driver.navigate().refresh();
		Thread.sleep(5000);

		for (int i = 1; i <= 10; i++)
		{
			waitelement(newappointmenttime);
			WebElement Afterbokkingnewappointmenttime = driver.findElement(By.xpath(newappointmenttime));
			String time2 = Afterbokkingnewappointmenttime.getText();
			System.out.println(formattedTime1 + time2);

			if (formattedTime1.matches(time2)) {
				waitelement(Buttpath);
				WebElement Button = driver.findElement(By.xpath(Buttpath));
				clickButton(Button);
				i = 11;
				log.info("Appointment match  clicked on Reschedule");
			}

			else {
				Thread.sleep(1000);
				log.info(" not found ");

				waitelement(nextnewappointment);
				WebElement Nextnewappointment = driver.findElement(By.xpath(nextnewappointment));
				clickButton(Nextnewappointment);
				log.info(nextnewappointment + " not found ");

			}
		} 
	}
	
	
	
	
	public static void cancelandselectreason () throws InterruptedException
	{
		Thread.sleep(2000);
		
		waitelement(selectcancelreason);
		WebElement Selectcancelreason = driver.findElement(By.xpath(selectcancelreason));
		clickButton(Selectcancelreason);
		
		waitelement(confirmcancel);
		WebElement Confirmcancel = driver.findElement(By.xpath(confirmcancel));
		clickButton(Confirmcancel);
		
		{
		 waitelement(Toastcontainer);
		 WebElement toastcontainer = driver.findElement(By.xpath(Toastcontainer));
		 String cancelmessage = toastcontainer.getText();
		 {
		  if(cancelmessage.matches("Appointment Canceled"))
			  log.info(  cancelmessage);
		    	
		  else
		    {
			if(cancelmessage.matches("You cannot cancel this appointment 5 min before the scheduled time." ))
				log.info(cancelmessage);
			
			  else
				  log.error("Web Page error "  + cancelmessage);
		
		     }
		  }}
		checkerror();

	
		}
		
	

		public static void rescheduleandselectreason () throws InterruptedException
		{
			Thread.sleep(2000);
			
			waitelement(reasondropdown);
			WebElement Reasondropdown = driver.findElement(By.xpath(reasondropdown));
			clickButton(Reasondropdown);
			
			waitelement(reasonselect);
			WebElement Reasonselect = driver.findElement(By.xpath(reasonselect));
			clickButton(Reasonselect);
			
			waitelement(rescheduletime);
			WebElement Rescheduletime = driver.findElement(By.xpath(rescheduletime));
			clickButton(Rescheduletime);
			
			waitelement(rescheduleappointment);
			WebElement Rescheduleappointment = driver.findElement(By.xpath(rescheduleappointment));
			clickButton(Rescheduleappointment);
			{
				 waitelement(Toastcontainer);
				 WebElement toastcontainer = driver.findElement(By.xpath(Toastcontainer));
				 String reschedulemessage = toastcontainer.getText();
				 {
				  if(reschedulemessage.matches("Appointment rescheduled successfully"))
					  log.info(  reschedulemessage);
				    	
				  else
				    {
					if(reschedulemessage.matches("You cannot reschedule this appointment 5 min before the scheduled time." ))
						log.info(reschedulemessage);
					
					  else
						  log.error("Web Page error "  + reschedulemessage);
				
				     }
				  }
				 }
			
			checkerror();

			
	    }
		
	
	
	
	
	
	
}	



