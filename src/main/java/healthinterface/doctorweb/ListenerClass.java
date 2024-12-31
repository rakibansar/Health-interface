
package healthinterface.doctorweb;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import jdk.internal.net.http.common.Log;



public class ListenerClass extends ExtentManager implements ITestListener {
	public static ExtentTest test;

//	Screenshot screen= new Screenshot();
	
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	
	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Pass Test case is: " + result.getName());

		}
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String imgpath = base.screenShot(result.getName());
			test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgpath).build());
		}
	}
;
	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
		}
	}

//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//	}

//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//	}
}
