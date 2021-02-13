package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		
		System.out.println("after everything");
		
	}

	@Override
	public void onStart(ITestContext result) {
		
		System.out.println("before everything");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Testcase is skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Testcase id going to execute");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcase is passed");
		
	}
	
	
	

}
