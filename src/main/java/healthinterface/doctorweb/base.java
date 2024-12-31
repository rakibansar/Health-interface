package healthinterface.doctorweb;


import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class base extends property{
	
    public static Logger log = LogManager.getLogger("base");

	public static void browserlaunch() throws IOException 
	{
		   readdata();
//		   System.setProperty("WebDriver.chrome.driver", "C\\Users\\Rakib Ansar\\eclipse\\chromedriver.exe");
//	       WebDriver driver = new ChromeDriver();
//	       WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
           driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();

		}
	
	@BeforeSuite(groups = {"Smoke" , "Sanity" , "Regression", "Testing", "Fail"})
	public void logConfig() throws IOException {
		ExtentManager.setExtent();
	}
	@AfterSuite(groups = {"Smoke" , "Sanity" , "Regression", "Testing", "Fail"})
	public void Aftersuite() {
		ExtentManager.endReport();
	}
	
//	public static void logintab() throws IOException 
//	{   
//		WebElement logintab =  driver.findElement(By.xpath(loginpath));
//		clickButton(logintab);	
//		System.out.println("Clicked succ");
//	}
	
	public static void webURL(String weburl) throws IOException 
	{  
//	Log.startTestCase("launched browser " + weburl);
		driver.get(weburl);
		System.out.println("WEB url " + weburl);
		
		}
	
//	public static void webURL( String URL ) throws IOException 
//	{   Log.startTestCase("launched browser " + URL);
//		driver.get(URL);
//		System.out.println("WEB url " + URL);
//		}
	
	
	
//	Driver wait 
	public static void waitelement(String path)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));

	}
	
	public static void waitelementminimum(String path)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));

	}
	
	
	public static void fluentWait(WebDriver driver,WebElement element, int timeOut) {
	    Wait<WebDriver> wait = null;
	    try {
	        wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(20))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.click();
	    }catch(Exception e) {
	    }
	}

//	Dropdown handling
	public static void dropdownhandling(String selectpath, String selectvalue)
	{
		waitelement(selectpath);
		WebElement dropdown = driver.findElement(By.xpath(selectpath));
		Select Drop =new Select(dropdown);
		Drop.selectByVisibleText(selectvalue);
	}
//	Switch frame
	public static void switchf()

	{
    driver.switchTo().frame(driver.findElement(By.xpath("")));
 
	}
	
	
//	Click on element 
	public static void clickButton(WebElement buttonElement) {
		
	    try {
	        if(buttonElement.isDisplayed() && buttonElement.isEnabled()) {
	            buttonElement.click();
	            System.out.println("Button clicked successfully" + buttonElement);
	        } else {
	            System.out.println("Button is not visible or enabled " + buttonElement);
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred while clicking the button: " + e.getMessage());
	    }
	}

	public static  boolean type(WebElement ele, String text ) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value " + text);
			} else {
				System.out.println("Unable to enter value " +  text);
			}

		}
		return flag;
	}

	
	public boolean selectBySendkeys(String value,WebElement ele) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Select value from the DropDown");		
			} else {
				System.out.println("Not Selected value from the DropDown");
				// throw new ElementNotFoundException("", "", "")
			}
		}
	}

//	Toaster to check error 
	
	
	public static void checkerror( ) throws InterruptedException {

		Thread.sleep(2000);
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshotserror\\"  + driver.getCurrentUrl() + "_"  + ".png";

		try {
			 WebElement toastcontainer = driver.findElement(By.xpath(Toastcontainer));

			if (toastcontainer.isDisplayed() && toastcontainer.isEnabled()) {

				String errormessage = toastcontainer.getText();
				log.error(errormessage);
				FileUtils.copyFile(source, new File(destination));

			} else 
			{}
				
		} catch (Exception e) {
			System.out.println("No Error");

		}
	}
	
	
	
	public static void ToastContainer( String condition , String expectedWord ) throws InterruptedException
	{			
		Thread.sleep(2000);
		
		
	WebElement toastcontainer = driver.findElement(By.xpath(Toastcontainer));
    Assert.assertTrue(toastcontainer.isDisplayed(), condition);	
    String popupmessage = toastcontainer.getText();
    Assert.assertTrue(popupmessage.contains(expectedWord), "Alert should show "+ expectedWord);

	}
	
	//ScreenShot
	
	
	
	public static String screenShot( String filename) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + filename + "_"  + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
		
	}
	

}
	



	

