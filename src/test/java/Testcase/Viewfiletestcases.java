package Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.AppointmentHIEMRpage;
import healthinterface.doctorweb.DataProviders;


public class Viewfiletestcases extends AppointmentHIEMRpage {
	

	private String currentURL;

	
	@Parameters("weburl")
	@BeforeClass(groups = {"Smoke" , "Sanity" , "Regression", "Testing", "Pass" ,"Fail"})
	public void getAppointmentURL(String weburl) throws IOException, InterruptedException
	{
		browserlaunch();
        webURL(weburl); 
		DashboardTestCases.bookclinicconsultationandverifysameappointment();
		currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
	}
	
	@BeforeMethod(groups = {"Smoke" , "Sanity" , "Regression", "Testing", "Pass" ,"Fail"})
	public void editdemo() throws IOException, InterruptedException
	{
		 
	}
	
	
	
	@AfterClass(groups = {"Smoke" , "Sanity" , "Regression",  "Pass" ,"Fail"})
	public void quit() throws IOException
	{
		driver.quit();   	
	}
	
	
	
	@Test(groups = {"Fail",  "Smoke" , "Sanity" , "Regression",})
	 public void testMandatoryFields() throws IOException, InterruptedException 
	 {
		Viewfile();
		  Editdemographics();

	        // Fill in mandatory fields with valid data
		    FirstName("John Doe");
		    Primarycontactnumber("1234567890");
           //           
	        // ... Gender is already filled

	        // Submit the form
		    clicksave();
		    ToastContainer("Successful  alert not available" , "Successfully ");

	        // Assert that the form is submitted successfully
		    
	 }
	 
	@Test(groups = { "Fail", "Sanity" , "Regression",})
	 public void testMandatoryFieldsblank() throws IOException, InterruptedException 
	 {
		Viewfile();
		  Editdemographics();
    
		// Fill in mandatory fields with valid data
		    FirstName("");
		    Primarycontactnumber("");
            //           
	        // ... Gender is already filled

	        // Submit the form
		    clicksave();
		    ToastContainer("mandatory field alert not available" , "mandatory");

	        // Assert that the form is submitted successfully
		    
	 }
	 
	@Test(groups = {"Fail", "Regression"})
	 public void DataPersistence() throws IOException, InterruptedException 
	 {
			Viewfile();
			Editdemographics();

			FirstName("John Doe");
			Primarycontactnumber("1234567890");
			EmailAddress("rakiba@yopmail.com");
			clicksave();
			Thread.sleep(3000);
			verifyFirstNameAttribute("John Doe");
			verifyPrimarycontactnumberattribute("1234567890");
			verifyemailaddressAttribute("rakiba@yopmail.com");
    
	 }
	
	@Test(groups = {"Fail","Sanity","Regression"})
	public void invalidemail() throws IOException, InterruptedException 
	 {
			Viewfile();
			Editdemographics();

			EmailAddress("rakiba");
			clicksave();

			ToastContainer("mandatory field alert not available" , "invalid email");

	 }
	
	@Test(groups = {"Fail", "Regression"})	
	public void clickondiscard() throws IOException, InterruptedException 
	 {
		Viewfile();
		  Editdemographics();

         ClickDiscard();
	     Assert.assertEquals(currentURL, driver.getCurrentUrl());

	 }
	
	@Test(groups = { "Sanity", "Regression"})
	 public void apointmentpatientnameDataPersistence() throws IOException, InterruptedException 
	 {
		Viewfile();
		  Editdemographics();

		 FirstName("John Doe");
		 LastName("Doe");
		 EmailAddress("rakiba@yopmail.com");
		 clicksave();
		 verifyAppointmentPatientname("John Doe Doe");

	 }
	
	
	
	@Test(groups = {  "Smoke" , "Sanity" , "Regression"})
	 public void appointedDrcheck() throws IOException, InterruptedException 
	 {
		Viewfile();
		CareTeam();
		AppointmentDrname();
	 }
	
	@Test(groups = { "Sanity" , "Regression",})
	 public void multiplecareteam() throws InterruptedException 
	 {
		Viewfile();
		CareTeam();
		selectmultiplecareteam();
		Assign();
        ToastContainer("unable to assign care team", "Care team assign successfully");
	 }
	
	@Test(groups = {  "Regression",})
	 public void deselectmembers() throws InterruptedException 
	 {
		Viewfile();
		CareTeam();

		selectmultiplecareteam();
		Assign();
		selectmultiplecareteam();
		Assign();
       ToastContainer("unable to assign care team", "Care team assign successfully");
	 }
	
	@Test(groups = { "Fail","Testig", "Smoke" , "Sanity" , "Regression",})
	 public void DICOMuploadfile() throws IOException, InterruptedException 
	 {
		Viewfile();
		Files();
		DIcom();
		AddNewdocument();
		DicomChoosefile();
		Upload();
		Thread.sleep(10000);
	    ToastContainer("failed to upload ", "File uploaded successfully");

	 }
	
	@Test(groups = { "Fail","Testng", "Smoke" , "Sanity" , "Regression",})
	 public void DICOMcancelupload() throws IOException, InterruptedException 
	 {
		Viewfile();
		Files();
		DIcom();
		AddNewdocument();
		Cancel();
		AddNewdocument();		
	 }
	
	@Test(groups = {"Fail", "Testng", "Smoke" , "Sanity" , "Regression",})
	 public void DICOMemptyupload() throws IOException, InterruptedException 
	 {
		Viewfile();
		Files();
		DIcom();
		AddNewdocument();
		Upload();
	    ToastContainer("error not available for  emptyupload  ", "File uploaded successfully");
		
	 }
	
	@Test(groups = { "Fail","Testng", "Smoke" , "Sanity" , "Regression",})
	 public void nonDICOMuploadfile() throws IOException, InterruptedException 
	 {
		Viewfile();
		Files();
		nonDIcom();
		AddNewdocument();
		nonDicomChoosefile();
		clicksave();;
		Thread.sleep(5000);
	    ToastContainer("failed to upload ", "File uploaded successfully");

	 }
	
	@Test(groups = { "Fail", "Smoke" , "Sanity" , "Regression",})
	 public void nonDICOMcancelupload() throws IOException, InterruptedException 
	 {
		Viewfile();
		Files();
		nonDIcom();
		AddNewdocument();
		Cancel();
		AddNewdocument();		
	 }
	
	@Test(groups = {  "Fail","Smoke" , "Sanity" , "Regression",})
	 public void nonDICOMemptyupload() throws IOException, InterruptedException 
	 { Viewfile();
		Files();
		nonDIcom();
		AddNewdocument();
		Upload();
	    ToastContainer("error not available for  emptyupload  ", "File uploaded successfully");
		
	 }

	
// Insurence 
	@Test(groups = {  "","Smoke" , "Sanity" , "Regression",})
	 public void AAddinsurencevaliddata() throws IOException, InterruptedException 
	 {		Viewfile();	
			Insurance();
			Insuranceprovider("XYZ");
			CompanyID("XYZ1223");
			InsuranceIDnumber("XYZ@123");
			Plan("Active");
			Plancode("Active1");
			Validatyterminatedate();
			Selectcalenderdate();

			Validatystartdate();
			Selectcalenderdate();

			Validatyenddate();
			Selectcalenderdate();

			clicksave();
			ToastContainer("Unable to save insurence", "Insurance added successfully");

	 }
	
	@Test(groups = {  "Sanity" , "Regression",})
	public void BAddinsurenceblankdata() throws IOException, InterruptedException 
	 {
		    Viewfile();			
		    Insurance();
			Insuranceprovider("");
			CompanyID("");
			InsuranceIDnumber("");
			Plan("");
			Plancode("");
			Validatyterminatedate();
			Selectcalenderdate();

			Validatystartdate();
			Selectcalenderdate();

			Validatyenddate();
			Selectcalenderdate();

			clicksave();
			ToastContainer("Unable to Verify blank data insurence", "Please fill all the mandatory fields");

	 }
	
	@Test(groups = { "Fail", "Sanity" , "Regression",})
	public void CAddinsurenceblankdatefield() throws IOException, InterruptedException 
	 {      Viewfile();
			Insurance();
			Insuranceprovider("1111");
			CompanyID("ghfgh");
			InsuranceIDnumber("fghgfh");
			Plan("fghfgh");
			Plancode("fghfghh");
			

			clicksave();
			ToastContainer("Unable to Verify blank data insurence", "Please fill all the mandatory fields");

	 }
	
	
	@Test(groups = {   "Smoke" , "Sanity" , "Regression",})
	public void Deditinsurence() throws IOException, InterruptedException 
	 {      Viewfile();
			Insurance();
			Thread.sleep(1000);
			Editinsuren();
			Insuranceprovider("1sdf111");
			CompanyID("ghfgsdfh");
			InsuranceIDnumber("fghgsdffh");
			Plan("fgsdfhfgh");
			Plancode("fghsdffghh");
			
			clicksave();
			ToastContainer("Unable to Verify editinsurence", "Insurance updated successfully");
	 }

	
	@Test(groups = {      "Regression",})
	public void Ediscardinsurence() throws IOException, InterruptedException 
	 {      
		    Viewfile();
			Insurance();
			Thread.sleep(1000);
			Editinsuren();
			Discardinsuren();
			
			Insuranceprovider("1sdf111");
			Discardinsuren();
		
	 }
	@Test(groups = {   "Sanity" , "Regression",})
	public void Fdeleteinsurence() throws IOException, InterruptedException 
	 {      Viewfile();
			Insurance();
			Thread.sleep(1000);
			deleteinsuren();
			ToastContainer("Unable to Verify deleteinsurence", "Insurance deleted successfully");
	 }
	
//	Clinical AsseSsment
	
/* A. Valid Data Entry	 Fill in all required fields (Blood group, Height, Weight, Head cir, Bonemass hydration  etc.) with valid data.  
 * B. Invalid Data Entry	Leave All fields empty or enter invalid data. 
 * C. Temperature Unitselection (C, F) 
 * D. Valid Temperature Input	Enter a valid temperature value within the expected range (e.g., 0 to 200 degrees Celsius).
 * E. Temperature below 36.0	35.5
 * Temperature between 36.0 and 37
 * Temperature between 37 and 38.0	37
 * Temperature between 38.1 and 39.0	38.5
 * F. Temperature Range Interpretation	Enter temperatures within different ranges (e.g., fever, hypothermia).
 * G. Location Selection	Select a different location.
 * */  
	@Test(groups = { "",  "Smoke" , "Sanity" , "Regression",})
	public void Afillallrecods() throws IOException, InterruptedException 
	 { 
		Clinicalassessment();
		Recordvitalsigns();
		bloodgroup();
		Height ();
		Weight();
		Headcircumference(); 
		Bonemass(); 
		Hydration();
		Savereading();
		ToastContainer("Unable to Verify fillallrecods vital", "Vitals Recorded Successfully");
	 }
	
	@Test(groups = { "Fail", "",  "Sanity" , "Regression",})
	public void Bemptyallrecods() throws IOException, InterruptedException 
	 { 
		Clinicalassessment();
		Recordvitalsigns();
		Savereading();
		ToastContainer("Unable to Verify fillallrecods vital", "Please enter any Vital first");
		Close();
	 }
	public void CTemperatureUnitselection() throws IOException, InterruptedException 
	 { 
		
	 }
	public void DValidTemperatureInput() throws IOException, InterruptedException 
	 { 
		
	 }
	@Test(groups = {"", "Regression",  } , dataProviderClass = DataProviders.class,   dataProvider = "temperature")
	public void ETemperaturedata( String tempreading , String color ) throws IOException, InterruptedException 
	 {  
		Clinicalassessment();
		Temperature ( tempreading , color);
		
	 }
	
	@Test(groups = {"",  "Sanity" , "Regression",  } , dataProviderClass = DataProviders.class,   dataProvider = "pulse")
	public void FPulsedata( String pulsreading , String color ) throws IOException, InterruptedException 
	 {  
		Clinicalassessment();
		Pulse ( pulsreading ,  color);		
	 }
	
	@Test(groups = {"",  "Sanity" , "Regression",  } , dataProviderClass = DataProviders.class,   dataProvider = "bloodpressure")
	public void GBloodpressuredata(String bpsystoreading, String bpdiasystoreading , String color) throws IOException, InterruptedException 
	 {  
		Clinicalassessment();
		Bloodpressure ( bpsystoreading,  bpdiasystoreading ,  color);	
	 }
	
	@Test(groups = {"",  "Sanity" , "Regression",  } , dataProviderClass = DataProviders.class,   dataProvider = "bloodoxygen")
	public void HBloodoxygen(String oxygenreading , String color) throws IOException, InterruptedException 
	 {  
		Clinicalassessment();
		Bloodoxygen ( oxygenreading ,  color);	
	 }
	
	@Test(groups = {"",  "Sanity" , "Regression",  } , dataProviderClass = DataProviders.class,   dataProvider = "respiratoryrate")
	public void IRespiratoryrate(String respiratoryreading , String color) throws IOException, InterruptedException 
	 {  
		Clinicalassessment();
		Respiratoryrate ( respiratoryreading ,  color);	
	 }
	
	@Test(groups = {"",  "Sanity" , "Regression",  } , dataProviderClass = DataProviders.class,   dataProvider = "bloodglucose")
	public void JBloodglucose(String bloodglucoseeading ,String HbA1creeading , String color) throws IOException, InterruptedException 
	 {  
		Clinicalassessment();
		BloodGlucose  ( bloodglucoseeading , HbA1creeading ,color);
	 }
}


