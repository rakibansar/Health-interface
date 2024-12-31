
package healthinterface.doctorweb;

import org.testng.annotations.DataProvider;

public class DataProviders {

		@DataProvider(name= "temperature")
		public Object[][] tdata() 
		{	
			return new Object[][] 
			{	
				{"35", "color: rgb(255, 0, 0);"},             /*Red*/
				{"36","color: rgb(81, 190, 152);"},           /*Green*/
				{"37.2","color: rgb(81, 190, 152);"},         /*Green*/
				{"37.3","color: rgb(238, 179, 0);"},          /*yellow*/
				{"38.1","color: rgb(255, 0, 0);"}             /*Red*/
			};		
			
		}
		@DataProvider(name= "pulse")
		public Object[][] pdata() 
		{	
			return new Object[][] 
			{	
				{"50", "color: rgb(255, 0, 0);"},            /*Red*/
				{"51","color: rgb(238, 179, 0);"},           /*yellow*/
				{"59","color: rgb(238, 179, 0);"},           /*yellow*/
				{"60","color: rgb(81, 190, 152);"},          /*Green*/
				{"85","color: rgb(81, 190, 152);"},          /*Green*/
				{"86","color: rgb(238, 179, 0);"},           /*yellow*/
				{"99","color: rgb(238, 179, 0);"},           /*yellow*/
				{"100","color: rgb(255, 0, 0);"}             /*Red*/
			};		
			
		}
		@DataProvider(name= "bloodpressure")
		public Object[][] bpdata() 
		{	
			return new Object[][] 
			{	
				{"119", "79" ,"color: rgb(81, 190, 152);"},          /*Green*/
				{"120", "79" ,"color: rgb(238, 179, 0);"},           /*Yellow*/
				{"129", "79" ,"color: rgb(238, 179, 0);"},           /*Yellow*/
				{"130", "80" ,"color: rgb(238, 179, 0);"},           /*yellow*/
				{"139", "89" ,"color: rgb(238, 179, 0);"},           /*yellow*/
				{"140", "90" ,"color: rgb(255, 0, 0);"} ,            /*Red*/
				{"180", "120" ,"color: rgb(255, 0, 0);"},            /*Red*/
				{"181", "121" ,"color: rgb(255, 0, 0);"},            /*Red*/
			};		 
			
		}
		@DataProvider(name= "bloodoxygen")
		public Object[][] odata() 
		{	
			return new Object[][] 
			{	
				{"89", "color: rgb(255, 0, 0);"},            /*Red*/				
				{"90","color: rgb(238, 179, 0);"},           /*yellow*/
				{"97","color: rgb(238, 179, 0);"},           /*yellow*/
				{"98","color: rgb(81, 190, 152);"},          /*Green*/
				{"100","color: rgb(81, 190, 152);"},          /*Green*/
			};		
			
		}
		@DataProvider(name= "respiratoryrate")
		public Object[][] rdata() 
		{	
			return new Object[][] 
			{	
				{"7", "color: rgb(255, 0, 0);"},            /*Red*/				
				{"8","color: rgb(238, 179, 0);"},           /*yellow*/
				{"11","color: rgb(238, 179, 0);"},           /*yellow*/
				{"12","color: rgb(81, 190, 152);"},          /*Green*/
				{"16","color: rgb(81, 190, 152);"},          /*Green*/
				{"17","color: rgb(238, 179, 0);"},           /*yellow*/
				{"27","color: rgb(238, 179, 0);"},           /*yellow*/
				{"28", "color: rgb(255, 0, 0);"},            /*Red*/		
			};		
		}

			@DataProvider(name= "bloodglucose")
			public Object[][] bgdata() 
			{	
				return new Object[][] 
				{	
					{"50","0", "color: rgb(255, 0, 0);"},            /*Red*/				
					{"51","1","color: rgb(238, 179, 0);"},           /*yellow*/
					{"69","10","color: rgb(238, 179, 0);"},           /*yellow*/
					{"70","15","color: rgb(81, 190, 152);"},          /*Green*/
					{"99","16","color: rgb(81, 190, 152);"},          /*Green*/
					{"100","18","color: rgb(238, 179, 0);"},           /*yellow*/
					{"125","19","color: rgb(238, 179, 0);"},           /*yellow*/
					{"126","20" ,"color: rgb(255, 0, 0);"},            /*Red*/		
				};		
		}
		

}
