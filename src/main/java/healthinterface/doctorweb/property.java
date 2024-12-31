package healthinterface.doctorweb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class property extends variables {
	
	public static void readdata() throws IOException {	
	
	
	Properties url = new Properties();
	FileInputStream urlInput = new FileInputStream("C:\\Users\\Rakib Ansar\\eclipse-workspace\\doctorweb\\src\\main\\java\\healthinterface\\doctorweb\\URL.properties");
	url.load(urlInput);
	
	Properties locator = new Properties();
	FileInputStream locatorInput = new FileInputStream("C:\\Users\\Rakib Ansar\\eclipse-workspace\\doctorweb\\src\\main\\java\\healthinterface\\doctorweb\\locators.properties");
	locator.load(locatorInput);
	
	
	pfhealthinterface = url.getProperty("pfhealthinterface");
	
	
//	Home page 
	HIemr = locator.getProperty("HIemr");
	pricing = locator.getProperty("pricing");
	blogs = locator.getProperty("blogs");
	gettheHIapp = locator.getProperty("gettheHIapp");
	login = locator.getProperty("login");
	signup = locator.getProperty("Signup");
	
//	Login page
	
	enterusernameoremail = locator.getProperty("enterusernameoremail");
	enterpassword = locator.getProperty("enterpassword");
	checkremember = locator.getProperty("checkremember");
	loginverify = locator.getProperty("loginverify");
	forgotpassword = locator.getProperty("forgotpassword");
	registernow = locator.getProperty("registernow");
	contactUs = locator.getProperty("contactUs");
	
//	Dashboard Side Menu
	
	Drname = locator.getProperty("Drname");
	Drspeciality = locator.getProperty("Drspeciality");
	Drid = locator.getProperty("Drid");
	
	home = locator.getProperty("home");
	doctors = locator.getProperty("doctors");
	myprofile = locator.getProperty("myprofile");
	myclinic = locator.getProperty("myclinic");
	mypatients = locator.getProperty("mypatients");
	remotemonitoring = locator.getProperty("remotemonitoring");
	mycalendar = locator.getProperty("mycalendar");
	mywallet = locator.getProperty("mywallet");
	mytask = locator.getProperty("mytask");
	medicalforms = locator.getProperty("medicalforms");
	messages = locator.getProperty("messages");
	myusers = locator.getProperty("myusers");
	hiforum = locator.getProperty("hiforum");
	myreviews = locator.getProperty("myreviews");
	analytics = locator.getProperty("analytics");
	settings = locator.getProperty("settings");
	contacthi = locator.getProperty("contacthi");
	logout = locator.getProperty("logout");
	
	
//schedule consultation popup 
	
	scheduleconsultation = locator.getProperty("scheduleconsultation");

	searchpatient = locator.getProperty("searchpatient");
	searchpatientname = url.getProperty("searchpatientname");
	
	selectpatientid = locator.getProperty("selectpatientid");
	selectpatientname = locator.getProperty("selectpatientname");
	selectpatientgender = locator.getProperty("selectpatient");
	selectpatientage = locator.getProperty("selectpatient");


	selctvirtualappointmentcheckbox = locator.getProperty("selctvirtualappointmentcheckbox");

	selectdepartment = locator.getProperty("selectdepartment");
	selectdepartmentspeciality = locator.getProperty("selectdepartmentspeciality");

	selectdoctor = locator.getProperty("selectdoctor");
	selectdoctorbyname = locator.getProperty("selectdoctorbyname");

	appointmentduration = locator.getProperty("appointmentduration");
	selectduration = locator.getProperty("selectduration");

	scheduleappointment = locator.getProperty("scheduleappointment");

	
	bookingdetailtoken = locator.getProperty("bookingdetailtoken");

	bookingdetail = locator.getProperty("bookingdetail");
	afterbokkingdoneconfirmation = locator.getProperty("afterbokkingdoneconfirmation");
	
	newappointmenttime = locator.getProperty("newappointmenttime");
	newappointmentcheckin = locator.getProperty("newappointmentcheckin");
	nextnewappointment = locator.getProperty("nextnewappointment");

	appointmentcancel = locator.getProperty("appointmentcancel");
	appointmentcancelreason = locator.getProperty("appointmentcancelreason");
	selectcancelreason = locator.getProperty("selectcancelreason");

	confirmcancel= locator.getProperty("confirmcancel");
	
	Toastcontainer= locator.getProperty("Toastcontainer");

	
	reschedule= locator.getProperty("reschedule");
	reasondropdown= locator.getProperty("reasondropdown");
	reasonselect= locator.getProperty("reasonselect");
	rescheduletime= locator.getProperty("rescheduletime");
	rescheduleappointment= locator.getProperty("rescheduleappointment");
	
	
	checkin= locator.getProperty("checkin");
	
// Appointment HI EMR
	viewfile= locator.getProperty("viewfile");
	
  //  Viewfile
	editdemographics= locator.getProperty("editdemographics");
	firstname= locator.getProperty("firstname");
	lastName= locator.getProperty("lastName");
	genderdropdown= locator.getProperty("genderdropdown");
	selectgender= locator.getProperty("selectgender");
	primarycontactno= locator.getProperty("primarycontactno");
	emailaddress= locator.getProperty("emailaddress");
	clickdiscard= locator.getProperty("clickdiscard");

	clickdiscard= locator.getProperty("clickdiscard");

  //  care Team
	appointmentdetails= locator.getProperty("appointmentdetails");
	careteamclick= locator.getProperty("careteamclick");
	assign= locator.getProperty("assign");

  //	files
	file= locator.getProperty("file");
	nonDICOM= locator.getProperty("nonDICOM");
	DICOM= locator.getProperty("DICOM");
	addnewdocument= locator.getProperty("addnewdocument");
	choosefile= locator.getProperty("choosefile");
	upload= locator.getProperty("upload");
	cancel= locator.getProperty("cancel");

  //	Insurance
	
	addnewinsurence = locator.getProperty("addnewinsurence");
	insurance = locator.getProperty("insurance");
	insuranceprovider= locator.getProperty("insuranceprovider");
	plan= locator.getProperty("plan");
	companyID= locator.getProperty("companyID");
	insuranceIDnumber= locator.getProperty("insuranceIDnumber");
	plancode= locator.getProperty("plancode");
	validatystartdate= locator.getProperty("validatystartdate");
	validatyterminatedate= locator.getProperty("validatyterminatedate");
	validatyenddate= locator.getProperty("validatyenddate");
	valodatyselectdate= locator.getProperty("valodatyselectdate");

	edit= locator.getProperty("edit");
	delete= locator.getProperty("delete");
	yes= locator.getProperty("yes");
	discard= locator.getProperty("discard");
	
//	Clinicalassessment
	
	close= locator.getProperty("close");
	clinicalassessment= locator.getProperty("clinicalassessment");
	recordVitalSigns= locator.getProperty("recordVitalSigns");
	selectbloodgroup= locator.getProperty("selectbloodgroup");
	bloodgroup = locator.getProperty("bloodgroup");
	height= locator.getProperty("height");
	weight= locator.getProperty("weight");
	headcircumference= locator.getProperty("headcircumference");
	bonemass= locator.getProperty("bonemass");
	hydration= locator.getProperty("hydration");
	temperature= locator.getProperty("temperature");
	degreeC= locator.getProperty("degreeC");
	pulse= locator.getProperty("pulse");
	pbpm= locator.getProperty("pbpm");
	bpsystolic= locator.getProperty("bpsystolic");
	bpdiastolic= locator.getProperty("bpdiastolic");
	mmHg= locator.getProperty("mmHg");
	bloodoxygen= locator.getProperty("bloodoxygen");
	oxygenper= locator.getProperty("oxygenper");
	respiratoryrate= locator.getProperty("respiratoryrate");
	rbpm= locator.getProperty("rbpm");
	bloodglucose= locator.getProperty("bloodglucose");
	mgdl= locator.getProperty("mgdl");
	HbA1c= locator.getProperty("HbA1c");
	
	
	
//MyClinic
	
	addnewclinicbutton = locator.getProperty("addnewclinicbutton");
	savebutton = locator.getProperty("savebutton");
		
	clinicname = locator.getProperty("clinicname");
		
	cliniclicensenumber = locator.getProperty("cliniclicensenumber");
	cliniclicenseexpireydate = locator.getProperty("cliniclicenseexpireydate");
	selectcalenderdate = locator.getProperty("selectcalenderdate");
	
		
	inputboxsearch = locator.getProperty("inputboxsearch");
	clinicstreetaddress1 = locator.getProperty("clinicstreetaddress1");
	clinicstreetaddress2 = locator.getProperty("clinicstreetaddress2");
	selectcountrydropdown = locator.getProperty("selectcountrydropdown");
	selectcountry = locator.getProperty("selectcountry");
	selectstatedropdown = locator.getProperty("selectstatedropdown");
	selectstate = locator.getProperty("selectstate");
	selectcitydropdown = locator.getProperty("selectcitydropdown");
	selectcity = locator.getProperty("selectcity");
	enterpincode = locator.getProperty("enterpincode");
	selectlocation = locator.getProperty("selectlocation");
	setlocation = locator.getProperty("setlocation");

	daysmon = locator.getProperty("daysmon");
	daystue = locator.getProperty("daystue");
	
	sessionfrom = locator.getProperty("sessionfrom");
	sessionfromtime = locator.getProperty("sessionfromtime");
	sessionto = locator.getProperty("sessionto");
	sessiontotime = locator.getProperty("sessiontotime");

	treatment = locator.getProperty("treatment");
	treatmentlist = locator.getProperty("treatmentlist");

	

	selectfacilitydropdown = locator.getProperty("selectfacilitydropdown");
	selectfacility = locator.getProperty("selectfacility");
	imgclick = locator.getProperty("imgclick");

	clinicpath = locator.getProperty("clinicpath");
	deleteclinic = locator.getProperty("deleteclinic");
	
	

	

	
	
	 
	
	
	

		
	

	}
}
