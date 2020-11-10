package com.reusable.sap;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;



public class TestListener implements ITestListener {

	Logger log=Logger.getLogger(TestListener.class);

public void onFinish(ITestContext arg0) {
// TODO Auto-generated method stub

}

public void onStart(ITestContext arg0) {
// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
// TODO Auto-generated method stub

}

public void onTestFailure(ITestResult arg0) {
try {
Screenshot_capture.takescreenshot(arg0.getInstanceName());
} catch (IOException e) {
log.error(e.getMessage());
}

}

public void onTestSkipped(ITestResult arg0) {
// TODO Auto-generated method stub

}

public void onTestStart(ITestResult arg0) {
// TODO Auto-generated method stub

}

public void onTestSuccess(ITestResult arg0) {


}
}

