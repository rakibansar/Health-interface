package PageObject;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import healthinterface.doctorweb.DataProviders;
import healthinterface.doctorweb.base;

public class AppointmentHIEMRpage extends base  {

	
// View File 
	
	public static void Viewfile() throws InterruptedException 
	{
		  waitelementminimum(viewfile);
		WebElement Viewfile =  driver.findElement(By.xpath(viewfile));
		clickButton(Viewfile);

    }
	public static void Demographics() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));
		
    }
	
//	   Edit Demographics
	
            public static void Editdemographics() throws InterruptedException 
				{
					Thread.sleep(2000);
					waitelementminimum(editdemographics);
					WebElement Editdemographics = driver.findElement(By.xpath(editdemographics));
					clickButton(Editdemographics);
				}

        	public static void FirstName(String firstnametext ) throws InterruptedException 
        	{
        		waitelementminimum(firstname);
        		WebElement Firstname =  driver.findElement(By.xpath(firstname));
        		Firstname.clear();
        		Thread.sleep(2000);
        		Firstname.sendKeys(firstnametext);
		
            }
        	
        	public static void verifyFirstNameAttribute(String firstnametext) throws InterruptedException 
        	{
				waitelementminimum(clickdiscard);
				WebElement firstnameattribute = driver.findElement(By.xpath(
						"//span[text()='First Name (Prefix)']/following-sibling::span[@class=\"name-value text-capitalize\"]"));
				Assert.assertEquals(firstnametext, firstnameattribute.getText());

            }
        	
			public static void LastName(String lastnametext) throws InterruptedException {
				waitelementminimum(lastName);
				WebElement LastName = driver.findElement(By.xpath(lastName));
				LastName.clear();
				Thread.sleep(2000);
				LastName.sendKeys(lastnametext);

			}

			public static void Gender() throws InterruptedException {
				waitelementminimum(genderdropdown);
				WebElement Genderdropdown = driver.findElement(By.xpath(genderdropdown));

				waitelementminimum(selectgender);
				WebElement Selectgender = driver.findElement(By.xpath(selectgender));
			}

			public static void Primarycontactnumber(String entercontactno) throws InterruptedException {
				waitelementminimum(primarycontactno);
				WebElement Primarycontactno = driver.findElement(By.xpath(primarycontactno));
				Primarycontactno.clear();
				Thread.sleep(2000);
				Primarycontactno.sendKeys(entercontactno);
			}

			public static void verifyPrimarycontactnumberattribute(String entercontactno) throws InterruptedException {
				WebElement primarycontactnumberattribute = driver.findElement(
						By.xpath("//span[text()='Primary Contact No']/following-sibling::span[@class=\"name-value\"]"));
				String Primarycontactnumberattribute = primarycontactnumberattribute.getText();

				Assert.assertTrue(Primarycontactnumberattribute.contains(entercontactno),
						"Primarycontactnumber not match ");
			}

			public static void EmailAddress(String enteremail) throws InterruptedException {
				waitelementminimum(emailaddress);
				WebElement Emailaddress = driver.findElement(By.xpath(emailaddress));
				Emailaddress.clear();
				Thread.sleep(2000);
				Emailaddress.sendKeys(enteremail);
			}

			public static void verifyemailaddressAttribute(String enteremail) throws InterruptedException {
				WebElement emailaddressAttribute = driver.findElement(
						By.xpath("(//span[text()='Email Addres']/following-sibling::span[@class=\"name-value\"])[1]"));
				Assert.assertEquals(enteremail, emailaddressAttribute.getText());
			}

			public static void clicksave() throws InterruptedException {

				waitelementminimum(savebutton);
				WebElement Savebutton = driver.findElement(By.xpath(savebutton));
				clickButton(Savebutton);

			}

			public static void ClickDiscard() throws InterruptedException {

				waitelementminimum(clickdiscard);
				WebElement Clickdiscard = driver.findElement(By.xpath(clickdiscard));
				clickButton(Clickdiscard);

			}

			public static void verifyAppointmentPatientname(String firstlastname) throws InterruptedException {
				WebElement appointmentPatientname = driver.findElement(By.xpath("//span[@class='title']"));
				Assert.assertEquals(appointmentPatientname.getText(), firstlastname);
			}
        	
  public static void CareTeam() throws InterruptedException 
	{
		waitelementminimum(careteamclick);
		WebElement Careteamclick = driver.findElement(By.xpath(careteamclick));
		clickButton(Careteamclick);

	}
	
	     public static void AppointmentDrname() throws InterruptedException 
			{
				waitelementminimum(appointmentdetails);
				WebElement Appointmentdetails = driver.findElement(By.xpath(appointmentdetails));

				String Appintmentdets = Appointmentdetails.getText();

				Pattern pattern = Pattern.compile("Appointment with (.* ?) on");
				Matcher matcher = pattern.matcher(Appintmentdets);

				if (matcher.find()) {
					// Extract the name, date, and time
					String name = matcher.group(1);
					String newname = name.replace(" Ansar", "");

					System.out.println(name);
					String dynamicxpath = "//div[@class=\"grid\"]//div[contains(text(),'" + newname
							+ "')]/parent::div/following-sibling::div/img";

					waitelementminimum(dynamicxpath);

					WebElement Drcheckbox = driver.findElement(By.xpath(dynamicxpath));

					String srcAttribute = Drcheckbox.getAttribute("src");
					boolean isSelected = srcAttribute.contains("box-check.svg");
					if (isSelected) {
						System.out.println("Checkbox is selected.");
					} else {
						System.out.println("Checkbox is not selected.");
						Assert.assertTrue(false);
					}
				} else {
					System.out.println("No match found.");
					Assert.assertTrue(false);

				}
			}

	     public void selectmultiplecareteam() throws InterruptedException 
			{
				Thread.sleep(2000);
				for (int i = 1; i <= 3; i++) {
					String checkboxlocator = "(//div[@class='d-flex m-auto'])[" + i + "]";
					waitelementminimum(checkboxlocator);
					WebElement Careteamcheckbox = driver.findElement(By.xpath(checkboxlocator));
					clickButton(Careteamcheckbox);
					System.out.println(i);
				}

			}
	     
	     public static void Assign() throws InterruptedException 
			{
				waitelementminimum(assign);
				WebElement clickassign = driver.findElement(By.xpath(assign));
				clickButton(clickassign);

			}

	     
	     
  public static void PastEncounters() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));	
    }
	
  
  public static void Files() throws InterruptedException 
	{
		waitelementminimum(file);
		WebElement File = driver.findElement(By.xpath(file));
		clickButton(File);
	}
 
	     public static void AddNewdocument() throws InterruptedException 
			{
				waitelementminimum(addnewdocument);
				WebElement Addnewdocument = driver.findElement(By.xpath(addnewdocument));
				String Message = "Add New Document";
				Assert.assertTrue(Message.contains("Add New Document"), "Add New Document text not found");
				clickButton(Addnewdocument);
			}
	     
	     public static void DicomChoosefile() throws InterruptedException 
			{
				waitelementminimum(choosefile);
				WebElement Choosefile = driver.findElement(By.xpath("//input[@id='imageUpload']"));
				Choosefile.sendKeys(
						"C:\\Users\\Rakib Ansar\\eclipse-workspace\\doctorweb\\src\\test\\Test data\\Testdata\\0002(1).DCM");

				waitelementminimum("//div[@class=\"col-9 d-flex flex-column\"]");
				WebElement uplodedfile = driver.findElement(By.xpath("//div[@class=\"col-9 d-flex flex-column\"]"));
				String uplodedfiletext = uplodedfile.getText();

				Assert.assertTrue(uplodedfiletext.contains("0002(1).DCM"), "File not uploaded ");
			}
	     
	     public static void nonDicomChoosefile() throws InterruptedException 
			{
				waitelementminimum(choosefile);
				WebElement Choosefile = driver.findElement(By.xpath(choosefile));
				clickButton(Choosefile);

				WebElement uploadfile = driver.findElement(
						By.xpath("//input[@id='imageUpload' ][ @accept='.png, .jpg, .jpeg, .pdf, .docx']"));
				uploadfile.sendKeys(
						"C:\\Users\\Rakib Ansar\\eclipse-workspace\\doctorweb\\src\\test\\Test data\\Testdata\\file-sample_100kB.doc");

				waitelementminimum("//div[@class='mb-5 mt-4 ng-star-inserted']");
				WebElement uplodedfile = driver.findElement(By.xpath("//div[@class='mb-5 mt-4 ng-star-inserted']"));
				String uplodedfiletext = uplodedfile.getText();

				Assert.assertTrue(uplodedfiletext.contains("file-sample_100kB.doc"), "File not uploaded ");
			}
	     
	     public static void Upload() throws InterruptedException 
		    {
			     waitelementminimum(upload);
			    WebElement Upload =  driver.findElement(By.xpath(upload));
	 		    clickButton(Upload);
	        }
	     
	     public static void Cancel() throws InterruptedException 
		    {
			     waitelementminimum(cancel);
			    WebElement Cancel =  driver.findElement(By.xpath(cancel));
	 		    clickButton(Cancel);
	        }
	     
	     public static void DIcom() throws InterruptedException 
		    {
			     waitelementminimum(DICOM);
			    WebElement clickDICOM =  driver.findElement(By.xpath(DICOM));
	 		    clickButton(clickDICOM);			
	        }
	     
	     public static void nonDIcom() throws InterruptedException 
		    {
			     waitelementminimum(nonDICOM);
			    WebElement clicknonDICOM =  driver.findElement(By.xpath(nonDICOM));
	 		    clickButton(clicknonDICOM);
	        }
	
	    
	     
	  
	     
	   
	   
	public static void EMR() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));
		
    }
	
	public static void MedicalQuestionnaire() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));
		
    }
	
	public static void ConsentForm() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));
		
    }
	
	
	public static void IDProof() throws InterruptedException 
	{
		  waitelementminimum(Drname);
		WebElement DrName =  driver.findElement(By.xpath(Drname));
		
    }
	
	
  public static void Insurance() throws InterruptedException 
	{
	  Files();
	  Thread.sleep(1000);
		waitelementminimum(insurance);
		WebElement clickinsurance = driver.findElement(By.xpath(insurance));
		clickButton(clickinsurance);

	}

          public static void Editinsuren() throws InterruptedException 
	      {
        	  waitelementminimum(edit);
      		WebElement Edit = driver.findElement(By.xpath(edit));
      		clickButton(Edit);
	      }
          public static void deleteinsuren() throws InterruptedException 
	      {
        	  waitelementminimum(delete);
      		WebElement Deleteinsuren = driver.findElement(By.xpath(delete));
      		clickButton(Deleteinsuren);
      		
      		waitelementminimum(yes);
      		WebElement Yes = driver.findElement(By.xpath(yes));
      		clickButton(Yes);
	      }
          public static void Discardinsuren() throws InterruptedException 
	      {
        	  waitelementminimum(discard);
      		WebElement Discard = driver.findElement(By.xpath(discard));
      		clickButton(Discard);
	      }
	      
	
	      public static void Insuranceprovider(String providername) throws InterruptedException 
			{
				Thread.sleep(2000);
				try {
					WebElement Addnewinsurence = driver.findElement(By.xpath(addnewinsurence));
					if (Addnewinsurence.isDisplayed()) {

						clickButton(Addnewinsurence);
						waitelementminimum(insuranceprovider);
						WebElement Insuranceprovider = driver.findElement(By.xpath(insuranceprovider));
						Insuranceprovider.sendKeys(providername);
					} else {
						
					}

				} catch (Exception e) {
					waitelementminimum(insuranceprovider);
					WebElement Insuranceprovider = driver.findElement(By.xpath(insuranceprovider));
					Insuranceprovider.sendKeys(providername);
				}
			}
   
          public static void Plan(String planname ) throws InterruptedException 
			{
				waitelementminimum(plan);
				WebElement Plan = driver.findElement(By.xpath(plan));
				Plan.sendKeys(planname);
			}

          public static void CompanyID(String companyid) throws InterruptedException 
			{
				Thread.sleep(1000);
				waitelementminimum(companyID);
				WebElement CompanyID = driver.findElement(By.xpath(companyID));
				CompanyID.sendKeys(companyid);	
			}
   
          public static void InsuranceIDnumber(String InsIDnumber) throws InterruptedException 
			{
				waitelementminimum(insuranceIDnumber);
				WebElement InsuranceIDnumber = driver.findElement(By.xpath(insuranceIDnumber));
				InsuranceIDnumber.sendKeys(InsIDnumber);
			}
   
          public static void Plancode(String planc) throws InterruptedException 
			{
				waitelementminimum(plancode);
				WebElement Plancode = driver.findElement(By.xpath(plancode));
				Plancode.sendKeys(planc);
			}
   
          public static void Validatystartdate() throws InterruptedException 
			{    
			 	waitelementminimum(validatystartdate);
				WebElement Validatystartdate = driver.findElement(By.xpath(validatystartdate));
				clickButton(Validatystartdate);
			}
   
          public static void Validatyterminatedate() throws InterruptedException 
			{
				waitelementminimum(validatyterminatedate);
				WebElement Validatyterminatedate = driver.findElement(By.xpath(validatyterminatedate));
				clickButton(Validatyterminatedate);
			}
   
          public static void Validatyenddate() throws InterruptedException 
			{
				waitelementminimum(validatyenddate);
				WebElement Validatyenddate = driver.findElement(By.xpath(validatyenddate));
				
				clickButton(Validatyenddate);
			}
          
          public static void Selectcalenderdate() throws InterruptedException 
			{   Thread.sleep(2000);
				waitelementminimum(valodatyselectdate);
				WebElement Selectcalenderdate = driver.findElement(By.xpath(valodatyselectdate));
				clickButton(Selectcalenderdate);
			}
	
	
   public static void CallHistory() throws InterruptedException 
	{
		waitelementminimum(Drname);
		WebElement DrName = driver.findElement(By.xpath(Drname));

	}
   
   
//   Clinical AsseSsment
 
   public static void Clinicalassessment() throws InterruptedException 
	{
		waitelementminimum(clinicalassessment);
		WebElement ClinicalasseSsment = driver.findElement(By.xpath(clinicalassessment));
		clickButton(ClinicalasseSsment);
	}
          public static void Close() throws InterruptedException 
			{
				waitelementminimum(close);
				WebElement Close = driver.findElement(By.xpath(close));
				clickButton(Close);
			}
             
          public static void Recordvitalsigns() throws InterruptedException 
			{
        	  Thread.sleep(1000);
				waitelementminimum(recordVitalSigns);
				WebElement RecordVitalSigns = driver.findElement(By.xpath(recordVitalSigns));
				clickButton(RecordVitalSigns);
			}
          
          public static void bloodgroup() throws InterruptedException 
          
			{   Thread.sleep(2000);
        	    waitelementminimum(selectbloodgroup);
			
			    WebElement Selectbloodgroup = driver.findElement(By.xpath(selectbloodgroup));
			    clickButton(Selectbloodgroup);
				waitelementminimum(bloodgroup);
				WebElement Bloodgroup = driver.findElement(By.xpath(bloodgroup));
				clickButton(Bloodgroup);
			}
          
          public static void Height () throws InterruptedException 
			{   
        	    waitelementminimum(height);
        	    WebElement Height = driver.findElement(By.xpath(height));
        	    Height.sendKeys("6");
			}
          
          public static void Weight () throws InterruptedException 
			{   
      	        waitelementminimum(weight);
      	        WebElement Weight = driver.findElement(By.xpath(weight));
      	        Weight.sendKeys("75");
			}
          
          public static void Headcircumference () throws InterruptedException 
			{   
    	        waitelementminimum(headcircumference);
    	        WebElement Headcircumference = driver.findElement(By.xpath(headcircumference));
    	        Headcircumference.sendKeys("58");
			}
          
          public static void Bonemass () throws InterruptedException 
			{   
  	            waitelementminimum(bonemass);
  	            WebElement Bonemass = driver.findElement(By.xpath(bonemass));
  	            Bonemass.sendKeys("10");
			}
          public static void Hydration () throws InterruptedException 
			{   
	            waitelementminimum(hydration);
	            WebElement Hydration = driver.findElement(By.xpath(hydration));
	            Hydration.sendKeys("20");
			}
          public static void Savereading() throws InterruptedException {

				waitelementminimum("//span[contains(text(),'Save Reading')]");
				WebElement Savebutton = driver.findElement(By.xpath("//span[contains(text(),'Save Reading')]"));
				clickButton(Savebutton);

			}
			   
          public static void Temperature (String tempreading , String color) throws InterruptedException 
			{   Thread.sleep(2000);
		     	Recordvitalsigns();
	            waitelementminimum(temperature);
	            WebElement Temperature = driver.findElement(By.xpath(temperature));
	            Temperature.clear();
	            Temperature.sendKeys(tempreading);
	            Thread.sleep(2000);
	            Savereading();
	            Thread.sleep(2000);
	            waitelementminimum(degreeC);
	            WebElement DegreeC = driver.findElement(By.xpath(degreeC));
	            String DeegreeC = DegreeC.getAttribute("style");
	            Assert.assertEquals( DeegreeC, color);
			}
	
          public static void Pulse (String pulsreading , String color) throws InterruptedException 
			{   Thread.sleep(2000);
		     	Recordvitalsigns();
	            waitelementminimum(pulse);
		     	WebElement Pulse = driver.findElement(By.xpath(pulse));
		     	Pulse.clear();
		     	Pulse.sendKeys(pulsreading);
		     	Thread.sleep(2000);
	            Savereading();
	            Thread.sleep(2000);
	            waitelementminimum(pbpm);
	            WebElement PBpm = driver.findElement(By.xpath(pbpm));
	            String PBPM = PBpm.getAttribute("style");
	            Assert.assertEquals( PBPM, color);
			}
          public static void Bloodpressure (String bpsystoreading, String bpdiasystoreading , String color) throws InterruptedException 
			{   Thread.sleep(2000);
		     	Recordvitalsigns();
	            waitelementminimum(bpsystolic);
		     	WebElement BPsystolic = driver.findElement(By.xpath(bpsystolic));
		     	BPsystolic.clear();
		     	BPsystolic.sendKeys(bpsystoreading);
		     	waitelementminimum(bpdiastolic);
		     	WebElement BPdiastolic = driver.findElement(By.xpath(bpdiastolic));
		     	BPdiastolic.clear();
		     	BPdiastolic.sendKeys(bpdiasystoreading);
		     	Thread.sleep(2000);
	            Savereading();
	            Thread.sleep(2000);
	            waitelementminimum(mmHg);
	            WebElement bpmmHg = driver.findElement(By.xpath(mmHg));
	            String BPmmHg = bpmmHg.getAttribute("style");
	            Assert.assertEquals( BPmmHg, color);
			}
          
          public static void Bloodoxygen (String oxygenreading , String color) throws InterruptedException 
			{   Thread.sleep(2000);
		     	Recordvitalsigns();
	            waitelementminimum(bloodoxygen);
		     	WebElement Bloodoxygen = driver.findElement(By.xpath(bloodoxygen));
		     	Bloodoxygen.clear();
		     	Bloodoxygen.sendKeys(oxygenreading);
		     	Thread.sleep(2000);
	            Savereading();
	            Thread.sleep(2000);
	            waitelementminimum(oxygenper);
	            WebElement Oxygenper = driver.findElement(By.xpath(oxygenper));
	            String OxygenpPer = Oxygenper.getAttribute("style");
	            Assert.assertEquals( OxygenpPer, color);
			}
          
          public static void Respiratoryrate (String respiratoryreading , String color) throws InterruptedException 
			{   Thread.sleep(2000);
		     	Recordvitalsigns();
	            waitelementminimum(respiratoryrate);
		     	WebElement Respiratoryrate = driver.findElement(By.xpath(respiratoryrate));
		     	Respiratoryrate.clear();
		     	Respiratoryrate.sendKeys(respiratoryreading);
		     	Thread.sleep(2000);
	            Savereading();
	            Thread.sleep(2000);
	            waitelementminimum(rbpm);
	            WebElement Rbpm = driver.findElement(By.xpath(rbpm));
	            String RBPM = Rbpm.getAttribute("style");
	            Assert.assertEquals( RBPM, color);
			}
          
          public static void BloodGlucose  (String bloodglucoseeading ,String HbA1creeading , String color) throws InterruptedException 
			{
				Thread.sleep(2000);
				Recordvitalsigns();
				waitelementminimum(bloodglucose);
				WebElement Bloodglucose = driver.findElement(By.xpath(bloodglucose));
				Bloodglucose.clear();
				Bloodglucose.sendKeys(bloodglucoseeading);
				waitelementminimum(HbA1c);
				WebElement HBA1C = driver.findElement(By.xpath(HbA1c));
				HBA1C.clear();
				HBA1C.sendKeys(HbA1creeading);
				Thread.sleep(2000);
				Savereading();
				Thread.sleep(2000);
				waitelementminimum(mgdl);
				WebElement Mgdl = driver.findElement(By.xpath(mgdl));
				String MGDL = Mgdl.getAttribute("style");
				Assert.assertEquals(MGDL, color);
			     
			    
			
			}
	}
