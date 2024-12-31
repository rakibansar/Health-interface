package Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.DashboardSidemenupage;
import PageObject.Homepage;
import PageObject.LoginPage;

public class DashboardTestCases extends DashboardSidemenupage{
	
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
	
	@Test(groups = {"Smoke" , "Sanity" , "Regression"})
	public static void bookvirtualconsultation() throws IOException, InterruptedException
	{     
		log.info("=====bookvirtualconsultation=====");
		Homepage.clicklogin();

		LoginPage.userlogin("testlabuser@yopmail.com", "Art@1234");

		ScheduleConsultation();
		SelectPatient();
		SelectVirtualappointmentcheckbox();
		
		bookappointment();

		log.info("=====Booked Virtual Cosultation=====");

		
	}
	
	@Test(groups = {  "Sanity" , "Regression"})
	public static void bookclinicconsultationandverifysameappointment() throws IOException, InterruptedException
	{     
		log.info("=====Start bookclinicconsultationandverifysameappointment=====");

		Homepage.clicklogin();
		LoginPage.userlogin("testlabuser@yopmail.com", "Art@1234");
		Thread.sleep(2000);

		ScheduleConsultation();
		SelectPatient();
		bookappointment();

		Bookedappointmentdetails();
		Appointmenttime();
		appointmenttimecompare(); 

	}
	
	@Test(groups = {  "Regression"})
	public static void cancelbookedappointment() throws IOException, InterruptedException
	{     
		log.info("=====Start bookclinicconsultationandverifysameappointment=====");
		Homepage.clicklogin();
		LoginPage.userlogin("testlabuser@yopmail.com", "Art@1234");
		Thread.sleep(2000);
		ScheduleConsultation();
		SelectPatient();
		bookappointment();
		Bookedappointmentdetails();
		Appointmenttime();
		navigatetobookedappointment(appointmentcancel);
		cancelandselectreason ();

	}
	
	@Test(groups = {"Regression"})
	public static void reschedulebookedappointment() throws InterruptedException
	{
		log.info("=====Start reschedulebookedappointment=====");
		Homepage.clicklogin();
		LoginPage.userlogin("testlabuser@yopmail.com", "Art@1234");
		Thread.sleep(2000);
		ScheduleConsultation();
		SelectPatient();
		bookappointment();
		Bookedappointmentdetails();

		Appointmenttime();
		navigatetobookedappointment(reschedule);
		rescheduleandselectreason();

	}

	
	
	@Test(groups = {"Testing"})
	public static void test () throws IOException, InterruptedException
	{     
		log.info("=====Start bookclinicconsultationandverifysameappointment=====");
		Homepage.clicklogin();
		LoginPage.userlogin("testlabuser@yopmail.com", "Art@1234");
		Thread.sleep(2000);
		ScheduleConsultation();
		SelectPatient();
		bookappointment();
		Bookedappointmentdetails();
		Appointmenttime();
		navigatetobookedappointment(reschedule);
		rescheduleandselectreason();
		
		

	}


}
